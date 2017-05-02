package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * ʹ���ļ�����������ȡһ��Ŀ¼�����������Ĳ�������
 * @author Administrator
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		File dir = new File(".");
		//ʹ��һ�Σ��Ͳ��������ڲ���
		FileFilter filter = new FileFilter(){
			//��ӹ��������ķ���
			@Override
			public boolean accept(File file) {
				//����---���ļ�����
//				return file.isFile(); 
				//��.��ͷ������
				return file.getName().startsWith(".");
			}
		};
		//������������---��ȡ����������������
		File[] subs = dir.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub.getName());
		}
		
		
		
	}
}
