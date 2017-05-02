package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * 对象输入流，是一个高级流
 * 可以将OOS将对象转换的字节读取出来并在还原回该对象
 * 从一组字节还原为对象的过程称为：对象的反序列化
 * @author Administrator
 *
 */
public class OISDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
		ois.close();
		fis.close();
		
		
		
		
	}
}
