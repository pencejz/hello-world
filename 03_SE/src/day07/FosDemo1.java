package day07;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileOutputStream
 * �ļ��ֽ����������һ���ͼ���
 * �����ֽ�����д�뵽ָ���ļ���
 * @author Administrator
 *
 */
public class FosDemo1 {

	public static void main(String[] args) throws IOException {
		/**
		 * FileOutputStream���ù��췽����
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * �������췽��������FOS�ĸ���д����������
		 * ͨ�����������д������֮ǰ���Ὣ���ļ���ԭ�е�ȫ������������ٿ�ʼͨ�������д������
		 * 
		 * ��֧�����صĹ��췽�����ù��췽������һ��boolean�Ͳ�������ֵΪtrueʱ������׷��д����������
		 * ͨ������д�����ݻ�׷�ӵ��ļ�ĩβ
		 * 
		 * ��fos.txt�ļ���д������
		 */
		//���ǲ���
//		FileOutputStream fos = new FileOutputStream("fos.txt");
		//׷�Ӳ���
		FileOutputStream fos = new FileOutputStream("fos.txt",true);

		String str = "Ħ��Ħ����ħ��Ĳ���";
		//���ַ���ת���ɶ�Ӧ��2�����ֽ�
		byte[] data = str.getBytes(); //Ĭ��GK��(������)��һ������2�ֽڣ�һ��Ӣ��1�ֽ�
		//byte[] data = str.getBytes("UTF-8"); //һ������3�ֽڣ�һ��Ӣ��1�ֽ�
		fos.write(data);
		System.out.println("д����ϣ�");
		fos.close();
		
		
	}
}
