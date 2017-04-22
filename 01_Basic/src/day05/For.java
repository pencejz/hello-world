package day05;

import java.math.BigDecimal;

public class For {

	public static void main(String[] args) {
		
		//add();
		//add1();
		//add2();
		//mult();
//		BigMult();
	}//main
	
	/**
	 * for实现1+2+3+...+100=?
	 */
	public static void add(){
		int s = 0;
		for(int i=1;i<=100;){
			s = s + i;
			i++;
		}
		System.out.println(s);
	}
	/**
	 * continue:跳过本次循环
	 * 计算从1加到100，跳过个位数为3的数
	 */
	public static void add1(){
		int s = 0;
		for(int i=1;i<=100;i++){
			if(i%10==3){
				continue;
			}
			s = s + i;
		}
		System.out.println(s);
	}

	/**
	 * for实现1+1/3+1/5...+1/999=?
	 */
	public static void add2(){
		double s = 0;
		for(int i=1;i<=999;i+=2){
			s = s + 1D/i;
		}
		//保留两位小数输出
		BigDecimal b = new BigDecimal(Double.toString(s));
		double s1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(s1);
	}
		
	/**
	 * for实现1*2*3*...*10=?
	 */
	public static void mult(){
		int m = 1;
		for(int i=1;i<=10;){
			m = m * i;
			i++;
		}
		System.out.println(m);
	}

	/**
	 * for实现1*2*3*...*100=?
	 * BigInteger
	 */
//	public static void BigMult(){
//		BigInteger big = new BigInteger(1);
//		
//		for(int i=1;i<=100;i++){
//			BigInteger l_value =new BigInteger(1);
//			big = big.multiply(l_value);
//		}
//		
//		System.out.println(big);
//	}
//	
	
}//class








