package day07;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.FileIntputStream
 * @author Administrator
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte[] data = new byte[50];
		
		int len = fis.read(data);
		String str = new String(data,0,len);
		//String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
		
	}
}
