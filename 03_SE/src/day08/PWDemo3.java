package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 记事本功能
 * 从控制台输入的每行字符串都写入到文本文件中
 * 最开始的一行字符串为文件名，之后的每一行字符串都写入到该文件中
 */
public class PWDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String name = scanner.nextLine();
		FileOutputStream fos = new FileOutputStream(name);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		/**
		 * 当创建PrintWriter时处理的是流(构造方法第一个参数为流)
		 * 那么该构造方法就支持第二个为boolean型的参数，若该值为true时，那么就具有了自动行刷新功能。即：
		 * 每当使用println方法写出字符串后，会自动flush
		 */
		PrintWriter pw = new PrintWriter(osw,true);
		System.out.println("请输入内容：");
		String line = null;
		while(true){
			line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("输入完毕！");
		scanner.close();
		pw.close();
		
		
	}
}
