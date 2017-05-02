package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 使用PrinterWriter处理其他流
 * PrintWriter提供了处理其他流的相关构造方法，既可以处理字节流，又可以处理字符流
 * 
 * PrintWriter(OutputStream out)
 * PrintWriter(Writer out)
 * 
 * @author Administrator
 *
 */
public class PWDemo2 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fos = new FileOutputStream("pw2.txt"); //写入文件
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8"); //转化为utf-8字符集
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("好好学习！");
		pw.println("天天向上！");
		
		System.out.println("输入完毕！");
		pw.close();
	}
}
