package day06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * java.io.File
 * 该类的每一个实例用于表示当前操作系统中文件系统里的一个文件或者文件目录。即，硬盘上的一个文件或者目录
 * 使用File可以：
 * 访问文件或目录的属性信息，如文件名字、文件大小等
 * 操作文件或者目录，如创建文件、删除文件等
 * 访问目录的子项目
 * 但是不可以：访问文件内容
 * 
 * 使用路径时，最好使用相对路径，来避免绝对路径带来的系统差异，这样就不利于跨平台
 * 目录分割符(\-windows,/-linux)应当使用File类的常量separator
 * @author Administrator
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		/*
		 * File类中的常量separator表示分割符
		 * 在Windows中表示为\，同时也支持/
		 * 在linux中表示为/
		 */
		File file = new File("."+File.separator+"demo.txt");
		
		String name = file.getName();			//获取文件名
		System.out.println("文件名："+name);
		
		long length = file.length();			//获取文件大小
		System.out.println("文件大小："+length);
		
		boolean isFile = file.isFile();			//判断当前File对象表示的是否是文件
		System.out.println("是文件： "+isFile);
		
		boolean isDir = file.isDirectory();		//是否为目录
		System.out.println("是目录："+isDir);
		
		boolean canRead = file.canRead();		//是否可读
		System.out.println("可读："+canRead);
		
		boolean canWrite = file.canWrite();		//是否可写
		System.out.println("可写："+canWrite);
		
		boolean isHidden = file.isHidden();		//是否是隐藏文件
		System.out.println("隐藏文件："+isHidden);
		
		long time = file.lastModified();		//最后修改时间(毫秒数)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str = sdf.format(time);
		System.out.println(str);
		
	}
}
