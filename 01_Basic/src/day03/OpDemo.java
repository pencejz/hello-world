package day03;
//������ʽ
public class OpDemo {
	public static void main(String[] args){
		/**
		 * 1.��ѧ����� :+ - * /
		 * ������������ԭ������������һ��
		 */
/*		System.out.println(5+6);
		int a = 5;
		int b = 6;
		int x = 10;
		int y = a*x+b;
		System.out.println(y);
*/		
		/** ��������������*/
/*		a=5;
		b=2;
		int c = a/b;
		System.out.println(c);
		
		//�����÷���5.6Ԫ�����---�������80��Ϊ80.0/80D
		double price = 80/100*5.6;
		System.out.println(price); //0.0
*/		
		/**
		 * 2.��������  %
		 * 2.1 ����[0,n)֮�����
		 * 2.2 0~m�������������Ա仯
		 */
		for(int i=0;i<20;i++){
			System.out.println(i+"%3="+i%3);
		}
		
		int s = 238; // sΪ238��
		System.out.println(s+"�����"+s/60+"����"+s%60+"��");
		
		System.out.println(-2%5);
		System.out.println(0%5);
		System.out.println(3%5);
		
		/**ʱ��ļ���*/
/*		//1970����ʱ����ǰϵͳʱ����ܵĺ�����
		long ms = System.currentTimeMillis();
		//��ʾ��ǰϵͳ�ķ�����
		long m = ms/1000/60%60;
		//��ʾ��ǰϵͳ������
		long s1 = ms/1000%60;
		//��ʾ��ǰϵͳ�����
		long year = ms/1000/60/60/24/365+1970;
		//��ʾlong���͵����ֵ
		long max = Long.MAX_VALUE;
		//��ʾlong�����ܱ��浽�����һ��
		long lastYear = max/1000/60/60/24/365+1970;
		
		System.out.println("��ǰϵͳ�ķ�����Ϊ"+m+"����");
		System.out.println("��ǰϵͳ������Ϊ"+s1+"��");
		System.out.println("��ǰϵͳ�����Ϊ"+year+"��");
		System.out.println("long���͵����ֵ"+max);
		System.out.println("��ǰϵͳ������Ϊ"+s1+"��");
		System.out.println("long���Ϳɱ�ʾ�����һ��"+lastYear);
*/		
		/**
		 * 3.��ֵ���ʽ = == += -= *= /=
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
		
		//ȥ��ʮ�������������һλ��
		i = 567635;
		i /=10;
		System.out.println(i);
		//�õ�������567,635
		i = 567635;
		i /= 1000;
		System.out.println(i); //567
		i = 567635;
		i %=1000;
		System.out.println(i); //635
		//��������ı��ʽ����ֵ��
		int i1 = 5;
		int b1;
		b1 = i1*=3;
		System.out.println(b1);
*/		
		/**
		 * 4.��ϵ����
		 * �������< > <= >= == !=
		 * ������Ϊboolean����
		 */
		//�ж�����С�ڵ���16ʱΪ���ӣ����ڵ���18ʱΪ����---���true
/*		int age = 12;
		int maxAge = 16;
		boolean isKid = age <= maxAge;
		System.out.println(isKid);
		boolean isMan = age >=18;
		System.out.println(isMan);
		//β��Ϊ����ʱ�����true
		long ms = System.currentTimeMillis();
		boolean b = ms%2 == 1;
		System.out.println(ms);
		System.out.println(b);
		//1.�ж�һ���ַ��Ƿ���Ӣ�Ĵ�д�ַ�
		int i = 70;
		boolean isChar = 'A'<= i && i <='Z';
		System.out.println(isChar);
*/		
		
		/**
		 * 5.�������㣺++   �Լ����㣺--
		 * ֻ�ܶԱ������м��㣬���ܶԳ���/ֱ������������
		 * 5.1 a++����ʾa��ʹ�ã�������
		 * 5.2 ++a����ʾa����������ʹ��
		 * 1��2���ʽ��ֵ��ͬ
		 */
/*		int a = 5;
		int b1 = a++; //b1��a++���ʽ��ֵ����ȡ��a��ֵ5��Ϊ���ʽ��ֵ5--->Ȼ��a����1����Ϊ6
		System.out.println("b1 = "+b1+",a = "+a);
		a = 5;
		int b2 = ++a; //b2��++a���ʽ��ֵ����a����1����Ϊ6--->Ȼ��ȡ��a��ֵ6��Ϊ���ʽ��ֵ6
		System.out.println("b2 = "+b2+",a = "+a);
		
		a = 5;
		int b3 =a--;
		System.out.println("b3 = "+b3+",a = "+a);
		a = 5;
		int b4 = --a;
		System.out.println("b4 = "+b4+",a = "+a);
		
		//������
		a = 5;
		a=++a + ++a + a++;
		// 6  +  7  +  7
		System.out.println("++a + ++a + a++��ֵΪ��"+a);
*/		
	}//main
	
}//class









