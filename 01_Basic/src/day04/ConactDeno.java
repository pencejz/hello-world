package day04;
/** “+”的使用 */
public class ConactDeno {

	public static void main(String[] args) {
		/**
		 * + :两种功能（重载）
		 * 1).数值计算功能
		 * 2).字符串连接：当+的一端出现字符串时，就采用连接功能
		 */
		int a = 100;
		String str = "a="+a;
		//过程：先将第二个a转换成100，再将"a="与"100"连接
		System.out.println(str); //a=100
		
		
		/**常见问题*/
		//计算次序
		String s1 = "a" + 1 + 2 + 3;
		String s2 = 1 + 2 + 3 + "a";
		String s3 = 'a' + 1 + 2 + 3 +"";
		//String s3 = 'a' + 1 + 2 + 3;---编译错误。
		//原因：字符a在计算时系统会默认转换成int型，计算结果即为int型，就不能直接赋值给String型
		
		System.out.println("s1="+s1+",s2="+s2+",s3="+s3);
		
	}//main

}//class
