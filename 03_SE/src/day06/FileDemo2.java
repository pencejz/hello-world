package day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File�����ļ�
 * @author Administrator
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/**
		 * �ڵ�ǰĿ¼�´���һ����Ϊ��test.txt���ļ�
		 * ./ ���Բ�д��Ĭ�Ͼ��ڵ�ǰĿ¼
		 * boolean exidts() �жϵ�ǰFile���ļ���Ŀ¼�Ƿ���ʵ����
		 * 
		 */
		File file = new File("."+File.separator+"demo.txt");
		if(!file.exists()){
			file.createNewFile(); //�����ļ�
			System.out.println("�ļ�������ϣ�");
		}else{
			System.out.println("�ļ��Ѿ����ڣ�");
		}
		
	}
}
