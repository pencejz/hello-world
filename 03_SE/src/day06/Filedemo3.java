package day06;

import java.io.File;

/**
 * 使用File删除文件
 * @author Administrator
 *
 */
public class Filedemo3 {

	public static void main(String[] args) {
		/**
		 * 删除当前目录中的test.txt文件
		 */
		File file = new File("test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已删除！");
		}else{
			System.out.println("该文件不存在！");
		}
		
		
		
		
	}
}
