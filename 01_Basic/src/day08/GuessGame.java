package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//猜字符游戏
public class GuessGame {
	
	/**
	 * 1.生成5个不重复的字符---generate()方法
	 * 2.获取用户输入的一组字符
	 * 3.猜错就重复执行do{}while();实现
	 * 4.数组对比，结果输出
	 * 5.得分计算，总分10000，猜错一次扣10分，分数减至0退出程序（阶梯算分？？？？？？？？）
	 */
	public static void main(String[] args) {
		//生成5个不重复的字符
		char[] answer = generate(5);
		//获取用户输入的一组字符
		System.out.println("\n猜吧！！！\n请输入你猜测的字符：");
		Scanner scan = new Scanner(System.in);
		int num = 0,loc = 0,score = 1000; //num表示猜对的个数，loc表示猜对的位置个数，score表示得分
		do{
			String str = scan.nextLine(); //输入字符串
			char[] input = str.toCharArray(); //将输入的字符串转变为字符数组
			int[] val = check(input,answer); //数组比较方法调用
			//获取检查结果
			num = val[0];
			loc = val[1];
			//输出结果，提示用户是否继续猜测
			System.out.println("你猜中了"+num+"个字符，其中"+loc+"个位置正确！");
			//得分计算
			score -= 10;
			if(score==0){
				System.out.println("下次再来吧！！！");
				break;
			}
		}while(num!=5 || loc!=5); //没有猜中继续循环
		scan.close();
		System.out.println("你的得分是："+score);
	}//main
	
	/**
	 * 随机生成字符数组的方法
	 * @param n 随机生成字符的个数
	 * @return n个不重复的大写字母
	 */
	/*
	 * 1.定义随机范围数组scopeChars
	 * 2.产生随机数index
	 * 3.定义randomChar保存产生的随机字符
	 * 4.产生n个随机字符---for循环实现
	 * 5.定义保存产生的随机字符的数组randomChars
	 * 6.定义boolean类型数组used---实现不重复生成相同字符---do{}while();实现
	 */
	public static char[] generate(int n){
		char[] scopeChars = { //定义随机范围数组scopeChars
				'A','B','C','D','E','F','G','H','I',
				'J','K','L','M','N','O','P','Q','R',
				'S','T','U','V','W','X','Y','Z'};
		Random random = new Random(); 
		char[] randomChars = new char[n]; //定义保存产生n个随机字符的数组
		boolean[] used = new boolean[scopeChars.length]; //定义boolean类型数组used
		for(int i=0;i<n;i++){ //产生n个随机字符
			int index; //产生随机数index
			do{ //实现不重复生成相同的字符
				index = random.nextInt(scopeChars.length); //scopeChars.length==26--->index范围为0~25
			}while(used[index]); //used[index]值为true时，说明该字符已经产生，需要重新随机生成字符下标index
			//int n = random.nextInt(scopeChars.length); //此处n与方法generate(int n)中n重复---两处地方的n均为局部变量，作用域均为本方法内
			boolean b = used[index];
			
			char randomChar = scopeChars[index]; //定义randomChar保存产生的随机字符
			randomChars[i] = randomChar; //将随机字符保存到随机数组中
			used[index] = true; //
		}
		System.out.print("随机生成的字符数组： "+Arrays.toString(randomChars));
		
		return randomChars;
	}
	
	/**
	 * 将用户输入的字符数组input与系统生成字符数组answer作对比
	 * @param input 用户输入的字符数组
	 * @param answer 系统生成的字符数组
	 * @return 检查结果(num,loc)，两个整数：num表示匹配的字符的个数
	 *                                loc表示相同字符的位置匹配的个数
	 */
	public static int[] check(char[] input, char[] answer){
		int num = 0, loc = 0;
		for(int i=0;i<answer.length;i++){
			char an = answer[i];
			for(int j=0;j<input.length;j++){
				char in = input[j];
				if(an==in){ //字符相同
					num++;
					if(i==j){ //位置相同
						loc++;
					}
					break; //j循环结束---找到相同字符
				}
			}
		}
		return new int[]{num,loc}; //返回时创建一个新数组
	}
	
}//class




