package All.ProducerConsumer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import All.Pool.AzCat;

public class PoolLoader {

    private ArrayList<File> mFiles = null;
    private String mEncoding = null;
    private int mCurrentIndex;
    private Boolean mRecursive;
    
    public PoolLoader(){
	initialize();
    }

    public void initialize() {
	File dir = new File(System.getProperty("user.dir")+"/src/main/resources/AllprodConPool");
	mCurrentIndex = 0;
	mFiles = new ArrayList<File>();
	mRecursive = Boolean.FALSE;
	addFilesFromDir(dir);
    }

    private void addFilesFromDir(File dir) {
	File[] files = dir.listFiles();
	for (int i = 0; i < files.length; i++) {
	    if (!files[i].isDirectory()) {
		mFiles.add(files[i]);
	    } else if (mRecursive) {
		addFilesFromDir(files[i]);
	    }
	}
    }
    
    public boolean hasNext(){
	return mCurrentIndex<mFiles.size();
    }
    
    public void getNext(AzCat cat) throws IOException{
	File f=mFiles.get(mCurrentIndex++);
	String text= file2String(f, mEncoding);
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
