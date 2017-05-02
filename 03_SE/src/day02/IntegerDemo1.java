package day02;
/**
 * 包装类
 * 用于解决基本类型不能参加面向对象开发的问题
 * 数字类型的包装类都继承于抽象类Number，它定义了一系列方法，允许数字类型之间进行相互转换
 * @author Administrator
 *
 */
public class IntegerDemo1 {
	
	public static void main(String[] args) {
		//基本类型转换包装类
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		//利用包装类赋值
		Integer i3 = Integer.valueOf(127);
		Integer i4 = Integer.valueOf(127);
		
		System.out.println(i1==i2); //false
		System.out.println(i1.equals(i2)); //true
		System.out.println(i3==i4); //true
		System.out.println(i3.equals(i4)); //true
		
		long l = 123;
		Long l1 = Long.valueOf(l); //参数赋值
		Long l2 = Long.valueOf(123); //直接赋值
		System.out.println(l1.equals(l2));
		//包装类转换为基本类型
		l = i3.longValue();
		int i = i3.intValue();
		double d = i3.doubleValue();
		System.out.println(d);
	}
	
}
