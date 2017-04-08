package day02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] arges){
		/**任务一
		 * 接收用户输入的如下数据，并输出：
		 * 声明int型变量age用于存储你的年龄
		 * 声明double型变量price用于存储你今日早餐消费的金额
		 * 声明char型变量gender用于存储你的性别
		 * 声明boolean型变量isMerried用于存储你已婚与否的状态
		 */
//		test1();

		/**任务二
		 * 编写一个收银柜台收款程序。
		 * 要求：接收用户输入的商品单价、购买数量以及收款金额
		 * 计算并输出应收金额和找零
		 * BigDecimal---专门精确计算浮点数的类
		 */
//		test2();
		
		
		/**思考
		 * char x;int y;float w,z;
		 * 问x*y+w-z的结果是什么类型？
		 */
		char x='a';
		int y=1;
		float w=2.5f;
		float z=1.1f;
		a(x*y+w-z);
		
	}//main
	
	//计算结果为double型输出double
	public static void a(double d){
		System.out.println("double");
	}
	//计算结果为float型输出结果为float
	public static void a(float f){
		System.out.println("float");
	}
	
	
	public static void test1(){
		//用户输入年龄
		System.out.println("请输入年龄：");
		int age=scan.nextInt();
		System.out.println("你输入的年龄是："+age);
		//用户输入价格
		System.out.println("请输入价格：");
		double price=scan.nextDouble();
		System.out.println("你输入的价格是："+price);
		//用户输入性别
		System.out.println("请输入性别：");
		String gender=scan.nextLine();
		System.out.println("你输入的性别是："+gender);
		//用户输入是否结婚
		System.out.println("请输入是否结婚：");
		boolean isMerried=scan.nextBoolean();
		System.out.println("你输入的婚姻状况是："+isMerried);
		
	}
	
	public static void test2(){
		//商品单价输入
		System.out.print("请输入单价：");
		double price=scan.nextDouble();
		//购买的数量
		System.out.print("请输入购买数量：");
		int count=scan.nextInt();
		//实际收款金额
		System.out.println("顾客给的钱：");
		double pay=scan.nextDouble();
		//应收金额
		double total=price*count;
		//找零
		double bal=pay-total;
		BigDecimal b = new BigDecimal(bal);
		double bal2 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		//输出
		System.out.println("应收金额："+total+"元");
		System.out.println("已支付："+pay+"元");
		System.out.println("找零："+bal2+"元");
		
	}

	
}//class
