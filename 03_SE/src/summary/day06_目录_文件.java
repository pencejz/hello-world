package summary;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;

public class day06_目录_文件 {

	public static void main(String[] args) throws IOException {
		
		/**
		 * java.io.File 目录和文件类
		 * 1.该类的每一个实例用于表示当前操作系统中文件系统里的一个文件或者文件目录。即，硬盘上的一个文件或者目录
		 * 2.使用File可以：访问文件或目录的属性信息，如文件名字、文件大小等
		 * 				操作文件或者目录，如创建文件、删除文件等
		 * 				访问目录的子项目（目录、文件），但是不可以访问文件内容
		 * 3.使用路径时，最好使用相对路径，来避免绝对路径带来的系统差异，这样就不利于跨平台
		 * 4.目录分割符(\-windows,/-linux)应当使用File类的常量separator。
		 *   File类中的常量separator表示分割符（在Windows中表示为\，同时也支持/。在linux中表示为/
		 * 
		 * void createNewFile() 创建文件
		 * void mkdir() 创建单级目录
		 * void mkdirs() 创建多级目录
		 * String getName() 获取文件名
		 * long length() 获取文件大小
		 * long lastModified() 获取最后修改时间（毫秒值）
		 * void delete() 删除目录/文件
		 * void deleteOnExit() 退出后删除
		 * File[] listFiles() 获取当前目录下所有目录和文件的名称组成的数组
		 * 
		 * boolean exists()	判断是否已经存在
		 * boolean isFile() 判断是否是文件
		 * boolean idDirectory() 判断是否是目录
		 * boolean canRead() 判断是否可读
		 * boolean canWrite() 判断是否可写
		 * boolean isHidden() 判断是否是隐藏文件
		 */
		
		//文件操作
		File file = new File("."+File.separator+"demo.txt");	//创建目录、文件对象
		if(!file.exists()){						//判断文件是否存在
			try {
				file.createNewFile();			//创建文件
			} catch (IOException e) {
				System.out.println("文件创建失败");
				e.printStackTrace();
			}
			System.out.println("文件创建完毕！");
		}else{
			System.out.println("文件已经存在！");
		}
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
		file.delete();
		System.out.println("文件已经删除");
		
		//目录操作
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();						//创建单级目录
			System.out.println("目录创建完毕！");
		}else{
			System.out.println("该目录已存在！");
		}
		File dir1 = new File("a/b/c/d/e/f");
		if(!dir1.exists()){
			dir1.mkdirs();						//创建多级目录
			System.out.println("目录创建完毕！");
		}else{
			System.out.println("该目录已经存在！");
		}
		//递归删除多级目录（通过dir1创建多级目录之后，当前目录级别为f，故此处删除目录a时，需要重新选中a）
		File dir2 = new File("a");
		delete(dir2);
		//文件过滤器的使用
		fileFilter();
		
		
		/**
		 * java.io.RandomAccessFile		专门用来读写文件的类(其基于指针对文件数据进行读写操作)
		 * 
		 * "raf.dat"---第一个参数为文件名，如果没有，则会创建该文件
		 * RandomAccessFile有两个创建模式：
		 * r:只读
		 * rw：可读可写
		 * 
		 * void write(int d)			写一个字节，写入的是指定的int值所对应的的2进制的低八位
		 * void writeInt(int d)	 		一次性写入一个int值（即就是写入4个字节），将给定的int值对应的2进制写入到文件中
		 * void writeLongt(long d)		一次性写入一个long值
		 * void writeDouble(double d)	一次性写入一个double值
		 * int read()					读取一个字节，并以int形式返回(若返回值为-1，说明以读到文件末尾)
		 * int read(byte[] d)			 尝试读取给定的字节数总长度的字节量，并存入到该数组中，返回值为实际读取到的字节量
		 * 								若返回值为-1，就表示读取到了文件末尾(这一次没有读取到文件)
		 * void write(byte[] d)			将给定的字节数组中所有的字节数一次性写入到文件中
		 * void write(byte[] d,int start,int len)	将给定的字节数组中从下标为start出开始的连续len个字节写出
		 * 
		 * long getFilePointer()		获得当前RAF指针的位置
		 * void seek(long pos)			设置指针位置
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		raf.write(255);
		System.out.println("写出完毕！");
		
		int a = raf.read();
		System.out.println(a);
		a = raf.read();
		System.out.println(a);
		
		//单个字节读写
		oneBite();
		
		//批量读写
		batchBites();
		
		/*
		 * RandomAccessFile提供了方便读写基本数据类型的方法
		 * 以及指针的操作，通过该操作可以方便的读写文件的任意位置
		 */
		randomAccessFileDemo();
		
