package day02;
/**
 * 测试Point重写Object的相关方法
 * 1.输出toString方法
 * 2.比较equals方法
 * @author Administrator
 *
 */
public class TextPoint {
	
	public static void main(String[] args) {
		//toString方法
		Point p = new Point(1,2);
		String str = p.toString();
		System.out.println(str);
		/*
		 * system.out.println(Object o);
		 * 该方法会将给定对象toString方法返回的字符串输出到控制台
		 */
		System.out.println(p);
		//equals
		Point p1 = new Point(1,2);
		System.out.println(p==p1); //false---不是同一对象，地址不同
		System.out.println(p.equals(p1)); //true
		/*
		 * 比较字符串就要使用equals方法
		 * 所有引用类型变量，若希望比较的是对象内容都应当使用equals
		 */
		String str1 = "helloworld";
		String str2 = "helloworld";
		String str3 = new String("helloworld");
		System.out.println(str1==str2); //true
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str3)); //true
		
	}//main
	
	
}
