package day11;

import day11Concorl.Too;

public class TestControl {

	public static void main(String[] args) {
		
		/*
		 * 包的全名声明类的对象
		 * 当访问两个包中具有相同的的类名的类的时候使用
		 */
		day11Concorl.Goo goo1 = new day11Concorl.Goo();
		goo1.t();
		
		//测试private 与   public的区别
		Point p1 =new Point(4,5);
		//x是private修饰，可见范围类的内部，在类外不能访问
		//int x = p1.x; //编译错误
		int y = p1.y;
		p1.test();
		
		/*
		 * protected 与   默认控制
		 * 除开父类子类，其余用法基本相同
		 */
		Too t = new Too();
		//int a = t.a; //编译错误，不可访问
		Xoo x = new Xoo();
		int b = x.b; //编译正确
		
		//protected继承中的使用
		Son s = new Son();
		s.test(); //0
		//通过子类Son可以访问父类Father中的属性a
		
		
		
		
	}//main
	
}

class Point{
	private int x;
	public int y;
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void test(){
		System.out.println(x+","+y);
	}
	
}




/**
 * 访问控制
 * 1.import : 跨包访问
 *       所有包中的类名都没有重复时，直接使用import导入(包名.类名)声明
 *       当访问两个包中具有相同的的类名的类的时候，需要使用包的全名来声明对象。此时就不能使用import(失效)
 *         如想要在day11以外的包里使用蜜蜂类Bee，可写作：day11.Bee b = new day11.Bee();
 *         
 * 2.public 与    private
 *         
 * 3.protected 与   默认
 *    两个都是当前包内有效
 *    在不同包中，默认的不可访问。但是，如果是父类使用protected，则在不同包中的子类可以访问
 * 4.static
 *    修饰的成员变量不属于对象的数据结构
 *    static变量是属于类的变量，通常可以通过类名来引用static成员
 *    static成员变量和类的信息一起存储在方法区中，一个类中的static成员变量只有一份，全体共享        
 */








