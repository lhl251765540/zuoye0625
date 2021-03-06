package cc.openhome;

import java.io.*;

import org.xml.sax.InputSource;


public class CharUtil2 {
	
	public static void dump(Reader src,Writer dest)throws IOException{
		
		try(Reader input= src;Writer output=dest){
			char[] data= new char[1024];
			int length;
			while((length=input.read(data))!=-1){
				
				output.write(data,0,length);
			}
		
		}
		
	}
	public static void dump(InputStream src,OutputStream dest,String charset)throws IOException{
		
		dump(
				new InputStreamReader(src,charset),
				new OutputStreamWriter(dest,charset)
				);
		
	}
          
	public static void dump(InputStream src,OutputStream dest)throws IOException{
		
		dump (src,dest,System.getProperty("file.encoding"));
		
	}
}
