package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用文件过滤器来获取一个目录下满足条件的部分子项
 * @author Administrator
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		File dir = new File(".");
		//使用一次，就采用匿名内部类
		FileFilter filter = new FileFilter(){
			//添加过滤条件的方法
			@Override
			public boolean accept(File file) {
				//条件---是文件即可
//				return file.isFile(); 
				//以.开头的子项
				return file.getName().startsWith(".");
			}
		};
		//遍历所有子项---获取满足条件的子项名
		File[] subs = dir.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub.getName());
		}
		
		
		
	}
}
