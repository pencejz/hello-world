package day05;
/**DoWhile实现检测用户输入的是否是0~100之间的分数的方法*/
import java.util.Scanner;

public class Score {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		//score();
		//ifScore();
		//switchScore();
		
	}//main
	
	/**DoWhile实现检测用户输入的是否是0~100之间的分数的方法 */
	public static void score(){
		int score; //接收用户输入的分数
		do{ //用户输入分数
			System.out.print("请输入分数：");
			score = scan.nextInt();
			if(0>score || score>100){
				System.out.println("你输入的分数不合法！请重新输入！");
			}
		}while(0>score || score>100);
		System.out.println("你输入的分数为："+score);
	}
	/**
	 * DoWhile实现检测用户输入的是否是0~100之间的分数的方法
	 * 根据用户输入的分数，用if语句输出对应的等级
	 */
	public static void ifScore(){
		int score;
		do{
			System.out.print("请输入分数：");
			score = scan.nextInt();
			if(0>score || score>100){
				System.out.println("你输入的分数不合法！请重新输入！");
			}
		}while(0>score || score>100);
		System.out.println("你输入的分数为："+score);
		//if输出对应等级
		if(score >=90){
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score >=70){
			System.out.println("C");
		}else if(score >=60){
			System.out.println("D");
		}else if(score <60){
			System.out.println("不及格！！！");
		}
		
	}
	/**
	 * DoWhile实现检测用户输入的是否是0~100之间的分数的方法
	 * 根据用户输入的分数，用switch语句输出对应的等级
	 */
	public static void switchScore(){
		//用户输入和分数检测
		int score;
		do{
			System.out.println("请输入分数：");
			score = scan.nextInt();
			if(0>score || score>100){
				System.out.println("你输入的分数不合法！请重新输入！");
			}
		}while(0>score || score>100);
		System.out.println("你输入的分数为："+score);
		//等级查询
		switch(score/10){
		case 10:
			System.out.println("恭喜你！获得100分！");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:	
			System.out.println("B");
			break;
		case 7:	
			System.out.println("C");
			break;
		case 6:	
			System.out.println("D");
			break;
		default:
			System.out.println("不及格！！！");
			
		}
		
	}

	
}//class









