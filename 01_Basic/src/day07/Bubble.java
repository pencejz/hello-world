package day07;
//冒泡排序
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		/**
		 * 冒泡排序算法
		 */
		//用户输入10个0~100之间的数并保存到数组中
		Scanner scan = new Scanner(System.in);
		int[] bubbles = new int[10];
		System.out.println("请输入10个0~100之间的整数，每个数之间用空格隔开：");
		for(int i=0;i<bubbles.length;i++){
			bubbles[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("你输入的数组为：  "+Arrays.toString(bubbles));
		//冒泡排序
		System.out.println("----------冒泡排序开始------------");
		for(int i=0;i<bubbles.length-1;i++){
			/*
			 * i表示总的轮次
			 * 有n个数需要排序就要比较(n-1)轮
			 * 每一轮会确定一个最大值
			 * 每确定一个值，下一轮比较中，比较次数j的值就会减少1
			 */
			for(int j=0;j<bubbles.length-1-i;j++){ //j表示每个轮次比较的次数
				if(bubbles[j]>bubbles[j+1]){
					int max = bubbles[j+1];
					bubbles[j+1] = bubbles[j];
					bubbles[j] = max;
				}
			}
			System.out.println("第"+(i+1)+"轮排序结果为： "+Arrays.toString(bubbles));
		}
		System.out.println("----------冒泡排序结束------------");
		System.out.println("排序后的数组为： "+Arrays.toString(bubbles));
		
		
		/**
		 * JDk提供的数组快速排序算法：sort()方法---升序排序并保存
		 * 程序性能优越
		 */		
		//系统随机产生10个0~100的随机整数，保存到数组ksort中
		int[] ksort = new int[10];
		Random r = new Random();
		for(int i=0;i<ksort.length;i++){
			ksort[i] = r.nextInt(100)+1;
		}
		System.out.println("ksort= "+Arrays.toString(ksort));
		Arrays.sort(ksort);
		System.out.println("快速排序之后的数组为： "+Arrays.toString(ksort));
		
	}//main
	
}//class

/**
 * 数组工具类Arrays中常用方法
 * 1.Arrays.toString()---输出数组
 * 2.Arrays.copyOf()---创建数组副本(可以改变数组长度)
 * 3.System.arraycopy()---复制数组
 * 4.Arrays.fill()---用一个值初始化数组
 */
















