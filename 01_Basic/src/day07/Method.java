package day07;
import java.math.BigDecimal;
import java.util.Arrays;
//方法
public class Method {

	public static void main(String[] args) {
		/**
		 * 演示方法的使用
		 */
		//调用（invoke）方法：重复使用方法---n的类型需要兼容
		double n = sum(1,2); //可兼容int型---系统会将int自动转为double
		//char n = sum(1,2); //不兼容---需要强转
		System.out.println(n);
		
		/**
		 * main方法中测试调用print(数组)方法
		 */
		
		int[] ary = {1,4,7,2,5,8,3,6,9};
		print(ary); //数组输出
		Arrays.sort(ary); //数组排序
		print(ary);
		
		/**
		 * 计算两点之间的距离
		 */
		distance(4,5,6,7);
		
	}//main
	/**
	 * 方法必须写在类中，不能写在方法中
	 * 方法5要素：1.public static---修饰词
	 *         2.int---返回值类型，计算结果的类型
	 *         3.sum---方法名，方法计算过程的前提条件
	 *         4.(int n1,int n2)---参数
	 *         5.{}---方法体，是方法的计算过程
	 * 语法约定：如果方法声明了返回值，则在方法中必须使用return返回相应的类型的值，作为方法的返回结果
	 * 如下代码：声明了一个可以反复重复使用的计算过程：计算两个数的平方和
	 */
	public static int sum(int n1,int n2){
		//将n1和n2进行求平方和，返回平方和作为结果
		int y = n1 * n1 + n2 * n2;
		System.out.println(y);
		return y;
	}
	
	/**
	 * 方法的返回值
	 * 1.返回值表示方法的计算结果
	 * 2.一个方法没有计算结果，需要声明无返回值void类型的方法
	 * 3.一个方法如果没有返回值，也可以使用return结束方法的运行
	 * 
	 * 实现打印一个数组内容的一个方法
	 */
	public static void print(int[] ary){
		//方法体中：利用算法打印数组内容到控制台上
		for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * 计算两点之间的距离
	 * 点1(x1,y1)
	 * 点2(x2,y2)
	 */
	public static double distance(double x1,double y1,double x2,double y2){
		//double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		double d = Math.sqrt(sum((x1-x2),(y1-y2))); //调用重载sum方法
		//保留两位输出
		BigDecimal b = new BigDecimal(d);
		double d1 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("距离d = "+d1);
		return d1;
	}
	//重载sum方法---方法签名不同(参数的类型、参数的个数)
	public static double sum(double n1,double n2){
		//将n1和n2进行求平方和，返回平方和作为结果
		double y = n1 * n1 + n2 * n2;
		System.out.println(y);
		return y;
	}
}//class
