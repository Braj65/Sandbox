package All.executorprodCon.pool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class PoolLoader {
    
    private ArrayList<File> mFiles=new ArrayList<File>();
    private String mEncoding=null;
    private int mCurrentIndex=0;
    private Boolean mRecursive=false;
    
    public PoolLoader(){
	initialize();
    }
    
    public void initialize(){
	File dir=new File(System.getProperty("user.dir")+"/src/main/resources/AllprodConPool");
	mCurrentIndex=0;
	mRecursive=Boolean.FALSE;
	addFilesFromDir(dir);
    }
    
    public int getCapa(){
	return mFiles.size();
    }
    
    public void addFilesFromDir(File f){
	File[] x=f.listFiles();
	for(File q:x){
	    if(!q.isDirectory())
		mFiles.add(q);
	    else
		addFilesFromDir(q);
	}
    }
    
    public boolean hasNext(){
	return mCurrentIndex<mFiles.size();
    }
    
    public void loadCat(AzCat c) throws IOException{
	File f=mFiles.get(mCurrentIndex++);
	String text=file2String(f);
	c.setDocText(text);
    }
    
    public String file2String(File f) throws IOException{
	if(mEncoding==null){
	    FileReader fr=new FileReader(f);
	    return reader2String(fr);
	}
	return reader2String(new InputStreamReader(new FileInputStream(f)));
	    
    }
    
    public String reader2String(Reader fr) throws IOException{
	StringBuffer strBuf=new StringBuffer();
	char[] buf=new char[1000];
	int charsread;
	try{
	    while((charsread=fr.read(buf))>0){
		strBuf.append(buf,0,charsread);
	    }
	}finally{
	    fr.close();
	}
	
	return strBuf.toString();
    }

}
