package day08;
//类，类中的对象
public class Demo1 {

	public static void main(String[] args) {
		
		//分配一组数据：new Emp()---创建对象
		Emp fan = new Emp();
		Emp li = new Emp();
		//学生类实例化对象
		Student stu = new Student();
		//类中方法的调用
		stu.printInfo();
		
	}//main

}//class

/**
 * 类：用于创建对象的模板，定义了对象的结构
 * 定义了对象(一组数据)的结构
 * 重要：仅仅是结构的的定义，并没有具体的数据
 */
class Emp{
	
	String name;
	int age;
	char gender;
	double salary;
	
}

/**
 * 初始化实例---学生类
 */
class Student{
	int sid;
	String name;
	char gender;
	boolean married;
	double weight;
	
	public void printInfo(){ //属性输出的方法
		System.out.println("--------------");
		System.out.println("学号： "+sid);
		System.out.println("姓名： "+name);
		System.out.println("性别： "+(int)gender);
		System.out.println("婚姻： "+married);
		System.out.println("体重： "+weight);
	}
	
}//class



/**
 * 对象
 * 	1.软件中被管理的实体
 * 	2.由一组数据组成。其中的每个数据称为对象的属性。
 * 
 * 类
 * 	1.用于定义对象的数据结构。用于声明一组数据，将一组数据的声明的重用！
 * 
 * new 用于创建对象
 * 	1.根据类中声明的属性分配对象的存储空间
 * 		-在内存堆中分配对象的存储空间
 * 		-按照对象的属性分配存储空间
 * 	2.所有对象的属性，都有默认值
 * 		-byte short int long:0
 * 		-float double:0.0
 * 		-char:\0---空格---0
 * 		-引用类型(除了基本类型以外的类型)：null
 * 
 * 注意：类中定义的变量叫做成员变量。成员变量在对象中初始化，对象的数据称为对象的属性。
 *     类的首字母要大写
 *     在同一个包里面不能定义两个相同的类名
 *     
 * 类和对象的关系：
 *    对象是一个客观存在的实体，是面向对象编程过程中分析与解决问题的出发点和基础
 *    对象的是指就是内存中一块数据的存储区域，其存储结构由定义它的类来决定
 * 	     类是用于构建对象的模板，对象通过类的实例化产生，一个类可以创建多个对象，每个对象拥有自己的数据和行为。
 * 
 * 引用类型:
 *   出8中基本类型以外，用类名（接口、数组）声明的变量就成为引用类型变量，引用的功能在于访问对象
 *   基本数据类型本身就包含数据，引用类型存储的是某个对象在内存中的地址信息
 *   当一个引用类型变量指向该类的对象时，就可以通过这个变量访问对象
 * 
 * 
 */











