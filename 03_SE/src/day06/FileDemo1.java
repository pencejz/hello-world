package day06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * java.io.File
 * �����ÿһ��ʵ�����ڱ�ʾ��ǰ����ϵͳ���ļ�ϵͳ���һ���ļ������ļ�Ŀ¼������Ӳ���ϵ�һ���ļ�����Ŀ¼
 * ʹ��File���ԣ�
 * �����ļ���Ŀ¼��������Ϣ�����ļ����֡��ļ���С��
 * �����ļ�����Ŀ¼���紴���ļ���ɾ���ļ���
 * ����Ŀ¼������Ŀ
 * ���ǲ����ԣ������ļ�����
 * 
 * ʹ��·��ʱ�����ʹ�����·�������������·��������ϵͳ���죬�����Ͳ����ڿ�ƽ̨
 * Ŀ¼�ָ��(\-windows,/-linux)Ӧ��ʹ��File��ĳ���separator
 * @author Administrator
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		/*
		 * File���еĳ���separator��ʾ�ָ��
		 * ��Windows�б�ʾΪ\��ͬʱҲ֧��/
		 * ��linux�б�ʾΪ/
		 */
		File file = new File("."+File.separator+"demo.txt");
		
		String name = file.getName();			//��ȡ�ļ���
		System.out.println("�ļ�����"+name);
		
		long length = file.length();			//��ȡ�ļ���С
		System.out.println("�ļ���С��"+length);
		
		boolean isFile = file.isFile();			//�жϵ�ǰFile�����ʾ���Ƿ����ļ�
		System.out.println("���ļ��� "+isFile);
		
		boolean isDir = file.isDirectory();		//�Ƿ�ΪĿ¼
		System.out.println("��Ŀ¼��"+isDir);
		
		boolean canRead = file.canRead();		//�Ƿ�ɶ�
		System.out.println("�ɶ���"+canRead);
		
		boolean canWrite = file.canWrite();		//�Ƿ��д
		System.out.println("��д��"+canWrite);
		
		boolean isHidden = file.isHidden();		//�Ƿ��������ļ�
		System.out.println("�����ļ���"+isHidden);
		
		long time = file.lastModified();		//����޸�ʱ��(������)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String str = sdf.format(time);
		System.out.println(str);
		
	}
}
