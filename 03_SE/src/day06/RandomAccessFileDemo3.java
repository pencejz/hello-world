package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ��ĸ���
 * @author Administrator
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		//Ŀ���ļ�
		RandomAccessFile raf = new RandomAccessFile("��������.gif", "r");
		//Դ�ļ�
		RandomAccessFile raf1 = new RandomAccessFile("�������˸��ư�.gif", "rw");
		
		int d = -1;
		long starts = System.currentTimeMillis();
		while((d=raf.read())!=-1){
			raf1.write(d);
			System.out.print(d);
		}
		long ends = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(ends-starts)+"����");
		raf.close();
		raf1.close();
		
	}
}
