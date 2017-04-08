package day12;

public class Final {

	public static void main(String[] args) {
		/**final修饰变量---初始化之后不可再改变*/
		final int a;
		a = 10; //初始化
		//a = 15; //编译错误，final修饰变量不可再次赋值
		
		final int[] ary = {3,4,5};
		//ary[0] = null; //不可再次改变
		ary[0] = 5;
		System.out.println(ary[0]); //5
		/* 不可改变的是引用关系(引用的是数组元素的地址映射)，但是数组元素的值是可以改变的*/
		
		//final定义参数
		String s = f(3,4);
		System.out.println(s);
		
		/* final定义成员变量
		 * final修饰的属性，还是实例变量，每一个都有属性
		 * static修饰成员变量，是“一份”的变量，所有对象共享一份 */
		Roo r1 = new Roo(4);
		r1.a = 1;
		Roo r2 = new Roo(5);
		//r2.b = 3; //编译错误
		System.out.println(r1.b+","+r2.b);
		
		/* static final == final static 可定义为常量
		 * 声明常量的同时必须初始化，且不可被更改
		 * 编译擦除现象：java编译器在编译期间将常量PI擦除替换为3.14
		 * 此时在运行期间就无需加载K类，也能运行并且输出3.14 */
		System.out.println(K.PI);
		K k = new K();
		
		//final修饰方法---不可被重写
		
		//final修饰类---不可被继承
		
		
	}//main
	
	//final定义参数
	public static String f(final int a,int b){
		//a = 1; //编译错误---在参数传入该方法时就已经第一次初始化
		b = 2;
		return a+","+b;
	}
	
}
//final定义成员变量
class Roo{
	int a;
	final int b;
	public Roo(int b){
		this.b = b;
	}
}
//常量定义
class K{
	public static final double PI = 3.14;
	static{
		System.out.println("加载K");
	}
}

//final修饰方法---不可被重写
class A{
	final public void a1(){}
	public void a2(){}
}
class B extends A{
	//public void a1(){} //编译错误
	public void a2(){}
}

/* final修饰类---不可被继承
 * JDK中一些基础类会使用，例如：Math String Double Integer等 */
final class C{}
//class D extends C{} //编译错误








