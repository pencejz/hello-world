package day03;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * ��ҵ��
		 * 1.�ӿ���̨����һ�����������㲢��ʾΪ  ��ʱ���֣���
		 * 2.�ӿ���̨����һ������������Ƿ�Ϊ���㣬�����������100~90�֡������㣬��ʾtrue�����ǣ���ʾΪfalse
		 * 3.���һ���˵����䣬�Ƿ���35~50֮�䣬�Ǿ���ʾ������һ�������ˡ�
		 * 4.����һ���˵����䣬����5���Ժ�������Ƕ��٣�ʹ��+= ����
		 */
		//time();
		
		/**
		 * 5.6Ԫ�����---��������
		 */		
		discount();
		
	}//main
	

	public static void discount(){
		
		double price = 80/100*5.6;
		System.out.println(price); //���0.0
		//����������80��Ϊ80D������80.0
		double price1 = 80.D/100*5.6;
		System.out.println(price1); //4.4799999999999995
		
		//������λС�����
		//����һ��
		BigDecimal b = new BigDecimal(price1);
		double price2 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("����һ�����"+price2);
		//��������printf����
//		double price3 = 80.00/100*5.6;
//		System.out.printf("%.2f", price3);
	}
	
	public static void time(){
		//����һ�������������ʱ����
		System.out.println("������һ��������");
		int input = scan.nextInt();
		int hour = input/60/60%24;
		int min = input/60%60;
		int sec = input%60;
		System.out.println(input+"����"+hour+"Сʱ"+min+"����"+sec+"��");
		//����һ���������ж�����
		System.out.println("������һ��������");
		int score = scan.nextInt();
		boolean b1 = 90<=score && score<=100;
		System.out.println(b1);
		//����һ�����䣬Ȼ���ж�������
		System.out.println("������һ����Ҫ�жϵ����䣺");
		int age1 = scan.nextInt();
		boolean b2 = 35<=age1 && age1<=50;
		if(b2){
			System.out.println("����һ��������");
		}else{
			System.out.println("YOU ARE A HANDSON");
		}		
		//����һ�����䣬Ȼ���������������
		System.out.println("������һ����Ҫ��������䣺");
		int age2 = scan.nextInt();
		age2+=5;
		System.out.println("��5���"+age2+"��");
	}
	
	
	
}//class




