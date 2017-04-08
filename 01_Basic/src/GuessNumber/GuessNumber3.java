//3.增加得分
package GuessNumber;
//猜数字游戏
import java.util.Scanner;  //用户输入支持

public class GuessNumber3 {
	
	public static void main(String[] args){
		int score=0;
		Scanner scan=new Scanner(System.in);   //声明
		//系统随机生成整数
		int num=(int)(Math.random()*1000+1);  //随机生成1--1000的整数
		                                      //Matn.random()--------随机生成0--0.9999...
		                                      //Matn.random()*1000--------随机生成0--999.9...
		                                      //Matn.random()*1000+1--------随机生成1--1000.999...
		                                      //(int)(Matn.random()*1000+1)--------随机生成1--1000的整数(强制转换)
		System.out.println(num);      //显示随机生成数
		String a=String.valueOf(num);		//计算随机生成整数的长度
		System.out.println(a.length());     //显示随机生成数的长度
		System.out.println("猜吧！(按0退出)");
		int guess;
		int i=0; //猜测次数
		for(;i<1000;i++){
			guess=scan.nextInt();
			if(guess==0){
				System.out.println("下次再来吧！");
				break;
			}else if(guess==num){
					score=a.length()*100-i*10;
					System.out.println("恭喜你答对了！您的得分是:"+score+"分。你总共猜了"+i+"次。");
					break;
				}else if(guess<num){
					System.out.println("小了");
				}else{
					System.out.println("大了");
				}
				System.out.println("继续猜吧！");
					
		}//for
		
		scan.close();
		
	}//main
	
}//class



