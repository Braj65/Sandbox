package com.pega.delete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Client {
	
	public static void main(String[] args) throws Exception {
		File f=new File("C:/Users/sahob1/Downloads/youtube-dl/Pluralsight/Intermediate.txt");
		File write=new File("C:/Users/sahob1/Downloads/youtube-dl/Pluralsight/Result.txt");
		Reader reader=new FileReader(f);
		Writer writer=new FileWriter(write);
		BufferedReader buffReader=new BufferedReader(reader);
		BufferedWriter buffWriter=new BufferedWriter(writer);
		String topic=null;
		String author=null;
		
		while((topic=buffReader.readLine())!=null){
			topic=topic.replaceAll(",", "****");
			author=buffReader.readLine();
			author=author.replaceAll("\u00b7", ",");
			author=author.replace("(","");
			author=author.replace(")","");
			if(author.lastIndexOf(",")==author.length()-1){
				author=author.substring(0, author.length()-1);
			}
			System.out.println(topic+","+author);
			buffWriter.write(topic+","+author);
			buffWriter.newLine();
			buffWriter.flush();
		}
		buffReader.close();
		buffWriter.close();
		
	}	

}
