package day02;
/**
 * 字符串支持正则表达式方法2:
 * String split(String regex)
 * 将当前字符串中满足正则表达式的地方进行拆分，将拆分后的所有字符串返回
 * @author Administrator
 *
 */
public class StringSplit {

	public static void main(String[] args) {
		
		String str = "abc123def456ghi789jkl";
		//按照数字部分拆分
		String regex = "[0-9]+";
		String[] ary = str.split(regex);
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}

	}//main

}
