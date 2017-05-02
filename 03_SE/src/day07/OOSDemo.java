package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream
 * 对象输出流，是一个高级流
 * 作用是将给定的对象转换为一组字节后写出
 * @author Administrator
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		Person person = new Person();
		person.setName("苍老师");
		person.setAge(18);
		person.setGender("女");
		List<String> outherInfo = new ArrayList<String>();
		outherInfo.add("是一名演员");
		outherInfo.add("爱好写大字");
		person.setOutherInfo(outherInfo);
		System.out.println(person);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/**
		 * 将给定的对象转换为一组字节后写出
		 * 由于oos处理的是fos，所以转换的这组字节最终通过fos写入到文件中了
		 * 
		 * writeObject这里实际上做了两件事：
		 * 1.将person对象转换为了一组字节
		 * 2.将转换的字节通过fos写入到硬盘
		 * 
		 * 将对象转化为一组字节的过程称为：对象序列化
		 * 将一组字节写入到硬盘中的过程称为：数据持久化
		 */
		oos.writeObject(person);
		System.out.println("序列化完毕！");
		
		oos.close();
		
		
		
		
		
	}
	
	
	
}
