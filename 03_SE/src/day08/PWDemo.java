package day08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java.io.PrintWiter �����ַ������
 * �ص㣺��������Ϊ��λд���ַ���
 *     �����Զ���ˢ�µĹ���
 * 
 * java.io.BufferedReader �����ַ�������
 */
public class PWDemo {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * �ṩ��ֱ�Ӷ��ļ�д�������Ĺ��췽����
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		
		pw.println("�ú�ѧϰ");
		pw.println("��������");
		
		System.out.println("д����ϣ�");
		pw.close();
		
		
	}
}
