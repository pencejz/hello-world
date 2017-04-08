package day02;

import java.util.Scanner; //1.
//数据类型
public class DataTypeDemo {

	public static void main(String[] args) {
		/**1.变量练习*/
/*		int a; //声明一个整型变量，名为a
		int b,c,d;
		
		int e=250; //声明一个整型变量e并赋值为250
		int f; //声明一个整型变量f
		f=250; //给变量f赋值为250
		
		int g=5;
		int h=g+10;
		g=g+10;
		System.out.println(g);
		
		//int i=5.6; //赋值类型错误
		//System.out.println(m); //m未声明和初始化
		//int m;
		//System.out.println(m); //m未初始化
		
		int a3;
		//int 3a; //不能以数字开头
		int Class;
		//int class; //不能使用java关键字
		int ClassRoom;
		//int 教室; //不建议使用中文
		//int jiaoshi; //不建议使用拼音
 */
		/**2.int、long、double的练习*/
/*		int a=250;
		//int b=10000000000; //100亿超过了int整型变量的范围，有溢出
		System.out.println("2/5 =  "+2/5); //0
		System.out.println("5/2 =  "+5/2); //2
		int c=2147483647; //int的最大值
		System.out.println("c+1 =  "+c+1); //结果为负的最小值-2147483648
		
		long d=10000000000L; //100亿
		long e=1000000000*2*10L;
		System.out.println("e =  "+e); //200亿
		long f=1000000000*3*10L;
		System.out.println("f =  "+f); //结果为负，有溢出
		long g=1000000000L*3*10;
		System.out.println("g =  "+g); //300亿
		long h=System.currentTimeMillis();
		System.out.println("h =  "+h); //1970年1月1号至此时此刻的毫秒数
		
		double i=3.14159;
		double j=3.0;
		double k=2.9;
		System.out.println("j-k =  "+(j-k)); //结果为0.10000000000000009---舍入误差类似于十进制的1/3表示
		double j1=4.0;
		double k1=2.9;
		System.out.println("j1-k1 =  "+(j1-k1)); //结果为1.1
		double j2=6.0;
		double k2=4.9;
		System.out.println("j2-k2 =  "+(j2-k2)); //结果为1.0999999999999996---舍入误差
*/
		
		/**3.boolean、char练习*/
		boolean b1=true;
		boolean b2=false;
		//boolean b3=5.5;
		
		char c1='男';
		char c2='m';
		char c3='6';
		char c4=' ';
//		char c5='男性';
		char c6=65; //表面上为字符型，实质上是整型
		System.out.println(c6); //输出为字符型
		System.out.println((int)c6); //输出时将字符型强制转换成了整型
		System.out.println('2'+'2');
		System.out.println(2+'2');
		System.out.println(2+2);
		char c7='\'';
		System.out.println(c7);
		char c8='\n';
		System.out.println(c8); //println一次换行，\n一次换行
		System.out.println('2'+'2');
		
		//int直接量可以直接赋值给byte,char,short,只要不超过其表示的范围。
		//注意：此处必须为int直接量
		byte a1=127;
		System.out.println(a1); //127
		
		char a2=65;
		System.out.println(a2); //a
		
		//int a3=127;
		//byte a4=a3; //错误
	
		
		/**4.数据类型转换*/
/*		int a=5;
		long b=a;
		//int c=b;
		int c=(int)b;
		
		long d=10000000000L;
		//int e=d;
		int e=(int)d; //产生溢出
		System.out.println(e);
		
		double f=56.789;
		//int g=f;
		int g=(int)f;
		System.out.println(g);
		
		byte b1=5;
		byte b2=6;
		//byte b3=b1+b2;
		byte b3=(byte)(b1+b2);
		System.out.println(b3);	
*/
		
		/**
		 * Scanner用户输入
		 * 分三步：1.包导入 import java.util.Scanner;
		 *       2.对象实例化 Scanner scan = new Scanner(System.in);
		 *       3.用户输入 int age = scan.nextInt();
		 */
//		Scanner scan = new Scanner(System.in); //2.
//		System.out.println("请输入年龄:");
//		int age = scan.nextInt(); //3.
//		System.out.println("请输入价格:");
//		double price = scan.nextDouble();
//		
//		System.out.println(age);
//		System.out.println(price);
//		scan.close();
		
	}//main

}//class
