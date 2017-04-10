package All.blockQueueProdCon.Pool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class PoolLoader {
    
    private ArrayList<File> mFiles=new ArrayList<File>();
    private String mEncoding=null;
    private int mCurrentIndex;
    private Boolean mRecursive;
    
    public PoolLoader(){
	initialize();
    }
    
    public void initialize(){
	File dir = new File(System.getProperty("user.dir")+"/src/main/resources/AllprodConPool");
	mCurrentIndex=0;
	mRecursive=Boolean.FALSE;
	addFilesFromDir(dir);
    }
    
    public long getCapa(){
	return mFiles.size();
    }
    
    public void addFilesFromDir(File dir){
	File[] f=dir.listFiles();
	for(int i=0;i<f.length;i++){
	    if(!f[i].isDirectory()){
		mFiles.add(f[i]);
	    }else{
		addFilesFromDir(f[i]);
	    }
	}
    }
    
    public boolean hasNext(){
	return mCurrentIndex<mFiles.size();
    }
    
    public void loadCat(AzCat cat) throws IOException{
	File f=mFiles.get(mCurrentIndex++);
	String text=file2String(f,mEncoding);
	cat.setDocumentText(text);
	
    }
    
    public static String file2String(File file, String fileEncoding) throws IOException{
	if(fileEncoding==null){
	    FileReader reader=new FileReader(file);
	    return reader2String(reader);
	}
	return reader2String(new InputStreamReader(new FileInputStream(file), fileEncoding));
    }
    
    public static String reader2String(Reader reader) throws IOException{	
	StringBuffer strBuffer=new StringBuffer();
	char[] buf=new char[10000];
	int charsRead;
	try{
	    while((charsRead=reader.read(buf))>=0){
		strBuffer.append(buf,0,charsRead);
	    }
	}finally{
	    reader.close();
	}
	return strBuffer.toString();
    }

}
