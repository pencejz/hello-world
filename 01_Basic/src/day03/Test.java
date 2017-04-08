package day03;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * 作业：
		 * 1.从控制台输入一个秒数，计算并显示为  ？时？分？秒
		 * 2.从控制台输入一个分数，检查是否为优秀，优秀的条件：100~90分。是优秀，显示true，不是，显示为false
		 * 3.检查一个人的年龄，是否是35~50之间，是就显示“你是一个中年人”
		 * 4.输入一个人的年龄，计算5年以后的年龄是多少，使用+= 运算
		 */
		//time();
		
		/**
		 * 5.6元打八折---常见错误
		 */		
		discount();
		
	}//main
	

	public static void discount(){
		
		double price = 80/100*5.6;
		System.out.println(price); //输出0.0
		//错误解决：将80改为80D或者是80.0
		double price1 = 80.D/100*5.6;
		System.out.println(price1); //4.4799999999999995
		
		//保留两位小数输出
		//方法一：
		BigDecimal b = new BigDecimal(price1);
		double price2 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("方法一输出："+price2);
		//方法二：printf方法
//		double price3 = 80.00/100*5.6;
//		System.out.printf("%.2f", price3);
	}
	
	public static void time(){
		//输入一个秒数，计算出时分秒
		System.out.println("请输入一个秒数：");
		int input = scan.nextInt();
		int hour = input/60/60%24;
		int min = input/60%60;
		int sec = input%60;
		System.out.println(input+"秒有"+hour+"小时"+min+"分钟"+sec+"秒");
		//输入一个分数，判断优秀
		System.out.println("请输入一个分数：");
		int score = scan.nextInt();
		boolean b1 = 90<=score && score<=100;
		System.out.println(b1);
		//输入一个年龄，然后判断中年人
		System.out.println("请输入一个需要判断的年龄：");
		int age1 = scan.nextInt();
		boolean b2 = 35<=age1 && age1<=50;
		if(b2){
			System.out.println("你是一个中年人");
		}else{
			System.out.println("YOU ARE A HANDSON");
		}		
		//输入一个年龄，然后计算五年后的年龄
		System.out.println("请输入一个需要计算的年龄：");
		int age2 = scan.nextInt();
		age2+=5;
		System.out.println("你5年后"+age2+"岁");
	}
	
	
	
}//class




