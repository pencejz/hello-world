package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ������д
 * ����Ҫ��дЧ�ʣ���Ҫ���ÿ�ζ�д�����������Ӷ����ٶ�д�������ﵽ
 * @author Administrator
 *
 */
public class RandomAccessFileDemo4 {

	public static void main(String[] args) throws IOException {
		//Ŀ���ļ�
		RandomAccessFile raf = new RandomAccessFile("��������.gif", "r");
		//Դ�ļ�
		RandomAccessFile raf1 = new RandomAccessFile("�������˸��ư�.gif", "rw");
		
		byte[] buf = new byte[1024*10]; //10k
		int len = -1;
		/**
		 * int read(byte[] d)
		 * ���Զ�ȡ�������ֽ����ܳ��ȵ��ֽ����������뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ���
		 * ������ֵΪ-1���ͱ�ʾ��ȡ�����ļ�ĩβ(��һ��û�ж�ȡ���ļ�)
		 */
		long start = System.currentTimeMillis();
		while((len=raf.read(buf))!=-1){
			/**
			 * void write(byte[] d)
			 * ���������ֽ����������е��ֽ���һ����д�뵽�ļ���
			 * 
			 * void write(byte[] d,int start,int len)
			 * ���������ֽ������д��±�Ϊstart����ʼ������len���ֽ�д��
			 */
			raf1.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		raf.close();
		raf1.close();		
	}
}
