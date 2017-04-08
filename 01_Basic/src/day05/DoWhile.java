package day05;

import java.util.Random;

import java.util.Scanner;

public class DoWhile {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//score();
		//guessNumber();
		
	}//main
	
	/**检查用户的输入是否为0~100之间的分数*/
	public static void score(){
		int score; //用户输入的分数
		do{
			System.out.print("请输入分数：");
			score = scan.nextInt();
			
		}while(0>score || score>100);
		
		System.out.println("你输入的分数为："+score);
	}
	/**DoWhile实现猜数字游戏*/
 	public static void guessNumber(){
 		//实现系统产生随机数
		Random random = new Random();
		int num = random.nextInt(10)+1;
		
		int n; //保存用户猜测的数
		do{
			System.out.println("猜吧：(输入0---退出)");
			n = scan.nextInt();
			if(n==0){
				break;
			}
			if(n>num){
				System.out.println("大了");
			}
			if(n<num){
				System.out.println("小了");
			}
		}while(n!=num);
		System.out.println("猜对了！！！");
	}
	
}//class
