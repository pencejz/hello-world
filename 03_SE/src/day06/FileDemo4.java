package day06;

import java.io.File;

/**
 * 使用File创建目录、删除目录
 * @author Administrator
 *
 */
public class FileDemo4 {

	public static void main(String[] args) {
		/**
		 * 在当前文件下创建名为Demo的目录
		 * mkdir() 创建单级目录
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("目录创建完毕！");
		}else{
			System.out.println("该目录已存在！");
		}
		/**
		 * 在当前目录下创建a/b/c/d/e/f目录
		 * mkdirs() 创建多级目录
		 */
		File dir1 = new File("a/b/c/d/e/f");
		if(!dir1.exists()){
			dir1.mkdirs();
			System.out.println("目录创建完毕！");
		}else{
			System.out.println("该目录已经存在！");
		}
		/**
		 * 删除目录
		 */
		if(dir.exists()){
			/*
			 * 删除目录有一个要求，该目录必须是空目录才能删除
			 */
			dir.delete();
			System.out.println("目录删除完毕！");
		}else{
			System.out.println("该目录不存在！");
		}
		
	}
}
