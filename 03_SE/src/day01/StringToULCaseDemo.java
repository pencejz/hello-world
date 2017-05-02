package day01;
/**
 * String toUpperCase()---将一串字符全部改为大写
 * String toLowerCase()---将一串字符全部改为小写
 * @author Administrator
 *
 */
public class StringToULCaseDemo {

	public static void main(String[] args) {
		String str = "我爱java";
		String upper = str.toUpperCase();
		System.out.println("upper = "+upper);
		
		String lower = upper.toLowerCase();
		System.out.println("lower = "+lower);
	}

}
