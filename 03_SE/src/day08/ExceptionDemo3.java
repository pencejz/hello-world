package day08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally操作
 * @author Administrator
 *
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("fos.txt");
			fos.write("你好".getBytes());
		} catch (Exception e) {
			System.out.println("出错啦！");
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					
				}
			}
		}
		
		System.out.println("写入完毕！");
		
		
		
	}//main
}
