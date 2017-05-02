package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ�������
 * �ص㣺��������Ϊ��λ��ȡ�ַ���
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰԴ�����ȡ�����������뵽����̨
		 */
		FileInputStream fis = new FileInputStream("src"+File.separator+"day08"+File.separator+"BRDemo.java"); //���ֽ� 
		InputStreamReader isr = new InputStreamReader(fis); //���ַ� 
		BufferedReader br = new BufferedReader(isr); //����
		/**
		 * String readLine()
		 * BufferedReader�ṩ�˶�ȡһ���ַ����ķ���
		 * �÷�����������ȡ�����ַ�����ֱ���������з�Ϊֹ��Ȼ�󽫻��з�֮ǰ�������ַ����һ���ַ�������
		 * ���Ǹ��ַ��������л��з�
		 * ���÷�������null��˵��EOF
		 */
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		
		
	}
}
