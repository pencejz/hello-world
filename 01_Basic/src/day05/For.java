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
	 * forʵ��1+2+3+...+100=?
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
	 * continue:��������ѭ��
	 * �����1�ӵ�100��������λ��Ϊ3����
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
	 * forʵ��1+1/3+1/5...+1/999=?
	 */
	public static void add2(){
		double s = 0;
		for(int i=1;i<=999;i+=2){
			s = s + 1D/i;
		}
		//������λС�����
		BigDecimal b = new BigDecimal(Double.toString(s));
		double s1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(s1);
	}
		
	/**
	 * forʵ��1*2*3*...*10=?
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
	 * forʵ��1*2*3*...*100=?
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








