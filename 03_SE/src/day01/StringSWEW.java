package day01;
/**
 * 判断当前字符串是否以给定字符串开头或结尾
 * boolean startWith(String str)
 * boolean endWith(String str)
 * @author Administrator
 *
 */
public class StringSWEW {
	
	public static void main(String[] args) {
		String str = "thinking in java";
		//判断str是否以thi开头
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		//判断str是否以ava结束
		boolean ends = str.endsWith("ava");
		System.out.println(ends);
		
		
	}
}
