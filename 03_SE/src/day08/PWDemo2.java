package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * ʹ��PrinterWriter����������
 * PrintWriter�ṩ�˴�������������ع��췽�����ȿ��Դ����ֽ������ֿ��Դ����ַ���
 * 
 * PrintWriter(OutputStream out)
 * PrintWriter(Writer out)
 * 
 * @author Administrator
 *
 */
public class PWDemo2 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fos = new FileOutputStream("pw2.txt"); //д���ļ�
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8"); //ת��Ϊutf-8�ַ���
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("�ú�ѧϰ��");
		pw.println("�������ϣ�");
		
		System.out.println("������ϣ�");
		pw.close();
	}
}
