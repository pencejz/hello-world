package day07;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileOutputStream
 * 文件字节输出流，是一个低级流
 * 负责将字节数据写入到指定文件中
 * @author Administrator
 *
 */
public class FosDemo1 {

	public static void main(String[] args) throws IOException {
		/**
		 * FileOutputStream常用构造方法：
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * 上述构造方法创建的FOS的覆盖写操作，即：
		 * 通过这个数据流写入数据之前，会将该文件中原有的全部内容清除，再开始通过这个流写入内容
		 * 
		 * 还支持重载的构造方法，该构造方法多了一个boolean型参数，该值为true时，则是追加写操作，即：
		 * 通过该流写入数据会追加到文件末尾
		 * 
		 * 向fos.txt文件中写出数据
		 */
		//覆盖操作
//		FileOutputStream fos = new FileOutputStream("fos.txt");
		//追加操作
		FileOutputStream fos = new FileOutputStream("fos.txt",true);

		String str = "摩擦摩擦是魔鬼的步伐";
		//将字符串转化成对应的2进制字节
		byte[] data = str.getBytes(); //默认GK码(国标码)：一个汉字2字节，一个英文1字节
		//byte[] data = str.getBytes("UTF-8"); //一个汉字3字节，一个英文1字节
		fos.write(data);
		System.out.println("写出完毕！");
		fos.close();
		
		
	}
}