		raf.close();
		
	}
	
	//将给定的File表示的文件和目录删除的方法
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
	
	//使用文件过滤器来获取一个目录下满足条件的部分子项
	public static void fileFilter(){
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
	
	//单个字节读写实现文件复制（先读取在写入）
	public static void oneBite() throws IOException{
		//目标文件
		RandomAccessFile raf = new RandomAccessFile("累死汪了.gif", "r");
		//源文件
		RandomAccessFile raf1 = new RandomAccessFile("累死汪了复制版.gif", "rw");
		
		int d = -1;
		long starts = System.currentTimeMillis();
		while((d=raf.read()) != -1){
			raf1.write(d);
			System.out.print(d);
		}
		long ends = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(ends-starts)+"毫秒");
		raf.close();
		raf1.close();
	}
	
	//批量字节读写实现文件复制（若想要读写效率，需要提高每次读写的数据量，从而减少读写次数来达到）
	public static void batchBites() throws IOException{
		//目标文件
		RandomAccessFile raf = new RandomAccessFile("累死汪了.gif", "r");
		//源文件
		RandomAccessFile raf1 = new RandomAccessFile("累死汪了复制版.gif", "rw");
		
		byte[] buf = new byte[1024*10]; //10k
		int len = -1;
		long start = System.currentTimeMillis();
		while((len=raf.read(buf))!=-1){
			raf1.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
		raf.close();
		raf1.close();
	}
	
	//RandomAccessFile提供了方便读写基本数据类型的方法以及指针的操作，通过该操作可以方便的读写文件的任意位置
	public static void randomAccessFileDemo() throws IOException{
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		
		long pos = raf.getFilePointer();
		System.out.println("pos = "+pos);
		
		//将一个int最大值写入文件
//		int max = Integer.MAX_VALUE;
		/*
		 *                              vvvvvvvv
		 * 01111111 111111111 111111111 11111111
		 * 
		 * raf.write(max>>>24);
		 * raf.write(max>>>16);
		 * raf.write(max>>>8);
		 * raf.write(max);
		 */
		/**
		 * void write(int d)
		 * 一次写入一个字节，将给定的int值对应的2进制写入到文件中，保存为字符的2进制
		 * 如raf.write(97);---输出值为：a
		 * 
		 * void writeInt(int d)
		 * 一次性写出四个字节，将给定的int值对应的2进制写入到文件中
		 * 如raf.writeInt(97);---输出值为：97
		 */
		raf.writeInt(Integer.MAX_VALUE);
		System.out.println("pos = "+raf.getFilePointer());
		//写入一个long值
		raf.writeLong(1234L);
		System.out.println("pos = "+raf.getFilePointer());
		//写入一个double值
		raf.writeDouble(123.123);
		System.out.println("pos = "+raf.getFilePointer());
		/**
		 * void seek(long pos)
		 * 将指针移动到文件开始处
		 */
		//将指针移到文件开始处
		raf.seek(0);
		/**
		 * 读取int值
		 * 连续4个字节，将对应的int值返回
		 */
		int i = raf.readInt();
		System.out.println("max = "+i);
		
		long l = raf.readLong();
		System.out.println("l = "+l);
		
		double d = raf.readDouble();
		System.out.println("d = "+d);
		/*
		 * 2147483647 123L     123.123
		 * [int]      [long]   [double]
		 * 0123       45678901 23456789 字节数
		 */
		raf.seek(4);
		long l1 = raf.readLong();
		System.out.println("l1 = "+l1);
		
		System.out.println("写入完毕！");
		raf.close();
	}
}







