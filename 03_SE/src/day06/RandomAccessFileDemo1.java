package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ר��������д�ļ�����
 * �����ָ����ļ����ݽ��ж�д����
 * @author Administrator
 *
 */
public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		/**
		 * "raf.dat"---��һ������Ϊ�ļ��������û�У���ᴴ�����ļ�
		 * RandomAccessFile����������ģʽ��
		 * r:ֻ��
		 * rw���ɶ���д
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/**
		 * void write(int d)
		 * дһ���ֽڣ�д�����ָ����intֵ����Ӧ�ĵ�2���ƵĵͰ�λ
		 */
		raf.write(255);
		System.out.println("д����ϣ�");
		
		raf.close();
	}
}
