package day05;

import java.util.Random;

import java.util.Scanner;

public class DoWhile {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//score();
		//guessNumber();
		
	}//main
	
	/**����û��������Ƿ�Ϊ0~100֮��ķ���*/
	public static void score(){
		int score; //�û�����ķ���
		do{
			System.out.print("�����������");
			score = scan.nextInt();
			
		}while(0>score || score>100);
		
		System.out.println("������ķ���Ϊ��"+score);
	}
	/**DoWhileʵ�ֲ�������Ϸ*/
 	public static void guessNumber(){
 		//ʵ��ϵͳ���������
		Random random = new Random();
		int num = random.nextInt(10)+1;
		
		int n; //�����û��²����
		do{
			System.out.println("�°ɣ�(����0---�˳�)");
			n = scan.nextInt();
			if(n==0){
				break;
			}
			if(n>num){
				System.out.println("����");
			}
			if(n<num){
				System.out.println("С��");
			}
		}while(n!=num);
		System.out.println("�¶��ˣ�����");
	}
	
}//class
