package day04;
/**三目运算*/
import java.util.Scanner;

public class Opt3Demo {

	public static void main(String[] args) {
		/**
		 *条件表达式---三目运算
		 */
		//根据用户输入的总行数rows，每页25行，计算输出总页数
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入页数：");
		int rows = scan.nextInt();
		int pages;
		
		//三目运算
		pages = rows%25 == 0 ? rows/25 : rows/25+1; //计算页数
		System.out.println("总的页数为："+pages);
		
		//三目运算嵌套
		int size = (0<=rows && rows<=65535)  //输入的页数在某一范围内
				? (pages = rows%25 == 0 ? rows/25 : rows/25+1)  //计算页数
				: 0;
		if(size == 0){
			System.out.println("你输入的页数有误！");
		}
		System.out.println(size);
		int a = -3;
		String r = a>0 ? "正数" : (a == 0 ? "0" : "负数");
		System.out.println("r="+r);
		/**闰年的判断程序
		 * 用户输入一个年份
		 * 条件1.能被4整除,不能被100整除
		 *    2.能被400整除
		 */
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		boolean leap = ((year%4 == 0) && !(year%100 == 0)) || (year%400 == 0);
		if(leap){
			System.out.println(year+"年是闰年");
		}else{
			System.out.println(year+"年不是闰年");
		}
		
		scan.close();
		
	}//main

}//class


















