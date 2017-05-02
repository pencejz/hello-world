package day02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 * 1:输出一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
		 *   若是小数，则转换为一个小数后输出乘以5后的结果
		 *   若不是数字则输出"不是数字"需要使用正则表达式进行判断
		 * 2:将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
		 * 3:将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
		 * 4.定义一个类Preson，如下：
		 *    public class Person{
		 *      private String name;
		 *      private int age;
		 *      private int salary;
		 *      //定义构造方法，以及属性get，set方法
		 *    }
		 *    重写toString方法，返回字符串格式如:"张三,25,5000"
		 *    重写equals方法，要求名字相同就认为内容一致
		 */
		//第1题
		//test1();
		//第2题
		//test2();
		//第3题
		//test3();
		//第4题
		test4();
		
		

	} //main
	
	public static void test1(){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String str = scan.nextLine();
		//整数判断
		String intRegex ="\\d+";
		if(str.matches(intRegex)){
			int i = Integer.parseInt(str)*10;
			System.out.println("字符串为整数！值为："+i);
			return;
		}
		//小数判断
		String doubleRegex="\\d+\\.\\d+$";
		if(str.matches(doubleRegex)){
			double d = Double.parseDouble(str)/5.0;
			System.out.println("字符串为小数！值为："+d);
			return;
		}
		//不是数字判断
		String noNumberRegex = "\\D+$";
		if(str.matches(noNumberRegex)){
			System.out.println("不是数字！");
		}
	}
	/**注意：正则表达式之间不需要任何连接符号 */
	
	
	public static void test2(){
		//将字符串123,456,789,012根据","拆分，并输出拆分后的每
		String str = "132,456,789,012";
		String regex = ",";
		String[] ary = str.split(regex);
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
	}
	
	public static void test3(){
		//将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
		String str = "123abc456def789ghi";
		str = str.replaceAll("[a-zA-Z]+", "#char#");
		System.out.println(str);
	}
	
	public static void test4(){
		Person p = new Person("张三",25,5000);
		System.out.println(p);
		Person p1 = new Person("张三",0,0);
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
	//构造方法
	public Person(){}
	public Person(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//重写toString
	public String toString(){
		return name+","+age+","+salary;
	}
	//重写equals
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





