//2.增加中途退出---->系统随机生成整数
package GuessNumber;
import java.util.Scanner;  //用户输入支持

public class GuessNumber2 {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);   //声明
		//系统随机生成整数
		int num=(int)(Math.random()*1000+1);  //随机生成1--1000的整数
		                                      //Matn.random()--------随机生成0--0.9999...
		                                      //Matn.random()*1000--------随机生成0--999.9...
		                                      //Matn.random()*1000+1--------随机生成1--1000.999...
		                                      //(int)(Matn.random()*1000+1)--------随机生成1--1000的整数(强制转换)
		//System.out.println(num);      //显示随机生成数
		
		System.out.println("猜吧！");
		int guess=scan.nextInt();      //循环变量输入初始化
		
		while(guess!=num){             //循环条件
			
			if(guess==0){
				break;                 //得到0就直接退出
			}
			
			if(guess<num){
				System.out.println("小了");
			}else{
				System.out.println("大了");
			}                			//大小对比提示
			
			
			System.out.println("猜吧！");
			guess=scan.nextInt();             //循环变量的改变
			
		}
		
		if(guess==num){
			System.out.println("恭喜你答对了！");
		}else{
			System.out.println("下次再来吧！");
		}
		
		scan.close();
		
	}//main
	
}//class



