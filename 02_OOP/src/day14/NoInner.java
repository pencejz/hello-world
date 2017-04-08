package day14;
//匿名内部类
public class NoInner {

	public static void main(String[] args) {
		/**
		 * 匿名内部类
		 * 1.必须有父类
		 * 2.匿名内部类是声明子类的同时创建了子类对象
		 * 3.语法简洁，使用方法便
		 *    new 父类型()  {};
		 *     调用构造方法       子类类体
		 * 4.用于简洁的继承抽象类，或者实现接口
		 * 5.匿名内部类共享外部方法中的局部变量时，这个局部变量必须为final修饰
		 */
		final int a = 10;
		Yoo yoo = new Yoo(){}; //创建匿名内部类---得到的是子类对象，子类没有名字
		Yoo yoo1 = new Yoo(); //创建Yoo对象---的到的是父类对象
		Xoo xoo = new Xoo(){}; //创建匿名内部类---得到的是实现类对象，实现类没有名字
		
		Goo goo = new Goo(){
			public void test(){
				System.out.println("test, a="+a);
			}
		};
		goo.test();
	}//main
}
class Yoo{}
interface Xoo{}
interface Goo{
	void test();
}