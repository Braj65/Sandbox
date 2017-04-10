package All.sephamoreProdCon.pool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PoolLoader {
    
    private List<File> mFiles=new ArrayList<File>();
    private String mEncoding=null;
    private int mCurrentIndex=0;
    private Boolean mRecurse=false;
    
    public PoolLoader(){
	initialize();
    }
    
    public void initialize(){
	File dir=new File(System.getProperty("user.dir")+"/src/main/resources/AllprodConPool");
	mCurrentIndex=0;
	mRecurse=Boolean.FALSE;
	addFilesFromDir(dir);
    }
    
    public void addFilesFromDir(File f){
	File[] d=f.listFiles();
	for(File x:d){
	    if(!x.isDirectory())
		mFiles.add(x);
	    else
		addFilesFromDir(x);
	}
    }
    
    public long getCapa(){
	return mFiles.size();
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
	char[] chrBuf=new char[1000];
	int chrRead=0;
	try{
	    while((chrRead=fr.read(chrBuf))>0){
		    strBuf.append(chrBuf, 0, chrRead);
		}	    
	}finally{
	    fr.close();
	}
	return strBuf.toString();
	
    }

}
