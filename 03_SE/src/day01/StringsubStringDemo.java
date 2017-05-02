package day01;
/**
 * String substring[int startIndex,int lastIndex)
 * 截取一段字符串
 * @author Administrator
 *
 */
public class StringsubStringDemo {

	public static void main(String[] args) {
		//            0123456789
		String str = "thinking in java";
		/**
		 * java中的API使用两个数字表示范围时，通常是含头不含尾[)
		 */
		String sub = str.substring(5,8); //取出的下标为567
		System.out.println(sub); //ing
		
		/*
		 * 重载方法：只传一个参数
		 * 从某一位置开始截取到末尾
		 */
		sub = str.substring(9);
		System.out.println(sub); //in java
	}

}
