package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile提供了方便读写基本数据类型的方法
 * 以及指针的操作，通过该操作可以方便的读写文件的任意位置
 * @author Administrator
 *
 */
public class RandomAccessFileDemo5 {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/**
		 * long getFilePointer()
		 * 获得当前RAF指针的位置
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos = "+pos);
		
		//将一个int最大值写入文件
		int max = Integer.MAX_VALUE;
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
		 * 如raf.write(97);---输出值为：97
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
