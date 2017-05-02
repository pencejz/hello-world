package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader
 * �ַ������������ַ�Ϊ��λ��ȡ����
 * @author Administrator
 *
 */
public class ISRDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		int d = -1;
		while((d=isr.read())!=-1){
			char ch = (char)d;
			System.out.print(ch);
		}
		
		isr.close();
		
		
	}
}
