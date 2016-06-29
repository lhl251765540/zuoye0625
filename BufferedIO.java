
package cc.openhome;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.omg.CORBA.portable.OutputStream;

public class BufferedIO {
	
	public static void dump(InputStream src,outputStream dest)
	             throws IOException{
		
		try(InputStream input=new BufferedInputStream(src);OutputStream output=new BufferedOutputStream(dest)){
			byte[] data= new byte[1024];
			int length;
			
			while((length=input.read(data))!=-1){
				output.write(data,0,length);
			}
		}
				
		
	}
}
