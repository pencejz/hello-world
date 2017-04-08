package day10;

import java.util.Arrays;

//数组也是一个对象
public class Array {

	public static void main(String[] args) {
		/**
		 * 数组是对象
		 * 数组变量是引用类型变量
		 * 数组变量具有
		 * java严格意义上讲没有二维数组，可以把每一个元素称为数组的一维数组
		 */
		int[] ary = new int[5];
		System.out.println("ary[0] = "+ary[0]);
		ary = null;
		System.out.println("ary = "+ary); //null
		//ary[0] = 0; //空指针异常
		//int n = ary.length; //空指针异常
		
		//引用类型变量ary可以再次引用数组对象
		ary = new int[3];
		ary[0] = 10;
		System.out.println("ary[0] = "+ary[0]); //10
		//扩容更换数组：更换新数组对象
		ary = Arrays.copyOf(ary, ary.length+1);
		System.out.println("ary.length = "+ary.length); //4
		//两引用变量引用同一个数组对象
		int[] ary1 = ary;
		ary[1] = 5;
		System.out.println("ary1[1] = "+ary1[1]); //5
		
		//二维数组
		System.out.println("----------二维数组----------");
		int[][] arr =new int[3][];
		System.out.println("ary[0] = "+arr[0]); //null
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		System.out.println("ary[0][0] = "+arr[0][0]); //0
		arr[1][1] = 100;
		System.out.println("ary[1][1] = "+arr[1][1]); //100
	}

}
