package day08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally����
 * @author Administrator
 *
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("fos.txt");
			fos.write("���".getBytes());
		} catch (Exception e) {
			System.out.println("��������");
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					
				}
			}
		}
		
		System.out.println("д����ϣ�");
		
		
		
	}//main
}
