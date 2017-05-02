package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * 字符流的读写单位为字符---针对文本文件
 * 所有字符流都是高级流，可以方便我们读写字符串
 * 
 * 转换流
 * java.io.OutputStreamWriter
 * 该留的特点是可以按照指定的字符集，将要写出的字符串转换为对应的字节后写入文件
 * 
 * OutputStreamWriter叫做转换流
 * 1.可以转换写出字符串的字符集
 * 2.因为该流是一个字符流，又可以处理字节流，所以，有时候要将字节流处理为字符流时需要使用到它
 * @author Administrator
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("osw.txt");
		/**
		 * 可以指定字符集，并按照该字符集写出字符串。如UTF-8
		 * 若不传入第二个参数，则是按照系统默认的字符集写出字符串
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("好好学习！");
		osw.write("天天向上！");
		
		System.out.println("输入完毕！");
		osw.close();
	}
}
