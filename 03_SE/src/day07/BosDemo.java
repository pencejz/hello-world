package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author Administrator
 *
 */
public class BosDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("box.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "���죬��������裡";
		bos.write(str.getBytes());
		/**
		 * void flash()
		 * ǿ�ƽ��������л���������ֽ�һ����д��
		 * Ƶ���ĵ��ø÷��������д���Ĵ������Ӷ�����д����Ч��
		 * ����������ȴ�ܱ�֤д���ļ�ʱ��
		 */
		bos.flush();
		
		System.out.println("������ϣ�");
		
		bos.close();
		fos.close();
	}
}
