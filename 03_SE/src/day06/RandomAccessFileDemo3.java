package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 单个文件的复制
 * @author Administrator
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		//目标文件
		RandomAccessFile raf = new RandomAccessFile("累死汪了.gif", "r");
		//源文件
		RandomAccessFile raf1 = new RandomAccessFile("累死汪了复制版.gif", "rw");
		
		int d = -1;
		long starts = System.currentTimeMillis();
		while((d=raf.read())!=-1){
			raf1.write(d);
			System.out.print(d);
		}
		long ends = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(ends-starts)+"毫秒");
		raf.close();
		raf1.close();
		
	}
}
