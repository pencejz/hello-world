package day03;

import java.util.Scanner;

public class CharDemo {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		/**从控制台输入一个字符，判断是否是英文字符*/
		System.out.print("请输入字符串：");
		String str = scan.nextLine();
		char c = str.charAt(0);
		boolean isChar = ('A'<=c&&c<='Z')||('a'<=c&&c<='z');
		System.out.println(isChar);
		
		/**从控制台输入一个字符，判断不是英文字符*/
/*		System.out.print("请输入字符串：");
		String str1 = scan.nextLine();
		char c1 = str1.charAt(0);
		boolean isChar1 = !(('A'<=c&&c<='Z')||('a'<=c&&c<='z'));
		System.out.println(isChar1);
*/		
		/**从控制台输入一个年龄，判断是否为儿童，如果是，就输出儿童节快乐*/
/*		System.out.println("请输入年龄：");
		int age = scan.nextInt();
		if(age<=16){
			System.out.println("儿童节快乐！");
		}
*/		
		/**
		 * 短路逻辑
		 * 1.相与时，第一个为假，即可得到false
		 * 2.相或时，第一个为真，即可得到true
		 */
		int i = 100,j = 200;
		boolean b1 = (i>j)&&(i++>100);
		System.out.println(b1); //i>j为假，不会判断i++>100,就可得到false
		System.out.println(i); //i的结果为100，i++未执行，即出现短路
		boolean b3 = (i<j)&&(i++>100);
		System.out.println(b3); //i<j为真，继续判断i++>100为假，最后得到false
		System.out.println(i); //i的结果为101，执行过i++
		boolean b2 = (i<j)||(j++<200);
		System.out.println(b2); //i<j为真，不会执行j++，就可得到true
		System.out.println(j); //j的结果我200，j++未执行，即出现短路
		
		scan.close();
	}
}
