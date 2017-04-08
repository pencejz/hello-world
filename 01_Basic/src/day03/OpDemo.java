package day03;
//运算表达式
public class OpDemo {
	public static void main(String[] args){
		/**
		 * 1.数学运算符 :+ - * /
		 * 计算结果类型与原来的数据类型一致
		 */
/*		System.out.println(5+6);
		int a = 5;
		int b = 6;
		int x = 10;
		int y = a*x+b;
		System.out.println(y);
*/		
		/** 整数除法是整除*/
/*		a=5;
		b=2;
		int c = a/b;
		System.out.println(c);
		
		//错误用法：5.6元打八折---解决：将80改为80.0/80D
		double price = 80/100*5.6;
		System.out.println(price); //0.0
*/		
		/**
		 * 2.余数运算  %
		 * 2.1 返回[0,n)之间的数
		 * 2.2 0~m的余数是周期性变化
		 */
		for(int i=0;i<20;i++){
			System.out.println(i+"%3="+i%3);
		}
		
		int s = 238; // s为238秒
		System.out.println(s+"秒包含"+s/60+"分钟"+s%60+"秒");
		
		System.out.println(-2%5);
		System.out.println(0%5);
		System.out.println(3%5);
		
		/**时间的计算*/
/*		//1970年零时至当前系统时间的总的毫秒数
		long ms = System.currentTimeMillis();
		//显示当前系统的分钟数
		long m = ms/1000/60%60;
		//显示当前系统的秒数
		long s1 = ms/1000%60;
		//显示当前系统的年份
		long year = ms/1000/60/60/24/365+1970;
		//显示long类型的最大值
		long max = Long.MAX_VALUE;
		//显示long类型能保存到的最后一年
		long lastYear = max/1000/60/60/24/365+1970;
		
		System.out.println("当前系统的分钟数为"+m+"分钟");
		System.out.println("当前系统的秒数为"+s1+"秒");
		System.out.println("当前系统的年份为"+year+"年");
		System.out.println("long类型的最大值"+max);
		System.out.println("当前系统的秒数为"+s1+"秒");
		System.out.println("long类型可表示的最后一年"+lastYear);
*/		
		/**
		 * 3.赋值表达式 = == += -= *= /=
		 */
/*		int n= 5;
		System.out.println(n = 20); //20
		System.out.println(n); //20
		System.out.println(n == 20); //true
		
		int i=5;
		i=i*3;
		System.out.println(i);
		i=5;
		i*=3;
		System.out.println(i);
		
		//去除十进制整数的最后一位数
		i = 567635;
		i /=10;
		System.out.println(i);
		//得到两个数567,635
		i = 567635;
		i /= 1000;
		System.out.println(i); //567
		i = 567635;
		i %=1000;
		System.out.println(i); //635
		//符合运算的表达式是有值的
		int i1 = 5;
		int b1;
		b1 = i1*=3;
		System.out.println(b1);
*/		
		/**
		 * 4.关系运算
		 * 运算符：< > <= >= == !=
		 * 运算结果为boolean类型
		 */
		//判断年龄小于等于16时为孩子，大于等于18时为成人---输出true
/*		int age = 12;
		int maxAge = 16;
		boolean isKid = age <= maxAge;
		System.out.println(isKid);
		boolean isMan = age >=18;
		System.out.println(isMan);
		//尾数为奇数时，输出true
		long ms = System.currentTimeMillis();
		boolean b = ms%2 == 1;
		System.out.println(ms);
		System.out.println(b);
		//1.判断一个字符是否是英文大写字符
		int i = 70;
		boolean isChar = 'A'<= i && i <='Z';
		System.out.println(isChar);
*/		
		
		/**
		 * 5.自增运算：++   自减运算：--
		 * 只能对变量进行计算，不能对常量/直接量进行运算
		 * 5.1 a++：表示a先使用，再自增
		 * 5.2 ++a：表示a先自增，再使用
		 * 1、2表达式的值不同
		 */
/*		int a = 5;
		int b1 = a++; //b1是a++表达式的值。先取出a的值5作为表达式的值5--->然后a自增1，即为6
		System.out.println("b1 = "+b1+",a = "+a);
		a = 5;
		int b2 = ++a; //b2是++a表达式的值。先a自增1，即为6--->然后取出a的值6作为表达式的值6
		System.out.println("b2 = "+b2+",a = "+a);
		
		a = 5;
		int b3 =a--;
		System.out.println("b3 = "+b3+",a = "+a);
		a = 5;
		int b4 = --a;
		System.out.println("b4 = "+b4+",a = "+a);
		
		//计算题
		a = 5;
		a=++a + ++a + a++;
		// 6  +  7  +  7
		System.out.println("++a + ++a + a++的值为："+a);
*/		
	}//main
	
}//class









