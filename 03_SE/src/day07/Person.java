package day07;

import java.io.Serializable;
import java.util.List;

/**
 * ���Զ������Ķ����д����
 * 
 * ��ϣ�������ʵ�����Ա���������д����ô�������ʵ��Serializable�ӿ�
 * Serializable�������л�
 * @author Administrator
 *
 */
public class Person implements Serializable{
	
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
