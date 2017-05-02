package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 批量读写
 * 若想要读写效率，需要提高每次读写的数据量，从而减少读写次数来达到
 * @author Administrator
 *
 */
public class RandomAccessFileDemo4 {

	public static void main(String[] args) throws IOException {
		//目标文件
		RandomAccessFile raf = new RandomAccessFile("累死汪了.gif", "r");
		//源文件
		RandomAccessFile raf1 = new RandomAccessFile("累死汪了复制版.gif", "rw");
		
		byte[] buf = new byte[1024*10]; //10k
		int len = -1;
		/**
		 * int read(byte[] d)
		 * 尝试读取给定的字节数总长度的字节量，并存入到该数组中，返回值为实际读取到的字节量
		 * 若返回值为-1，就表示读取到了文件末尾(这一次没有读取到文件)
		 */
		long start = System.currentTimeMillis();
		while((len=raf.read(buf))!=-1){
			/**
			 * void write(byte[] d)
			 * 将给定的字节数组中所有的字节数一次性写入到文件中
			 * 
			 * void write(byte[] d,int start,int len)
			 * 将给定的字节数组中从下标为start出开始的连续len个字节写出
			 */
			raf1.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
		raf.close();
		raf1.close();		
	}
}
