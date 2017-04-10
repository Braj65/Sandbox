package designCache.cacehtoDisk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import designCache.cacehtoDisk.LFULinkList.CacheNode;

public class PersistingCache<Key, Value> {
    
    private static final Logger LOGGER=LoggerFactory.getLogger(PersistingCache.class);
    public final HashMap<Key, CacheNode<Key, Value>> cache;
    private final File persistenceRootDirectory;
    
    public PersistingCache(HashMap<Key, CacheNode<Key, Value>> cac){
	this.cache=cac;
	persistenceRootDirectory=this.createTempDir();
    }
    
    protected static File createTempDir(){
	File baseDir=new File(System.getProperty("java.io.tmpdir"));
	String baseName=System.currentTimeMillis()+"-";
	int i=0;
	
	for(i=0;i<10;i++){
	    File temp=new File(baseDir, baseName+i);
	    if(temp.mkdir())
		return temp;
	}
	throw new IllegalStateException("Failed to create directory within "
		+ i +" attempts tried( "+baseName +"0 to "
		+baseName+(i-1) + ')');
	
    }
    
    
    public void onRemoval(RemovalNotification<Key, Value> notification){
	try{
	    if(isPersistenceRelevant(notification.getCause())){
		    persistValue(notification.getKey(), notification.getValue(), notification.getFreq());
		}	    
	}catch(IOException e){
	    e.printStackTrace();
	}	
	
    }
    
    public CacheNode<Key, Value> load(Key k){
	Properties props=null;
	CacheNode<Key, Value> node=null;
	try{
	     props=findPersisted(k);
	    if(props!=null){
		deletePersistedIfExistent(k);
		node=new CacheNode(k, props.get("value"), Integer.valueOf(props.get("frequency").toString()));
		cache.put(k, node);
		
	    }
	}catch(Exception e){
	    LOGGER.warn(String.format("Could not load persisted value to the key %s", k), e);
	}
	if(props!=null)
	    return node;
	else
	    return null;
    }
    
    protected boolean isPersistenceRelevant(RemovalCause removalCause){
	return removalCause!=RemovalCause.EXPLICIT
		&& removalCause!=RemovalCause.REPLACED;
    }
    
    protected void persistValue(Key k, Value v, int freq) throws IOException{
	if(!isPersist(k)) return;
	File persistenceFile=pathToFileFor(k);
	persistenceFile.getParentFile().mkdirs();
	FileOutputStream outStream=new FileOutputStream(persistenceFile);
	try{
	    FileLock lock=outStream.getChannel().lock();
	    try{
		persist(k, v, freq, outStream);
	    }finally{
		lock.release();
	    }
	}finally{
	    outStream.close();
	}
    }
    
    protected Properties findPersisted(Key k) throws IOException{
	if(!isPersist(k)) return null;
	File persistenceFile=pathToFileFor(k);
	if(!persistenceFile.exists()) return null;
	FileInputStream inStream=new FileInputStream(persistenceFile);
	try{
	    FileLock lock=inStream.getChannel().lock(0, Long.MAX_VALUE, true);
	    try{
		return readPersisted(k, inStream);
	    }finally{
		lock.release();
	    }
	}catch(Exception e){
	    e.printStackTrace();
	    throw new RuntimeException(e);
	}finally{
	    inStream.close();
	}
    }
    
    protected void deletePersistedIfExistent(Key k){
	File file=pathToFileFor(k);
	file.delete();
    }
    
    protected boolean isPersist(Key k){
	return true;
    }
    
    private File pathToFileFor(Key k){
	List<String> pathSegments=directoryFor(k);
	File persistenceFile=persistenceRootDirectory;
	for(String pathSegment:pathSegments)
	    persistenceFile=new File(persistenceFile, pathSegment);
	
	if(persistenceRootDirectory.equals(persistenceFile))
		throw new IllegalArgumentException();
	
	return persistenceFile;
    }
    
    protected List<String> directoryFor(Key k){
	return Arrays.asList(k.toString());
    }
    
    protected void persist(Key k, Value v, int freq, OutputStream outStream) throws IOException {
	ObjectOutputStream objectStream=new ObjectOutputStream(outStream);
	Properties prop=new Properties();
	prop.put("value", v);
	prop.put("frequency", freq);
	objectStream.writeObject(prop);
	objectStream.flush();
    }
    
    protected Properties readPersisted(Key k, InputStream fis) throws IOException{
	try{
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    Properties node=(Properties) ois.readObject();
	    return node;	    
	}catch(ClassNotFoundException e){
	    throw new RuntimeException(String.format("Serialized version assigned by %s is not valid", k), e);
	}
	
    }
    
    public void persistAll(LinkedList<LinkedList<CacheNode<Key, Value>>> freqList) throws IOException{
	Set<Key> keys= cache.keySet();
	Iterator<Key> keyIt=keys.iterator();
	FileOutputStream outStream=null;
	while(keyIt.hasNext()){
	    Key k=keyIt.next();
	    CacheNode node=cache.get(k);
	    File persistenceFile=pathToFileFor(k);
	    outStream=new FileOutputStream(persistenceFile);
	    try{
		FileLock lock=outStream.getChannel().lock();
		try{
		    persist(k, (Value)node.v, node.frequency, outStream);
		}finally{
		    lock.release();
		}
	    }finally{
		outStream.close();
	    }
	}
    }
    
    public void deleteAllPersisted(){
	for(File file:persistenceRootDirectory.listFiles()){
	    file.delete();
	}
    }

}
 



















