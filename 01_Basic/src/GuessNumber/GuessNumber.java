package GuessNumber;
//1.设计循环--->大小对比
import java.util.Scanner;   //用户输入支持

public class GuessNumber {
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);   //声明
		int num=250;
		
		System.out.println("猜吧！");
		int guess=s.nextInt();      //1.循环变量输入初始化
		while(guess!=num){             //2.循环条件
			//大小对比提示
			if(guess<num){
				System.out.println("小了");
			}else{
				System.out.println("大了");
			}
			
			System.out.println("猜吧！");
			guess=s.nextInt();          //3.循环变量的改变
		}
		System.out.println("恭喜你答对了！");
		
		s.close();
		
	}//main
		
}//class


