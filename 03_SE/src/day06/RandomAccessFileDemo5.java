package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile�ṩ�˷����д�����������͵ķ���
 * �Լ�ָ��Ĳ�����ͨ���ò������Է���Ķ�д�ļ�������λ��
 * @author Administrator
 *
 */
public class RandomAccessFileDemo5 {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/**
		 * long getFilePointer()
		 * ��õ�ǰRAFָ���λ��
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos = "+pos);
		
		//��һ��int���ֵд���ļ�
		int max = Integer.MAX_VALUE;
		/*
		 *                              vvvvvvvv
		 * 01111111 111111111 111111111 11111111
		 * 
		 * raf.write(max>>>24);
		 * raf.write(max>>>16);
		 * raf.write(max>>>8);
		 * raf.write(max);
		 */
		/**
		 * void write(int d)
		 * һ��д��һ���ֽڣ���������intֵ��Ӧ��2����д�뵽�ļ��У�����Ϊ�ַ���2����
		 * ��raf.write(97);---���ֵΪ��a
		 * 
		 * void writeInt(int d)
		 * һ����д���ĸ��ֽڣ���������intֵ��Ӧ��2����д�뵽�ļ���
		 * ��raf.write(97);---���ֵΪ��97
		 */
		raf.writeInt(Integer.MAX_VALUE);
		System.out.println("pos = "+raf.getFilePointer());
		//д��һ��longֵ
		raf.writeLong(1234L);
		System.out.println("pos = "+raf.getFilePointer());
		//д��һ��doubleֵ
		raf.writeDouble(123.123);
		System.out.println("pos = "+raf.getFilePointer());
		/**
		 * void seek(long pos)
		 * ��ָ���ƶ����ļ���ʼ��
		 */
		//��ָ���Ƶ��ļ���ʼ��
		raf.seek(0);
		/**
		 * ��ȡintֵ
		 * ����4���ֽڣ�����Ӧ��intֵ����
		 */
		int i = raf.readInt();
		System.out.println("max = "+i);
		
		long l = raf.readLong();
		System.out.println("l = "+l);
		
		double d = raf.readDouble();
		System.out.println("d = "+d);
		/*
		 * 2147483647 123L     123.123
		 * [int]      [long]   [double]
		 * 0123       45678901 23456789 �ֽ���
		 */
		raf.seek(4);
		long l1 = raf.readLong();
		System.out.println("l1 = "+l1);
		
		System.out.println("д����ϣ�");
		raf.close();
		
		
		
	}
	
}
