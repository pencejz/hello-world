package day06;

import java.io.File;

/**
 * 若File表示的是一个目录，那么还可以查看这个目录所包含的所有子项(子项包含文件和目录)
 * @author Administrator
 *
 */
public class FileDemo5 {

	public static void main(String[] args) {
		/*
		 * 查看当前目录下的所有内容
		 */
		File dir = new File("./a");
//		if(dir.isDirectory()){
//			File[] subs = dir.listFiles();
//			for(File sub : subs){
//				System.out.println((sub.isFile()?"文件：":"目录：")
//			                       +sub.getName());
//			}
//		}else{
//			System.out.println("该对象是文件！");
//		}
//		
		delete(dir);
		
		
		
	} //main
	
	/**
	 * 将给定的File表示的文件和目录删除的方法
	 */
	public static void delete(File dir){
		
		if(dir.isDirectory()){				//判断dir是否为目录,若是文件则直接删除
			File[] subs = dir.listFiles();	//获取dir目录下所有目录和文件的名字的数组
			for(File sub : subs){			//遍历dir目录，并获取dir目录下所有内容的名字
				delete(sub);				//递归调用(当目录为空时，即为出口)
			}
			dir.delete();					//删除目录
			System.out.println("删除目录："+dir);
			
		}else{
			dir.delete();					//删除文件
			System.out.println("删除文件："+dir);
		}
		
	}

	/**
	 * 用递归实现从1+2+3+...+100
	 */

	
}
