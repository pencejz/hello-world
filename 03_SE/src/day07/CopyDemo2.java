package day07;

import java.io.BufferedInputStream; //���뻺����
import java.io.BufferedOutputStream; //���������
import java.io.FileInputStream; //�ֽ�������
import java.io.FileOutputStream; //�ֽ������
import java.io.IOException;

/**
 * ʹ�û������ӿ��дЧ��
 * ��������һ�Ը߼�����ʹ�����ǿ�����߶�дЧ��
 * �߼������߼��������������������߼������ܶ������ڣ���Ϊû������
 * ʹ�ø߼�����Ŀ�ľ���Ϊ�˽��ĳЩ��д�����ĸ��Ӷȣ������ǵĶ�д����
 * �ͼ���������Դ��ȷ����ʵ�����д���ݵ���
 * ��д����һ����Ҫ�ͼ���������һ����Ҫʹ�ø߼���
 * @author Administrator
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("��������.gif");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("�������˸��ư�.gif");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = -1;
		/*
		 * �������ڲ�ά����һ���ֽ�������Ϊ���塣
		 * �����ǵ���read()������ȡһ���ֽ�ʱ����������һ���Զ�ȡ�����ֽڲ����뻺����
		 * Ȼ�󷵻ص�һ���ֽڣ��������ٴε���read()����ʱ�������������������еڶ����ֽڷ���
		 * ֱ�������ֽڶ����غ󣬲Ż��ٴη���ʵ�ʵĶ�ȡ��������ȡһ���ֽڣ����뻺����
		 * ���Ա����ϻ���ͨ��һ���Զ�ȡ�����ֽڣ����ٶ�ȡ������߶�ȡЧ��
		 */
		long start = System.currentTimeMillis();
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		bis.close();
		bos.close();
		
	}
}
