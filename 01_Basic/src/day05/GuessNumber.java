package day05;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 给定一个数a，用户猜测
 * 提示大了或者小了，然后继续猜测
 * 直到猜测正确为止
 * 0---退出
 * 利用时间产生随机数:1.nanoTime():纳秒数
 *              2.Radom类
 */
public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//int a = (int)(System.nanoTime() %100 +1);
		Random random = new Random();
		int a = random.nextInt(10)+1;
		System.out.println(a);
		while(true){
			System.out.println("猜吧：(输入0---退出)");
			int n = scan.nextInt();
			if(n==0){
				System.out.println("欢迎下次再来！");
				break;
			}
			if(n==a){
				System.out.println("恭喜你猜对了！");
				break;
			}
			if(n<a){
				System.out.println("小了");
			}
			if(n>a){
				System.out.println("大了");
			}
			
		}//while
		
	}//mian
	
}//class
