package day11;

public class Demo01 {
	
	public static void main(String[] args) {
		/**
		 * 重写与重载
		 * 重载：根据方法名和调用时候的参数类型来确定调用哪个方法
		 *     编译时期绑定，由变量类型决定---看变量前面的类型
		 * 重写：调用子类对象重写的方法，无论引用这个对象的变量是什么类型，总是调用重写的方法
		 *     运行时期绑定，由对象类型决定---看变量后面的类型
		 */
		//重载测试
		Goo goo = new Goo();
		Sub obj = new Sub();
		goo.g(obj); //调用g(Sub obj)方法
		Super sup = new Super();
		goo.g(sup); //调用g(Super obj)方法
		//重写测试
		Sub s = new Sub();
		s.f(); //调用子类型test方法
		Super ss = new Sub();
		ss.f(); //调用子类型test方法
		Super sss = new Super();
		sss.f(); //调用父类型test方法
		
		goo.g(s);
		goo.g(ss);
		goo.g(sss);

	}
}
//定义类
class Super{
	public void f(){
		System.out.println("Super.f()");
	}
}
class Sub extends Super{
	public void f(){
		System.out.println("Sub.f()");
	}
}
class Goo{
	//定义g重载方法
	public void g(Super obj){
		System.out.println("g(Super)");
	}
	public void g(Sub obj){
		System.out.println("g(Sub)");
	}
}




/**
 * 面向对象：编写构建可以反复重用的程序组件
 * 1.类：反复重用的组件
 * 2.属性：一组数据
 * 3.构造方法：数据初始化重用
 * 4.方法：重复使用的功能
 * 5.继承：子类复用父类的方法和属性
 * 
 */


/**
 * 飞机大作战
 * 1.找对象，泛化父类，子类继承
 * 2.初始化
 *      飞行物出现位置：x(屏幕宽度W-飞行物宽度w)
 *                 y==-飞行物高度h;
 *   父类定义有参构造方法，用于飞行物继承，英雄机类和子弹类不适用，故还需要添加无参构造方法
 *   为每个子类添加构造方法
 * 3.父类中添加toString()方法，test测试类中查看数据
 * 4.Hero类中定义shoot方法，并测试
 * 5.方法的重写
 *     子类可以重写继承自父类的方法，即方法名和参数列表与父类的方法相同，但是方法的实现不同
 *     当子类对象的重写方法被调用时，运行的的是子类重写后的版本
 *  子弹重写父类move方法(父类中定义为向下移动)---实现向上移动
 * 6.英雄机重写父类move方法---取消移动功能
 *   英雄机定义move方法实现英雄机随鼠标移动        
 *                 
 */













