package day04;

import java.util.Scanner;

public class Test {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		/**
		 * ��ҵ��
		 * 1.�ڹ�̨�տ�����ϣ�ʵ�֣�
		 *	���ܼ�<=50,-2Ԫ
		 *	���ܼ�<=200,9.5��
		 * 	���ܼ�<=500,9��
		 * 	���ܼ�>500,8��
		 */
		//pay();
		
		/**
		 * �����û�����Ļ�Ա����score�����㲢�����Ա��Ӧ���ۿ�discount
		 * ����С��2000���ۿ�Ϊ0.9
		 * ���ִ��ڵ���2000����С��4000���ۿ�Ϊ0.8
		 * ���ִ��ڵ���4000����С��8000���ۿ�Ϊ0.7
		 * ���ִ���8000���ۿ�Ϊ0.6
		 */
		//score();
		
		//score1();
		
		/**
		 * �����û������choice����switch�ṹ
		 * ����1����ʾ���빺�
		 * ����2����ʾ��������㡱
		 * ����3����ʾ����ӭ�´ι��١�
		 * �����������ݣ���ʾ���������
		 */
		//choice();
		
	}//main
	
	public static void pay(){
		System.out.println("---------��̨�տ�--------");
		//��Ϣ�����룺���ۡ�������֧�����
		System.out.print("�����뵥�ۣ�");
		double price = scan.nextDouble();
		System.out.print("������������");
		double count = scan.nextDouble();
		System.out.print("�����븶���");
		double pay = scan.nextDouble();
		//����
		double total = price * count;
		//�Ż�ʵ��
		if(total <0){
			System.out.println("������ĵ��ۻ���������");
		}else if(total <= 50){
			total = total - 2;
		}else if(total <= 200){
			total = total*0.95;
		}else if(total <= 500){
			total = total*0.9;
		}else if(total > 500){
			total = total *0.8;
		}
		double bal = pay - total;
		//���
		System.out.println("��Ʒ��"+total);
		System.out.println("֧����"+pay);
		System.out.println("���㣺"+bal);
	}
	
	public static void score(){
		System.out.println("---------�����ۿ�--------");
		//�û��������
		System.out.print("�������Ա���֣�");
		int score = scan.nextInt();
		//�ۿ�ѡ��
		if(score < 0){
			System.out.println("������Ļ��ֲ���ȷ��");
		}else if(score <2000){
			System.out.println("Discount=0.9");
		}else if(score <4000){
			System.out.println("Discount=0.8");
		}else if(score <8000){
			System.out.println("Discount=0.7");
		}else if(score >=8000){
			System.out.println("Discount=0.6");};
	}
	
	public static void score1(){
		System.out.println("---------�����ۿ�--------");
		//�û��������
		System.out.print("�������Ա���֣�");
		int score = scan.nextInt();
		double discount=1;
		//�ۿ�ѡ��
		if(score < 0){
			System.out.println("������Ļ��ֲ���ȷ��");
		}else if(score <2000){
			discount = 0.9;
		}else if(score <4000){
			discount = 0.8;
		}else if(score <8000){
			discount = 0.7;
		}else if(score >=8000){
			discount = 0.6;
			}
		System.out.println(discount);
	}

	public static void choice(){
		System.out.println("---------����ѡ��--------");
		//�û�����
		System.out.println("��ѡ���ܣ�");
		int choice = scan.nextInt();
		//����ѡ��
		switch(choice){
		case 1:
			System.out.println("�빺��...");
			break;
		case 2:	
			System.out.println("�������...");
			break;
		case 3:
			System.out.println("��ӭ�´ι��٣�����");
			break;
		default:
			System.out.println("������󣡣���");
		}
		
	}
	
}//class

/**
 * �������⣺
 * int n;
 * int i = 0;
 * while(i<4){
 * 		i++;
 * 		n = 5;
 * }
 * system.out.println(n);
 * ���ֱ��������ʾ����Ϊ�������ڱ����ڼ���Ϊ��whileѭ�����ܲ���ִ�У���ʱn�����ᱻ����ֵ
 */

