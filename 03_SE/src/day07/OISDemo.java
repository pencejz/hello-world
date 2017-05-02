package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * ��������������һ���߼���
 * ���Խ�OOS������ת�����ֽڶ�ȡ�������ڻ�ԭ�ظö���
 * ��һ���ֽڻ�ԭΪ����Ĺ��̳�Ϊ������ķ����л�
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
