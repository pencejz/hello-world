package summary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class day07_���Ĳ��� {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/**
		 * �ͼ���:����Դ��ȷ����ʵ�����д���ݵ���
		 * 		�ֽ���(FileInputStream/FileOutputStream)���ַ���(FileReader/FileWriter)
		 * 		�������ֽڻ����ַ�����������������Ҫ��read()����:
		 * 			��1���ֱ��Ƕ����ֽ�/�ַ�read()����
		 * 			��2�������ֽ�/�ַ�������ж� read(byte [ ] bytes)
		 * 			��3��Ϊ�˷�ֹ���һ�ζ�����������һ���ָ��ÿ���ֽ�/�ַ�����Ķ���read(byte [ ] bytes,int start int len)
		 * 
		 * �߼���:�߼��������������������߼������ܶ������ڣ���Ϊû�����塣ʹ�ø߼�����Ŀ�ľ���Ϊ�˽��ĳЩ��д�����ĸ��Ӷȣ������ǵĶ�д����
		 * 		���������ַ�������(PrintWriter/BufferedReader)���ֽڻ�����(BufferedInputStream/BufferedOutputStream)
		 * 		��װ����������(DataInputStream/DataOutputStream)��������(ObjectInputStream/ObjectOutputStream)
		 * 		ת������InputStreamReader(�ֽ�ת�ַ����)��OutputStreamWriter(�ַ�ת�ֽ�д��)
		 * 	ע�⣺��������ת�������ڰ�װ����ֻ�ܶ����е������з�װ������ֱ�ӹ����ļ����в���
		 * 		   ��д����һ����Ҫ�ͼ���������һ����Ҫʹ�ø߼���
		 * 
		 * FileOutputStream/BufferedOutputStream
		 * void write(byte[])	���ֽ�����д���ļ�
		 * 
		 * FileInputStream/BufferedInputStream
		 * int read(byte[])		��ȡ�ļ��ֽ�����
		 * 
		 * BufferedOutputStream
		 * void flash()		ǿ�ƽ��������л���������ֽ�һ����д��
		 * 					Ƶ���ĵ��ø÷��������д���Ĵ������Ӷ�����д����Ч��
		 * 					����������ȴ�ܱ�֤д���ļ�ʱ��
		 * 
		 * BufferedReader		�����ַ�������������Ϊ��λд���ַ�����
		 * String readLine()	������ȡ�����ַ�����ֱ���������з�Ϊֹ��Ȼ�󽫻��з�֮ǰ�������ַ����һ���ַ�������
		 * 						���Ǹ��ַ��������л��з������÷�������null��˵��EOF
		 * java.io.PrintWiter	�����ַ����������������Ϊ��λд���ַ����������Զ���ˢ�µĹ��ܣ�
		 * 
		 * 
		 * ObjectOutputStream
		 * void writeObject(Object)		������ת��Ϊ�ֽ�����д���ļ������л���
		 * 
		 * ObjectIntputStream
		 * Object readObject()		��ȡ�ļ����ֽ����鲢ת��Ϊ���󣨷����л���
		 * 
		 * ת����
		 * java.io.OutputStreamWriter	����ָ�����ַ�������Ҫд����ַ���ת��Ϊ��Ӧ���ֽں�д���ļ�
		 * 		1.����ת��д���ַ������ַ���
		 * 		2.��Ϊ������һ���ַ������ֿ��Դ����ֽ��������ԣ���ʱ��Ҫ���ֽ�������Ϊ�ַ���ʱ��Ҫʹ�õ���
		 * java.io.InputStreamReader	����ָ���ַ��������ַ�Ϊ��λ��ȡ����
		 */
		
		//��������ֽ���ʹ��
//		byteStream();
		
		//ʹ�û����ֽ��������ļ�
//		copyFile();
		
		//�����ֽ�������Ļ���������
//		bufferedFlash();
		
		//�����ַ�����ʹ��
//		bufferedChar();		
		
		//��������ʹ��
//		objectStream();
		
		//ת������ʹ��
//		changeEachother();
		
	}
	
	//��������ֽ�����ʹ��
	public static void byteStream() throws IOException {
		/**
		 * �ļ��ֽ�������FileOutputStream�������ļ������ڣ�����Զ�����
		 * ���ù��췽����
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * �������췽��������FOS�ĸ���д����������
		 * ͨ�����������д������֮ǰ���Ὣ���ļ���ԭ�е�ȫ������������ٿ�ʼͨ�������д������
		 * 
		 * ��֧�����صĹ��췽�����ù��췽������һ��boolean�Ͳ�������ֵΪtrueʱ������׷��д����������
		 * ͨ������д�����ݻ�׷�ӵ��ļ�ĩβ
		 * 
		 * ��fos.txt�ļ���д������
		 */
		//���ǲ���
//		FileOutputStream fos = new FileOutputStream("fos.txt");
		//׷�Ӳ���
		FileOutputStream fos = new FileOutputStream("fos.txt",true);

		String str = "Ħ��Ħ����ħ��Ĳ���";
		//���ַ���ת���ɶ�Ӧ��2�����ֽ�
		byte[] data = str.getBytes(); //Ĭ��GK��(������)��һ������2�ֽڣ�һ��Ӣ��1�ֽ�
		//byte[] data = str.getBytes("UTF-8"); //һ������3�ֽڣ�һ��Ӣ��1�ֽ�
		fos.write(data);
		System.out.println("д����ϣ�");
		fos.close();
		
		/**
		 * �ļ��ֽ�������FileInputStream:��ȡ�ļ�
		 */
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data1 = new byte[50];
		int len = fis.read(data1);
		String str1 = new String(data1,0,len);
		//String str1 = new String(data1,0,len,"UTF-8");
		System.out.println("str1 = "+str1);
		fis.close();
		
	}

	//ʹ�û����ֽ��������ļ�(�����ֽ�����һ�Ը߼�����ʹ�����ǿ�����߶�дЧ��)
	public static void copyFile() throws IOException{
		FileInputStream fis = new FileInputStream("��������.gif");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("�������˸��ư�.gif");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = -1;
		/*
		 * �������ڲ�ά����һ���ֽ�������Ϊ���塣
		 * �����ǵ���read()������ȡһ���ֽ�ʱ����������һ���Զ�ȡ�����ֽڲ����뻺����
		 * Ȼ�󷵻ص�һ���ֽڣ��������ٴε���read()����ʱ�������������������еڶ����ֽڷ���
		 * ֱ�������ֽڶ����غ󣬲Ż��ٴη���ʵ�ʵĶ�ȡ��������ȡһ���ֽڣ����뻺����
		 * ���Ա����ϻ���ͨ��һ���Զ�ȡ�����ֽڣ����ٶ�ȡ������߶�ȡЧ��
		 */
		long start = System.currentTimeMillis();
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		bis.close();
		bos.close();
		
	}
		
	//�����ֽ�������Ļ���������
	public static void bufferedFlash() throws IOException{
		FileOutputStream fos = new FileOutputStream("box.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "���죬��������裡";
		bos.write(str.getBytes());
		/**
		 * void flash()
		 * ǿ�ƽ��������л���������ֽ�һ����д��
		 * Ƶ���ĵ��ø÷��������д���Ĵ������Ӷ�����д����Ч��
		 * ����������ȴ�ܱ�֤д���ļ�ʱ��
		 */
		bos.flush();
		
		System.out.println("������ϣ�");
		
		bos.close();
		fos.close();
	}
	
	//�����ַ���
	public static void bufferedChar() throws IOException{
		
		//��ȡ��ǰԴ���򣬲��ڿ���̨�����
//		FileInputStream fis = new FileInputStream("src"+File.separator+"summary"+File.separator+"day07_���Ĳ���.java");	//���ֽ�
//		InputStreamReader isr = new InputStreamReader(fis);	//�ַ�
//		BufferedReader br = new BufferedReader(isr);	//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("src"+File.separator+"summary"+File.separator+"day07_���Ĳ���.java")));
		
		String line = null;
		while((line=br.readLine()) !=null){
			System.out.println(line);
		}
		
		//�����ݴ����ļ�
		/**
		 * 1���ṩ��ֱ�Ӷ��ļ�д�������Ĺ��췽����
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		pw.println("�ú�ѧϰ");
		pw.println("��������");
		System.out.println("1д����ϣ�");
		
		/**
		 * 2���ṩ�˴�������������ع��췽�����ȿ��Դ����ֽ������ֿ��Դ����ַ���
		 * PrintWriter(OutputStream out)
		 * PrintWriter(Writer out)
		 */
//		FileOutputStream fos = new FileOutputStream("pw1.txt"); //д���ļ�
//		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8"); //ת��Ϊutf-8�ַ���
//		PrintWriter pw1 = new PrintWriter(osw);
		PrintWriter pw1 = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream("pw1.txt"),"utf-8"));
		
		pw1.println("�ú�ѧϰ��");
		pw1.println("�������ϣ�");
		System.out.println("2������ϣ�");
		
		pw.close();
	}	
	
	//��������ʹ��
	public static void objectStream() throws IOException, ClassNotFoundException{
		
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
		//�������������һ���߼����������ǽ������Ķ���ת��Ϊһ���ֽں�д�뵽�ļ�
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
		 * ��һ���ֽڻ�ԭΪ����Ĺ��̳�Ϊ������ķ����л�
		 */
		oos.writeObject(person);
		System.out.println("���л���ϣ�");
		oos.close();
		
		//��������������һ���߼����� ���Խ�OOS������ת�����ֽڶ�ȡ�������ڻ�ԭ�ظö���
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		System.out.println("p = "+p);
		ois.close();
		fis.close();
		
	}
	
	//ת������ʹ��
	public static void changeEachother() throws IOException{
		
		//���ַ�ת��Ϊ�ֽڣ�д���ļ�
		FileOutputStream fos = new FileOutputStream("osw.txt");
		/**
		 * ����ָ���ַ����������ո��ַ���д���ַ�������UTF-8
		 * ��������ڶ������������ǰ���ϵͳĬ�ϵ��ַ���д���ַ���
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("�ú�ѧϰ��");
		osw.write("�������ϣ�");
		System.out.println("������ϣ�");
		osw.close();
		
		//���ֽ�ת��Ϊ�ַ�����ȡ����
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		int d = -1;
		while((d=isr.read())!=-1){
			char ch = (char)d;
			System.out.print(ch);
		}
		isr.close();
		
	}

}

/*
 * ���ڲ��Զ������Ķ����д����
 * ��ϣ�������ʵ�����Ա���������д����ô�������ʵ��Serializable�ӿ�
 * Serializable�������л�
 */
class Person implements Serializable{
	/**
	 * ��һ����ʵ�������л��ӿڣ�Ӧ�����������������������л��汾��
	 * �ð汾�ž����ŵ�ǰʵ�����з����л�ʱ�Ƿ�ɹ�
	 * ��OIS���з����л�ʱ������ö���汾�뵱ǰ�����ڵİ汾���Ƿ�һ�£�
	 * һ�£�����Ի�ԭ�����ṹ�����˱仯�����ȡ����ģʽ������ֻ��ԭ���õ�����
	 * ��һ�£������л�ֱ��ʧ�ܣ����׳��쳣
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	/**
	 * transient�ؼ���������������
	 * �������ڵ�ǰ�������л�ʱ����ֵ�����ԡ��Ӷ��ﵽ��������������
	 */
	private transient List<String> outherInfo;
	
	public Person(){
		
	}

	public Person(String name,int age,String gender,List<String> outherInfo){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.outherInfo = outherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setOutherInfo(List<String> outherInfo){
		this.outherInfo = outherInfo;
	}
	
	public List<String> getOutherInfo(){
		return outherInfo;
	}
	
	public String toString(){
		return name+","+age+","+gender+","+outherInfo;
	}
}

