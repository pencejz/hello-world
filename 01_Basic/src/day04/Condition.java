package day04;
//条件句
import java.util.Scanner;

public class Condition {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
//		If();
//		IfElse();
//		SwitchCase();
		
	}//main
	
	
	/**分支结构---if语句*/
	public static void If(){
		System.out.println("--------柜台收款程序---------");
		//1.读取用户输入信息：单价、数量、金额
		System.out.print("请输入单价：");
		double price = scan.nextDouble();
		System.out.print("请输入数量：");
		double number = scan.nextDouble();
		System.out.print("请输入金额：");
		double pay = scan.nextDouble();
		//2.计算：总价、找零
		double total = price*number;

		if(total <= pay){ //当总价<=支付金额时，正常支付。否则输出金额不足
			
			if(total >= 500){ //当总价>=500时，打八折
				
				if(pay >=total*0.8){ //当支付的金额>=总价*0.8
					
					total = total*0.8;
					double sub = pay - total;
					System.out.println("商品金额："+total);
					System.out.println("已支付："+pay);
					System.out.println("找零："+sub);
					
				}else{
					System.out.println("金额不足！");
					}
				
			}else{
				System.out.println("金额不足！");
				}
			
		}else{
			System.out.println("金额不足！");
			}
		
		
		
	}//If
	
	/**分支结构---if else语句*/
	public static void IfElse(){
		
		System.out.println("---------学生成绩记录-----------");
		//分数输入
		System.out.println("请输入一个分数：");
		int score = scan.nextInt();
		if(0>score ||score > 100){
			System.out.println("你输入的分数不合法！");
		}else if(score >= 90){
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score >=70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else{
			System.out.println("不及格！");
		}
	}
	/**
	 * 分支---switch语句
	 * switch 与   if else if区别：
	 * 1.switch 只嗯呢该根据整数条件进行分支
	 *   if else 可以根据任一条件进行分支。使用更为广泛
	 * 2.switch 的运算性能好于if else
	 *   如果分枝条件是整数，就用switch
	 */
	
	public static void SwitchCase(){
		/*分数等级
		 * A---[90,100]
		 * B---[80,90)
		 * C---[70,80)
		 * D---[60,70)
		 * 不及格---[0,60)
		 */
		System.out.println("--------分数等级---------");
		int score; //用户输入的分数
		//检查不合法分数输入
		do{
			System.out.print("请输入分数：");
			score = scan.nextInt();
		}while(0>score || score>100);
		//根据分数输出等级
		switch(score/10){
		case 10:
		case 9:      //9,10均得到A
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
		default:  //除了以上情况之外均输出不及格
			System.out.println("不及格！");
		}
		
	}
	
}//class
