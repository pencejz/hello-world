package day02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 * 1:���һ���ַ�����Ȼ�������ַ�����һ����������ת��Ϊ�������������10��Ľ��
		 *   ����С������ת��Ϊһ��С�����������5��Ľ��
		 *   ���������������"��������"��Ҫʹ��������ʽ�����ж�
		 * 2:���ַ���123,456,789,012����","��֣��������ֺ��ÿһ��
		 * 3:���ַ���"123abc456def789ghi"�е�Ӣ�Ĳ����滻Ϊ"#char#"
		 * 4.����һ����Preson�����£�
		 *    public class Person{
		 *      private String name;
		 *      private int age;
		 *      private int salary;
		 *      //���幹�췽�����Լ�����get��set����
		 *    }
		 *    ��дtoString�����������ַ�����ʽ��:"����,25,5000"
		 *    ��дequals������Ҫ��������ͬ����Ϊ����һ��
		 */
		//��1��
		//test1();
		//��2��
		//test2();
		//��3��
		//test3();
		//��4��
		test4();
		
		

	} //main
	
	public static void test1(){
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String str = scan.nextLine();
		//�����ж�
		String intRegex ="\\d+";
		if(str.matches(intRegex)){
			int i = Integer.parseInt(str)*10;
			System.out.println("�ַ���Ϊ������ֵΪ��"+i);
			return;
		}
		//С���ж�
		String doubleRegex="\\d+\\.\\d+$";
		if(str.matches(doubleRegex)){
			double d = Double.parseDouble(str)/5.0;
			System.out.println("�ַ���ΪС����ֵΪ��"+d);
			return;
		}
		//���������ж�
		String noNumberRegex = "\\D+$";
		if(str.matches(noNumberRegex)){
			System.out.println("�������֣�");
		}
	}
	/**ע�⣺������ʽ֮�䲻��Ҫ�κ����ӷ��� */
	
	
	public static void test2(){
		//���ַ���123,456,789,012����","��֣��������ֺ��ÿ
		String str = "132,456,789,012";
		String regex = ",";
		String[] ary = str.split(regex);
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
	}
	
	public static void test3(){
		//���ַ���"123abc456def789ghi"�е�Ӣ�Ĳ����滻Ϊ"#char#"
		String str = "123abc456def789ghi";
		str = str.replaceAll("[a-zA-Z]+", "#char#");
		System.out.println(str);
	}
	
	public static void test4(){
		Person p = new Person("����",25,5000);
		System.out.println(p);
		Person p1 = new Person("����",0,0);
		System.out.println(p.equals(p1));
	}
	
}

class Person{
	private String name;
	private int age;
	private int salary;
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//salary
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//���췽��
	public Person(){}
	public Person(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//��дtoString
	public String toString(){
		return name+","+age+","+salary;
	}
	//��дequals
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o==this){
			return true;
		}
		if(o instanceof Person){
			Person p = (Person)o;
			return this.name == name;
		}
		return false;
	}
	
	
}





