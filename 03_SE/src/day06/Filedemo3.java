package day06;

import java.io.File;

/**
 * ʹ��Fileɾ���ļ�
 * @author Administrator
 *
 */
public class Filedemo3 {

	public static void main(String[] args) {
		/**
		 * ɾ����ǰĿ¼�е�test.txt�ļ�
		 */
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ����");
		}else{
			System.out.println("���ļ������ڣ�");
		}
		
		
		
		
	}
}
