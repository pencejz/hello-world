package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流
 * 特点：可以以行为单位读取字符串
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 将当前源程序读取出来，并输入到控制台
		 */
		FileInputStream fis = new FileInputStream("src"+File.separator+"day08"+File.separator+"BRDemo.java"); //读字节 
		InputStreamReader isr = new InputStreamReader(fis); //读字符 
		BufferedReader br = new BufferedReader(isr); //读行
		/**
		 * String readLine()
		 * BufferedReader提供了读取一行字符串的方法
		 * 该方法会连续读取若干字符串，直到遇到换行符为止，然后将换行符之前的所有字符组成一个字符串返回
		 * 但是该字符串不会有换行符
		 * 若该方法返回null，说明EOF
		 */
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		
		
	}
}
