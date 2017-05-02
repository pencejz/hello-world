package day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建文件
 * @author Administrator
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下创建一个名为：test.txt的文件
		 * ./ 可以不写，默认就在当前目录
		 * boolean exidts() 判断当前File的文件或目录是否真实存在
		 * 
		 */
		File file = new File("."+File.separator+"demo.txt");
		if(!file.exists()){
			file.createNewFile(); //创建文件
			System.out.println("文件创建完毕！");
		}else{
			System.out.println("文件已经存在！");
		}
		
	}
}
