package day01;
/**
 * String trim()
 * 去除字符串两边的空白字符，但是字符串中间的字符不能去掉
 * @author Administrator
 *
 */
public class StringTrimDemo {
	public static void main(String[] args) {
		
		String str = "	hello      ";
		String trim = str.trim();
		System.out.println(trim);
		
		str = "	he  llo      ";
		trim = str.trim();
		System.out.println(trim);
	}
}
