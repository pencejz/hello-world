package day06;

import java.io.File;

/**
 * ��File��ʾ����һ��Ŀ¼����ô�����Բ鿴���Ŀ¼����������������(��������ļ���Ŀ¼)
 * @author Administrator
 *
 */
public class FileDemo5 {

	public static void main(String[] args) {
		/*
		 * �鿴��ǰĿ¼�µ���������
		 */
		File dir = new File("./a");
//		if(dir.isDirectory()){
//			File[] subs = dir.listFiles();
//			for(File sub : subs){
//				System.out.println((sub.isFile()?"�ļ���":"Ŀ¼��")
//			                       +sub.getName());
//			}
//		}else{
//			System.out.println("�ö������ļ���");
//		}
//		
		delete(dir);
		
		
		
	} //main
	
	/**
	 * ��������File��ʾ���ļ���Ŀ¼ɾ���ķ���
	 */
	public static void delete(File dir){
		
		if(dir.isDirectory()){				//�ж�dir�Ƿ�ΪĿ¼,�����ļ���ֱ��ɾ��
			File[] subs = dir.listFiles();	//��ȡdirĿ¼������Ŀ¼���ļ������ֵ�����
			for(File sub : subs){			//����dirĿ¼������ȡdirĿ¼���������ݵ�����
				delete(sub);				//�ݹ����(��Ŀ¼Ϊ��ʱ����Ϊ����)
			}
			dir.delete();					//ɾ��Ŀ¼
			System.out.println("ɾ��Ŀ¼��"+dir);
			
		}else{
			dir.delete();					//ɾ���ļ�
			System.out.println("ɾ���ļ���"+dir);
		}
		
	}

	/**
	 * �õݹ�ʵ�ִ�1+2+3+...+100
	 */

	
}
