package day06;
/**数组基础*/
import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		/**
		 * 数组声明1---使用长度创建数组(不知道元素初始值，元素个数较多时使用)
		 * 直接声明一个数组时，必须给出一个数组长度
		 * 使用下标(索引，序号，index)访问每个元素
		 * 每个元素的默认值是0
		 */
		System.out.println("---------数组声明-----------");
		//ary代表了10个int型的变量
		int[] ary = new int[10];
		int n = ary[0];
		System.out.println("ary["+n+"]="+n);//输出值均为0
		/**
		 * 数组声明2---使用元素创建数组(已经知道元素的初始值，元素的个数较少时使用)
		 * 数组声明的同时直接使用元素初始化
		 * 注意：不能直接给出数组长度，因为初始化时，给出的元素的个数，就代表了数组长度
		 */
		//int[] ary2 = new int[]{3,4,0,9,7,8};
		int[] ary2 = {3,4,0,9,7,8};
		System.out.println("ary2["+0+"]="+ary2[0]); //3
		//此处可以使用简化版：int[] ary2 = {3,4,0,9,7,8};
		
		int[] ary3;
		ary3 = new int[]{1,2,3}; //正确
		//ary3 = {1,2,3}; //编译错误
		//此处不能使用简化版		
		/**简化版
		 * 1.简化版只能使用在声明变量的同时初始化的情况。
		 * 2.完整版可以用于任何情况。
		 */
		
		/**
		 * 其他类型测试
		 */
		double[] ary4 = new double[4];
		System.out.println("ary4[0]="+ary4[0]); //0.0
		
		boolean[] ary5 = new boolean[10];
		System.out.println("ary5[5]="+ary5[5]); //false
		
		byte[] ary6 = new byte[10];
		System.out.println("ary6[2]="+ary6[2]); //0
		
		char[] ary7 = new char[5];
		System.out.println("ary7[0]="+ary7[0]); //字符的默认值是空格
		/*
		 * 字符数组元素自动初始化位 编号为0的字符。
		 * 编号为0的是一个特殊的控制字符，打印不可见！表示字符串的结束标记
		 * 如果输出这个字符，在linux操作系统中，linux系统认为输出结束，后续字符不在输出
		 * 解决：强转为int型输出
		 */
		
		/**使用length属性获取数组长度*/
		System.out.println("ary7的数组长度为："+ary7.length);
		/**使用数组长度遍历每一个元素*/
		//将数组每个元素赋值为100
		for(int i=0;i<ary7.length;i++){
			ary7[i] = 100;
			System.out.print("ary7["+i+"]="+(int)ary7[i]+" ");	
		}
		System.out.println();
		//随机产生10000个1~100之间的整数数
		int[] rad = new int[10000];
		Random random = new Random();
		for(int i=0;i<rad.length;i++){
			rad[i] = random.nextInt(100)+1;
			//rad[i] = (int)Math.random()*100+1;
		}
		//计算rad的平均数
		int sum = 0;
		for(int i=0;i<rad.length;i++){
			sum += rad[i];
		}
		double avg = (double)sum/rad.length;
		System.out.println("随机产生数组rad的平均数是： "+avg);
		
		/**
		 * 数组迭代
		 */
		System.out.println("------------数组迭代----------------");
		int[] ary8 = {1,4,7,2,5,8};
		//1.数组的顺序输出
		System.out.print("数组的顺序输出为：");
		for(int i=0;i<ary8.length;i++){
			System.out.print(ary8[i]+" ");
		}
		System.out.println();
		//2.数组的逆序输出
		System.out.print("数组的逆序输出为：");
		for(int i=ary8.length-1;i>=0;i--){
			System.out.print(ary8[i]+" ");
		}
		System.out.println();
		
		/**将数组ary8中内容（1,4,7,2,5,8,）倒置输出*/
		//倒置数组
		System.out.println("---------数组倒置输出----------");
		System.out.print("数组ary8倒置为：");
		for(int i=0;i<ary8.length/2;i++){
			int t = ary8[i];
			ary8[i] = ary8[ary8.length-1-i];
			ary8[ary8.length-1-i] = t;
		}
		//输出数组
		for(int i=0;i<ary8.length;i++){
			System.out.print(ary8[i]+" ");
		}
		System.out.println();
		
		/**
		 * 找出数组ary8中的最大值
		 */
		int max = ary8[0];
		for(int i=0;i<ary8.length;i++){
			if(max<ary8[i]){
				max = ary8[i];
			}
		}
		System.out.println("ary8中的最大值："+max);
		System.out.println();
		
		/**
		 * 数组复制一：system.arraycopy(源数组，源位置，目标数组，目标位置，复制的个数)方法
		 */
		System.out.println("----------数组的复制------------");
		//将a1复制到a0中
		int[] a1 = {1,1,1,1,1,1};
		int[] a0 = {0,0,0,0,0,0};
		System.arraycopy(a1,0,a0,0,a1.length);
		System.out.print("复制后的a0为：");
		for(int i=0;i<a1.length;i++){
			System.out.print(a0[i]+" ");
		}
		System.out.println();
		//将a2的（20,30,40）复制到a3中的最后三个位置
		int[] a2 = {10,20,30,40,50};
		int[] a3 = new int[6];
		System.arraycopy(a2, 1, a3, 2, 3);
		System.out.println("复制后的a3为："+Arrays.toString(a3));
		
		/**
		 * 数组复制二：Arryays.copyOf(源数组，新数组长度)方法---创建原数组的副本
		 * 实现数组长度变化
		 * Arrays.toString(a):将数组中的元素与逗号相连接成一个字符串，输出
		 */
		int[] a4 = {10,20,30,40,50}; //源数组
		//输出数组a4
		System.out.println("a4="+Arrays.toString(a4));
		//创建原数组的副本
		int[] a5 = Arrays.copyOf(a4, 7); //新数组长度>源数组---扩容
		System.out.println("副本a5= "+Arrays.toString(a5));
		int[] a6 = Arrays.copyOf(a4, 3); //新数组长度<源数组---缩容
		System.out.println("副本a6= "+Arrays.toString(a6));
		int[] a7 = Arrays.copyOf(a4, 5); //新数组长度==源数组
		System.out.println("副本a7= "+Arrays.toString(a7));
		/*
		 * a4扩容1个元素
		 * 将a4更换为新数组，源数组将被丢弃
		 */
		a4 = Arrays.copyOf(a4, a4.length+1);
		System.out.println("扩容后a4= "+Arrays.toString(a4));
		//将100追加到数组a4的最后
		a4[a4.length-1] = 100; 
		System.out.println("追加100后的a4= "+Arrays.toString(a4));
		//删掉最后一个元素100
		a4 = Arrays.copyOf(a4, a4.length-1);
		System.out.println("缩容100后的a4= "+Arrays.toString(a4));
		
		
		
	}//main

}//class
