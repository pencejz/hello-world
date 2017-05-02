package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 专门用来读写文件的类
 * 其基于指针对文件数据进行读写操作
 * @author Administrator
 *
 */
public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		/**
		 * "raf.dat"---第一个参数为文件名，如果没有，则会创建该文件
		 * RandomAccessFile有两个创建模式：
		 * r:只读
		 * rw：可读可写
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/**
		 * void write(int d)
		 * 写一个字节，写入的是指定的int值所对应的的2进制的低八位
		 */
		raf.write(255);
		System.out.println("写出完毕！");
		
		raf.close();
	}
}
