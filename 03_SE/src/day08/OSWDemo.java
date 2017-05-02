package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * �ַ����Ķ�д��λΪ�ַ�---����ı��ļ�
 * �����ַ������Ǹ߼��������Է������Ƕ�д�ַ���
 * 
 * ת����
 * java.io.OutputStreamWriter
 * �������ص��ǿ��԰���ָ�����ַ�������Ҫд�����ַ���ת��Ϊ��Ӧ���ֽں�д���ļ�
 * 
 * OutputStreamWriter����ת����
 * 1.����ת��д���ַ������ַ���
 * 2.��Ϊ������һ���ַ������ֿ��Դ����ֽ��������ԣ���ʱ��Ҫ���ֽ�������Ϊ�ַ���ʱ��Ҫʹ�õ���
 * @author Administrator
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("osw.txt");
		/**
		 * ����ָ���ַ����������ո��ַ���д���ַ�������UTF-8
		 * ��������ڶ������������ǰ���ϵͳĬ�ϵ��ַ���д���ַ���
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("�ú�ѧϰ��");
		osw.write("�������ϣ�");
		
		System.out.println("������ϣ�");
		osw.close();
	}
}
