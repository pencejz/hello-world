package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 * 1.完成全部的课堂案例
		 * 2.接收10个评委的打分并存储在scores数组中对该数组进行统计
		 * 	   去掉最高分和最低分（缩容）
		 * 	   计算平均分并放在（扩容后）最后一位
		 */
		//average();
		
		/**
		 * 找出从2到某个数的范围内的所有质数，并输出
		 * 要求分行输出，每行最多10个数
		 */
		//prime();
		
	}//main
	
	public static void average(){
		System.out.println("请选择数组的产生方式：");
		System.out.println("\t1.系统随机产生10个0~100的随机整数。");
		System.out.println("\t2.用户输入产生10个0~100的整数。");
		System.out.print("请选择1或者2： ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] scores = new int[10];
		if(n==1){
			//系统随机产生10个0~100的随机数，保存到数组scores中
			Random r = new Random();
			for(int i=0;i<scores.length;i++){
				scores[i] = r.nextInt(100)+1;
				//scores[i] = (int)Math.random()*100+1;
			}
		}else if(n==2){
			//用户输入10个数，作为一个数组
			System.out.println("请输入10个数，每个数之间以空格隔开：");
			for(int i=0;i<scores.length;i++){
				scores[i] = scan.nextInt();
			}
		}
		scan.close();
		//显示scores数组
		System.out.println("scores = "+Arrays.toString(scores));
		//将最高分保存到数组的最后一个
		for(int i=0;i<=scores.length-2;i++){
			if(scores[i]>scores[scores.length-1]){
				int max = scores[scores.length-1];
				scores[scores.length-1] = scores[i];
				scores[i] = max;
			}
		}
		//通过数组的缩容，去掉最高分
		scores = Arrays.copyOf(scores, 9);
		System.out.println("去掉最高分后scores= "+Arrays.toString(scores));
		//将最低分保存到数组最后一个元素
		for(int i=0;i<=scores.length-2;i++){
			if(scores[i]<scores[scores.length-1]){
				int lit = scores[scores.length-1];
				scores[scores.length-1] = scores[i];
				scores[i] = lit;
			}
		}
		//通过数组缩容，去掉最低分
		scores = Arrays.copyOf(scores, scores.length-1);
		System.out.println("去掉最低分后scores= "+Arrays.toString(scores));
		//计算平均分
		int sum = 0;
		for(int i=0;i<scores.length;i++){
			sum += scores[i];
		}
		int ave = sum/scores.length;
		//通过数组扩容保存到scores末尾
		scores = Arrays.copyOf(scores, scores.length+1);
		scores[scores.length-1] = ave;
		System.out.println("末尾添加了平均分的scores= "+Arrays.toString(scores));
		
	}//Average方法
	
	public static void prime(){
		//输入一个数
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个不小于2的数：");
		int input = scan.nextInt();
		if(input<2){
			System.out.println("你输入的数据不合法！请重新输入一个不小于2的数！");
			input = scan.nextInt();
		}
		scan.close();
		//找出其中的质数
		int[] primes = new int[1]; //保存质数的数组
		for(int i=2;i<=input;i++){ //i表示被除数
			
			for(int j=2;j<=i;j++){ //j表示除数
				
				if(i%j!=0){
					Arrays.copyOf(primes, primes.length+1);
					primes[primes.length-1] = i;
				}
			}
		}
		//分行输出
		for(int i=0;i<primes.length;i++){ //i表示数组下标
			System.out.print(primes[i]+"\t");
			if(i%9==0){
				System.out.println();
			}
		}
		
	}//Prime方法
	
}//class
