package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区操作
 * @author Administrator
 *
 */
public class BosDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("box.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "鹅鹅鹅，曲项向天歌！";
		bos.write(str.getBytes());
		/**
		 * void flash()
		 * 强制将缓冲区中缓冲的所有字节一次性写出
		 * 频繁的调用该方法会提高写出的次数，从而降低写出的效率
		 * 但是这样做却能保证写出的及时性
		 */
		bos.flush();
		
		System.out.println("输入完毕！");
		
		bos.close();
		fos.close();
	}
}
