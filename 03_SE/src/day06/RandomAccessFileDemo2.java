package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取一个字节
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "r");
		/**
		 * int read()
		 * 读取一个字节，并以int形式返回
		 * 若返回值为-1，说明以读到文件末尾
		 */
		int a = raf.read();
		System.out.println(a);
		a = raf.read();
		System.out.println(a);
		
		raf.close();
	}
}
