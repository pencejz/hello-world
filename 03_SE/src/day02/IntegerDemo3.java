package day02;
/**
 * parseXXX静态方法
 * 可以将字符串转化为对应的基本类型
 * 但是要求该字符串必须可以正确描述要转换的基本类型可以保存的值，否则抛出异常
 * @author Administrator
 *
 */
public class IntegerDemo3 {
	
	public static void main(String[] args) {
		
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println(i+1); //124
		
		String str1 = "123.456";
		double d = Double.parseDouble(str1);
		System.out.println(d); //123.456
		
		i = Integer.parseInt(str1);
		System.out.println(i); //运行时就会抛出异常
		
	}
}
