package day07;

import java.io.BufferedInputStream; //输入缓冲流
import java.io.BufferedOutputStream; //输出缓冲流
import java.io.FileInputStream; //字节输入流
import java.io.FileOutputStream; //字节输出流
import java.io.IOException;

/**
 * 使用缓冲流加快读写效率
 * 缓冲流是一对高级流，使用它们可以提高读写效率
 * 高级流：高级流用来处理其他流，高级流不能独立存在，因为没有意义
 * 使用高级流的目的就是为了解决某些读写操作的复杂度，简化我们的读写操作
 * 低级流：数据源明确，真实负责读写数据的流
 * 读写操作一定需要低级流，但不一定非要使用高级流
 * @author Administrator
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("累死汪了.gif");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("累死汪了复制版.gif");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = -1;
		/*
		 * 缓冲流内部维护了一个字节数组作为缓冲。
		 * 当我们调用read()方法读取一个字节时，缓冲流会一次性读取若干字节并存入缓冲区
		 * 然后返回第一个字节，当我们再次调用read()方法时，它会立即将缓冲区中第二个字节返回
		 * 直到所有字节都返回后，才会再次发生实际的读取操作，读取一组字节，放入缓冲区
		 * 所以本质上还是通过一次性读取若干字节，减少读取次数提高读取效率
		 */
		long start = System.currentTimeMillis();
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
		bis.close();
		bos.close();
		
	}
}
