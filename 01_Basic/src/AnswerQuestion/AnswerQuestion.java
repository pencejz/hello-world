package AnswerQuestion;
//做10道计算题
import java.util.Scanner;

public class AnswerQuestion {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		int score=0; //保存分数
		for(int i=1;i<11;i++){
			//出题---随机产生1~100的整数
			int a=(int)(Math.random()*100)+1;
			int b=(int)(Math.random()*100)+1;
			int result=a+b; //保存a+b的值
			System.out.println("请作答第"+i+"题."+a+"+"+b+"=?");
			//答题
			System.out.print("请写出你的答案(输入-1退出):");
			int answer=scan.nextInt(); //用户输入的答案
			//输入-1，提前结束,退出循环
			if(answer==-1){
				break;
			}
			//判题
			if(answer==result){
				System.out.println("恭喜你，你答对了！");
				score+=10;
			}else{
				System.out.println("真遗憾，你答错了！");
			}
			//总分计算
		}
		
		System.out.println("总分为:"+score);
		scan.close();
	}

}
