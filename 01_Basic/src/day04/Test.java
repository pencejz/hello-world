package day04;

import java.util.Scanner;

public class Test {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		/**
		 * 作业：
		 * 1.在柜台收款基础上，实现：
		 *	当总价<=50,-2元
		 *	当总价<=200,9.5折
		 * 	当总价<=500,9折
		 * 	当总价>500,8折
		 */
		//pay();
		
		/**
		 * 接收用户输入的会员积分score，计算并输出会员对应的折扣discount
		 * 积分小于2000，折扣为0.9
		 * 积分大于等于2000并且小于4000，折扣为0.8
		 * 积分大于等于4000并且小于8000，折扣为0.7
		 * 积分大于8000，折扣为0.6
		 */
		//score();
		
		//score1();
		
		/**
		 * 接收用户输入的choice，用switch结构
		 * 输入1，提示“请购物”
		 * 输入2，提示“购物结算”
		 * 输入3，提示“欢迎下次光临”
		 * 输入其他数据，提示“输入错误”
		 */
		//choice();
		
	}//main
	
	public static void pay(){
		System.out.println("---------柜台收款--------");
		//信息的输入：单价、数量、支付金额
		System.out.print("请输入单价：");
		double price = scan.nextDouble();
		System.out.print("请输入数量：");
		double count = scan.nextDouble();
		System.out.print("请输入付款金额：");
		double pay = scan.nextDouble();
		//计算
		double total = price * count;
		//优惠实现
		if(total <0){
			System.out.println("你输入的单价或数量错误！");
		}else if(total <= 50){
			total = total - 2;
		}else if(total <= 200){
			total = total*0.95;
		}else if(total <= 500){
			total = total*0.9;
		}else if(total > 500){
			total = total *0.8;
		}
		double bal = pay - total;
		//输出
		System.out.println("商品金额："+total);
		System.out.println("支付金额："+pay);
		System.out.println("找零："+bal);
	}
	
	public static void score(){
		System.out.println("---------积分折扣--------");
		//用户输入积分
		System.out.print("请输入会员积分：");
		int score = scan.nextInt();
		//折扣选择
		if(score < 0){
			System.out.println("你输入的积分不正确！");
		}else if(score <2000){
			System.out.println("Discount=0.9");
		}else if(score <4000){
			System.out.println("Discount=0.8");
		}else if(score <8000){
			System.out.println("Discount=0.7");
		}else if(score >=8000){
			System.out.println("Discount=0.6");};
	}
	
	public static void score1(){
		System.out.println("---------积分折扣--------");
		//用户输入积分
		System.out.print("请输入会员积分：");
		int score = scan.nextInt();
		double discount=1;
		//折扣选择
		if(score < 0){
			System.out.println("你输入的积分不正确！");
		}else if(score <2000){
			discount = 0.9;
		}else if(score <4000){
			discount = 0.8;
		}else if(score <8000){
			discount = 0.7;
		}else if(score >=8000){
			discount = 0.6;
			}
		System.out.println(discount);
	}

	public static void choice(){
		System.out.println("---------购物选择--------");
		//用户输入
		System.out.println("请选择功能：");
		int choice = scan.nextInt();
		//功能选择
		switch(choice){
		case 1:
			System.out.println("请购物...");
			break;
		case 2:	
			System.out.println("购物结算...");
			break;
		case 3:
			System.out.println("欢迎下次光临！！！");
			break;
		default:
			System.out.println("输入错误！！！");
		}
		
	}
	
}//class

/**
 * 经典试题：
 * int n;
 * int i = 0;
 * while(i<4){
 * 		i++;
 * 		n = 5;
 * }
 * system.out.println(n);
 * 出现编译错误提示：因为编译器在编译期间认为，while循环可能不会执行，此时n将不会被赋初值
 */

