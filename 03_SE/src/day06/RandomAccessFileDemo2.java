package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ��ж�ȡһ���ֽ�
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "r");
		/**
		 * int read()
		 * ��ȡһ���ֽڣ�����int��ʽ����
		 * ������ֵΪ-1��˵���Զ����ļ�ĩβ
		 */
		int a = raf.read();
		System.out.println(a);
		a = raf.read();
		System.out.println(a);
		
		raf.close();
	}
}
