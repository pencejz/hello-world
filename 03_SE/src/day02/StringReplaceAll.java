package day02;
/**
 * 字符串支持正则表达式方法3:
 * Srting replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定字符串
 * @author Administrator
 *
 */
public class StringReplaceAll {
	
	public static void main(String[] args) {
		
		String str = "abc123def456ghi789jkl";
		//将数字部分替换为“ #NUMBER# ”
		str = str.replaceAll("\\d+", " #NUMBER# ");
		System.out.println(str);
		//将字母部分换成“ #WORD# ”
		str = str.replaceAll("[a-z]+", " #WORD# ");
		System.out.println(str);
		//和谐用语
		String regex = "(wqnmlgb|nc|cnm|nmsl|mdzz|tmd|wtf|djb)";
		String m = "wtf!wqnmlgb!你怎么这么的nc！你这个djb！";
		m = m.replaceAll(regex, "****");
		System.out.println(m);		
		
		
	}//main
}
