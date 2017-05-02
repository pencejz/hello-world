package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutputStream
 * �������������һ���߼���
 * �����ǽ������Ķ���ת��Ϊһ���ֽں�д��
 * @author Administrator
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		Person person = new Person();
		person.setName("����ʦ");
		person.setAge(18);
		person.setGender("Ů");
		List<String> outherInfo = new ArrayList<String>();
		outherInfo.add("��һ����Ա");
		outherInfo.add("����д����");
		person.setOutherInfo(outherInfo);
		System.out.println(person);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/**
		 * �������Ķ���ת��Ϊһ���ֽں�д��
		 * ����oos�������fos������ת���������ֽ�����ͨ��fosд�뵽�ļ�����
		 * 
		 * writeObject����ʵ�������������£�
		 * 1.��person����ת��Ϊ��һ���ֽ�
		 * 2.��ת�����ֽ�ͨ��fosд�뵽Ӳ��
		 * 
		 * ������ת��Ϊһ���ֽڵĹ��̳�Ϊ���������л�
		 * ��һ���ֽ�д�뵽Ӳ���еĹ��̳�Ϊ�����ݳ־û�
		 */
		oos.writeObject(person);
		System.out.println("���л���ϣ�");
		
		oos.close();
		
		
		
		
		
	}
	
	
	
}
