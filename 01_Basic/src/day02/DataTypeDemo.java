package day02;

import java.util.Scanner; //1.
//��������
public class DataTypeDemo {

	public static void main(String[] args) {
		/**1.������ϰ*/
/*		int a; //����һ�����ͱ�������Ϊa
		int b,c,d;
		
		int e=250; //����һ�����ͱ���e����ֵΪ250
		int f; //����һ�����ͱ���f
		f=250; //������f��ֵΪ250
		
		int g=5;
		int h=g+10;
		g=g+10;
		System.out.println(g);
		
		//int i=5.6; //��ֵ���ʹ���
		//System.out.println(m); //mδ�����ͳ�ʼ��
		//int m;
		//System.out.println(m); //mδ��ʼ��
		
		int a3;
		//int 3a; //���������ֿ�ͷ
		int Class;
		//int class; //����ʹ��java�ؼ���
		int ClassRoom;
		//int ����; //������ʹ������
		//int jiaoshi; //������ʹ��ƴ��
 */
		/**2.int��long��double����ϰ*/
/*		int a=250;
		//int b=10000000000; //100�ڳ�����int���ͱ����ķ�Χ�������
		System.out.println("2/5 =  "+2/5); //0
		System.out.println("5/2 =  "+5/2); //2
		int c=2147483647; //int�����ֵ
		System.out.println("c+1 =  "+c+1); //���Ϊ������Сֵ-2147483648
		
		long d=10000000000L; //100��
		long e=1000000000*2*10L;
		System.out.println("e =  "+e); //200��
		long f=1000000000*3*10L;
		System.out.println("f =  "+f); //���Ϊ���������
		long g=1000000000L*3*10;
		System.out.println("g =  "+g); //300��
		long h=System.currentTimeMillis();
		System.out.println("h =  "+h); //1970��1��1������ʱ�˿̵ĺ�����
		
		double i=3.14159;
		double j=3.0;
		double k=2.9;
		System.out.println("j-k =  "+(j-k)); //���Ϊ0.10000000000000009---�������������ʮ���Ƶ�1/3��ʾ
		double j1=4.0;
		double k1=2.9;
		System.out.println("j1-k1 =  "+(j1-k1)); //���Ϊ1.1
		double j2=6.0;
		double k2=4.9;
		System.out.println("j2-k2 =  "+(j2-k2)); //���Ϊ1.0999999999999996---�������
*/
		
		/**3.boolean��char��ϰ*/
		boolean b1=true;
		boolean b2=false;
		//boolean b3=5.5;
		
		char c1='��';
		char c2='m';
		char c3='6';
		char c4=' ';
//		char c5='����';
		char c6=65; //������Ϊ�ַ��ͣ�ʵ����������
		System.out.println(c6); //���Ϊ�ַ���
		System.out.println((int)c6); //���ʱ���ַ���ǿ��ת����������
		System.out.println('2'+'2');
		System.out.println(2+'2');
		System.out.println(2+2);
		char c7='\'';
		System.out.println(c7);
		char c8='\n';
		System.out.println(c8); //printlnһ�λ��У�\nһ�λ���
		System.out.println('2'+'2');
		
		//intֱ��������ֱ�Ӹ�ֵ��byte,char,short,ֻҪ���������ʾ�ķ�Χ��
		//ע�⣺�˴�����Ϊintֱ����
		byte a1=127;
		System.out.println(a1); //127
		
		char a2=65;
		System.out.println(a2); //a
		
		//int a3=127;
		//byte a4=a3; //����
	
		
		/**4.��������ת��*/
/*		int a=5;
		long b=a;
		//int c=b;
		int c=(int)b;
		
		long d=10000000000L;
		//int e=d;
		int e=(int)d; //�������
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
		 * Scanner�û�����
		 * ��������1.������ import java.util.Scanner;
		 *       2.����ʵ���� Scanner scan = new Scanner(System.in);
		 *       3.�û����� int age = scan.nextInt();
		 */
//		Scanner scan = new Scanner(System.in); //2.
//		System.out.println("����������:");
//		int age = scan.nextInt(); //3.
//		System.out.println("������۸�:");
//		double price = scan.nextDouble();
//		
//		System.out.println(age);
//		System.out.println(price);
//		scan.close();
		
	}//main

}//class
