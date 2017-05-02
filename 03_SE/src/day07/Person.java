package day07;

import java.io.Serializable;
import java.util.List;

/**
 * 测试对象流的对象读写操作
 * 
 * 若希望该类的实例可以被对象流读写，那么该类必须实现Serializable接口
 * Serializable：可序列化
 * @author Administrator
 *
 */
public class Person implements Serializable{
	
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
