package day06;

import java.io.File;

/**
 * ʹ��File����Ŀ¼��ɾ��Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo4 {

	public static void main(String[] args) {
		/**
		 * �ڵ�ǰ�ļ��´�����ΪDemo��Ŀ¼
		 * mkdir() ��������Ŀ¼
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("Ŀ¼������ϣ�");
		}else{
			System.out.println("��Ŀ¼�Ѵ��ڣ�");
		}
		/**
		 * �ڵ�ǰĿ¼�´���a/b/c/d/e/fĿ¼
		 * mkdirs() �����༶Ŀ¼
		 */
		File dir1 = new File("a/b/c/d/e/f");
		if(!dir1.exists()){
			dir1.mkdirs();
			System.out.println("Ŀ¼������ϣ�");
		}else{
			System.out.println("��Ŀ¼�Ѿ����ڣ�");
		}
		/**
		 * ɾ��Ŀ¼
		 */
		if(dir.exists()){
			/*
			 * ɾ��Ŀ¼��һ��Ҫ�󣬸�Ŀ¼�����ǿ�Ŀ¼����ɾ��
			 */
			dir.delete();
			System.out.println("Ŀ¼ɾ����ϣ�");
		}else{
			System.out.println("��Ŀ¼�����ڣ�");
		}
		
	}
}
