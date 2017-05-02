package day01;
/**
 * int indexOf(String str)
 * 查看给定的字符串在当前字符串中的位置
 * @author Administrator
 *
 */
public class StringIndexOfDemo {

	public static void main(String[] args) {
		/**
		 *int indexOf(String str)
		 */
		//            0123456789012345
		String str = "thinking in java"; //thinking in java---java编程思想 
		int index = str.indexOf("in");
		System.out.println(index); //2
		//返回的是第一次出现在字符串中的位置。若没有匹配到，则返回-1
		//             012345678901234567
		String str1 = "thiankiang in java";
		index = str1.indexOf("in");
		System.out.println(index); //11
		
		/**
		 * int indexOf(String str, int a)
		 * 重载方法允许从指定位置开始查找字符串第一次出现的位置
		 */
		index = str.indexOf("in", 3);
		System.out.println(index); //5
		
		/**
		 * int lastIndexOf(Sting str)
		 * 查找最后一次出现的位置
		 */
		index = str.lastIndexOf("in");
		System.out.println(index); //9
	}

}











