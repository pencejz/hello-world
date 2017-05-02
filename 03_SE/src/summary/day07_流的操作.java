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

public class day07_流的操作 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/**
		 * 低级流:数据源明确，真实负责读写数据的流
		 * 		字节流(FileInputStream/FileOutputStream)、字符流(FileReader/FileWriter)
		 * 		无论是字节或者字符输入流都有三种主要的read()方法:
		 * 			（1）分别是读单字节/字符read()方法
		 * 			（2）利用字节/字符数组进行读 read(byte [ ] bytes)
		 * 			（3）为了防止最后一次读入有误，我们一般会指定每次字节/字符数组的读入read(byte [ ] bytes,int start int len)
		 * 
		 * 高级流:高级流用来处理其他流，高级流不能独立存在，因为没有意义。使用高级流的目的就是为了解决某些读写操作的复杂度，简化我们的读写操作
		 * 		缓冲流：字符缓冲流(PrintWriter/BufferedReader)、字节缓冲流(BufferedInputStream/BufferedOutputStream)
		 * 		包装流：数据流(DataInputStream/DataOutputStream)、对象流(ObjectInputStream/ObjectOutputStream)
		 * 		转换流：InputStreamReader(字节转字符输出)、OutputStreamWriter(字符转字节写入)
		 * 	注意：缓冲流和转换流属于包装流，只能对已有的流进行封装，不能直接关联文件进行操作
		 * 		   读写操作一定需要低级流，但不一定非要使用高级流
		 * 
		 * FileOutputStream/BufferedOutputStream
		 * void write(byte[])	将字节内容写入文件
		 * 
		 * FileInputStream/BufferedInputStream
		 * int read(byte[])		读取文件字节内容
		 * 
		 * BufferedOutputStream
		 * void flash()		强制将缓冲区中缓冲的所有字节一次性写出
		 * 					频繁的调用该方法会提高写出的次数，从而降低写出的效率
		 * 					但是这样做却能保证写出的及时性
		 * 
		 * BufferedReader		缓冲字符输入流（以行为单位写入字符串）
		 * String readLine()	连续读取若干字符串，直到遇到换行符为止，然后将换行符之前的所有字符组成一个字符串返回
		 * 						但是该字符串不会有换行符。若该方法返回null，说明EOF
		 * java.io.PrintWiter	缓冲字符输出流（可以以行为单位写出字符串。具有自动行刷新的功能）
		 * 
		 * 
		 * ObjectOutputStream
		 * void writeObject(Object)		将对象转化为字节数组写入文件（序列化）
		 * 
		 * ObjectIntputStream
		 * Object readObject()		读取文件中字节数组并转化为对象（反序列化）
		 * 
		 * 转换流
		 * java.io.OutputStreamWriter	按照指定的字符集，将要写入的字符串转换为对应的字节后写入文件
		 * 		1.可以转换写出字符串的字符集
		 * 		2.因为该流是一个字符流，又可以处理字节流，所以，有时候要将字节流处理为字符流时需要使用到它
		 * java.io.InputStreamReader	按照指定字符集，以字符为单位读取数据
		 */
		
		//输入输出字节流使用
//		byteStream();
		
		//使用缓冲字节流复制文件
//		copyFile();
		
		//缓冲字节输出流的缓冲区操作
//		bufferedFlash();
		
		//缓冲字符流的使用
//		bufferedChar();		
		
		//对象流的使用
//		objectStream();
		
		//转换流的使用
//		changeEachother();
		
	}
	
	//输入输出字节流的使用
	public static void byteStream() throws IOException {
		/**
		 * 文件字节输入流FileOutputStream。若该文件不存在，则会自动创建
		 * 常用构造方法：
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
		System.out.println("写入完毕！");
		fos.close();
		
		/**
		 * 文件字节输入流FileInputStream:读取文件
		 */
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data1 = new byte[50];
		int len = fis.read(data1);
		String str1 = new String(data1,0,len);
		//String str1 = new String(data1,0,len,"UTF-8");
		System.out.println("str1 = "+str1);
		fis.close();
		
	}

	//使用缓冲字节流复制文件(缓冲字节流是一对高级流，使用它们可以提高读写效率)
	public static void copyFile() throws IOException{
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
		
	//缓冲字节输出流的缓冲区操作
	public static void bufferedFlash() throws IOException{
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
	
	//缓冲字符流
	public static void bufferedChar() throws IOException{
		
		//读取当前源程序，并在控制台输出来
//		FileInputStream fis = new FileInputStream("src"+File.separator+"summary"+File.separator+"day07_流的操作.java");	//读字节
//		InputStreamReader isr = new InputStreamReader(fis);	//字符
//		BufferedReader br = new BufferedReader(isr);	//读行
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("src"+File.separator+"summary"+File.separator+"day07_流的操作.java")));
		
		String line = null;
		while((line=br.readLine()) !=null){
			System.out.println(line);
		}
		
		//将内容存入文件
		/**
		 * 1、提供了直接对文件写出操作的构造方法：
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		pw.println("好好学习");
		pw.println("天天向上");
		System.out.println("1写入完毕！");
		
		/**
		 * 2、提供了处理其他流的相关构造方法，既可以处理字节流，又可以处理字符流
		 * PrintWriter(OutputStream out)
		 * PrintWriter(Writer out)
		 */
//		FileOutputStream fos = new FileOutputStream("pw1.txt"); //写入文件
//		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8"); //转化为utf-8字符集
//		PrintWriter pw1 = new PrintWriter(osw);
		PrintWriter pw1 = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream("pw1.txt"),"utf-8"));
		
		pw1.println("好好学习！");
		pw1.println("天天向上！");
		System.out.println("2输入完毕！");
		
		pw.close();
	}	
	
	//对象流的使用
	public static void objectStream() throws IOException, ClassNotFoundException{
		
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
		//对象输出流，是一个高级流。作用是将给定的对象转换为一组字节后写入到文件
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
		 * 将一组字节还原为对象的过程称为：对象的反序列化
		 */
		oos.writeObject(person);
		System.out.println("序列化完毕！");
		oos.close();
		
		//对象输入流，是一个高级流。 可以将OOS将对象转换的字节读取出来并在还原回该对象
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		System.out.println("p = "+p);
		ois.close();
		fis.close();
		
	}
	
	//转换流的使用
	public static void changeEachother() throws IOException{
		
		//将字符转换为字节，写入文件
		FileOutputStream fos = new FileOutputStream("osw.txt");
		/**
		 * 可以指定字符集，并按照该字符集写出字符串。如UTF-8
		 * 若不传入第二个参数，则是按照系统默认的字符集写出字符串
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		osw.write("好好学习！");
		osw.write("天天向上！");
		System.out.println("输入完毕！");
		osw.close();
		
		//将字节转换为字符，读取出来
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
 * 用于测试对象流的对象读写操作
 * 若希望该类的实例可以被对象流读写，那么该类必须实现Serializable接口
 * Serializable：可序列化
 */
class Person implements Serializable{
	/**
	 * 当一个类实现了序列化接口，应当定义下面的这个常量：序列化版本号
	 * 该版本号决定着当前实例进行反序列化时是否成功
	 * 当OIS进行反序列化时，会检查该对象版本与当前类现在的版本号是否一致：
	 * 一致：则可以还原，若结构发生了变化，则采取兼容模式，即：只还原能用的属性
	 * 不一致：反序列化直接失败，并抛出异常
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	/**
	 * transient关键字用来修饰属性
	 * 作用是在当前对象序列化时，该值被忽略。从而达到对象“瘦身”的作用
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

