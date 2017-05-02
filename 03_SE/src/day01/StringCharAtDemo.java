package day01;
/**
 * char charAt(int index)
 * 获取指定下标位置对应的字符
 * 
 * @author Administrator
 *
 */
public class StringCharAtDemo {
	public static void main(String[] args) {
		
		//            01234567890123456
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c); //i
		c = str.charAt(10);
		System.out.println(c); //n
	}
	
}
