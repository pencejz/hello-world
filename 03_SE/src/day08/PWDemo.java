package day08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java.io.PrintWiter 缓冲字符输出流
 * 特点：可以以行为单位写出字符串
 *     具有自动行刷新的功能
 * 
 * java.io.BufferedReader 缓冲字符输入流
 */
public class PWDemo {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * 提供了直接对文件写出操作的构造方法：
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		
		pw.println("好好学习");
		pw.println("天天向上");
		
		System.out.println("写入完毕！");
		pw.close();
		
		
	}
}
