package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ���±�����
 * �ӿ���̨�����ÿ���ַ�����д�뵽�ı��ļ���
 * �ʼ��һ���ַ���Ϊ�ļ�����֮���ÿһ���ַ�����д�뵽���ļ���
 */
public class PWDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String name = scanner.nextLine();
		FileOutputStream fos = new FileOutputStream(name);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		/**
		 * ������PrintWriterʱ���������(���췽����һ������Ϊ��)
		 * ��ô�ù��췽����֧�ֵڶ���Ϊboolean�͵Ĳ���������ֵΪtrueʱ����ô�;������Զ���ˢ�¹��ܡ�����
		 * ÿ��ʹ��println����д���ַ����󣬻��Զ�flush
		 */
		PrintWriter pw = new PrintWriter(osw,true);
		System.out.println("���������ݣ�");
		String line = null;
		while(true){
			line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("������ϣ�");
		scanner.close();
		pw.close();
		
		
	}
}
