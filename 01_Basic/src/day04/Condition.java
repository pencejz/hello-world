package day04;
//������
import java.util.Scanner;

public class Condition {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
//		If();
//		IfElse();
//		SwitchCase();
		
	}//main
	
	
	/**��֧�ṹ---if���*/
	public static void If(){
		System.out.println("--------��̨�տ����---------");
		//1.��ȡ�û�������Ϣ�����ۡ����������
		System.out.print("�����뵥�ۣ�");
		double price = scan.nextDouble();
		System.out.print("������������");
		double number = scan.nextDouble();
		System.out.print("�������");
		double pay = scan.nextDouble();
		//2.���㣺�ܼۡ�����
		double total = price*number;

		if(total <= pay){ //���ܼ�<=֧�����ʱ������֧���������������
			
			if(total >= 500){ //���ܼ�>=500ʱ�������
				
				if(pay >=total*0.8){ //��֧���Ľ��>=�ܼ�*0.8
					
					total = total*0.8;
					double sub = pay - total;
					System.out.println("��Ʒ��"+total);
					System.out.println("��֧����"+pay);
					System.out.println("���㣺"+sub);
					
				}else{
					System.out.println("���㣡");
					}
				
			}else{
				System.out.println("���㣡");
				}
			
		}else{
			System.out.println("���㣡");
			}
		
		
		
	}//If
	
	/**��֧�ṹ---if else���*/
	public static void IfElse(){
		
		System.out.println("---------ѧ���ɼ���¼-----------");
		//��������
		System.out.println("������һ��������");
		int score = scan.nextInt();
		if(0>score ||score > 100){
			System.out.println("������ķ������Ϸ���");
		}else if(score >= 90){
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score >=70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else{
			System.out.println("������");
		}
	}
	/**
	 * ��֧---switch���
	 * switch ��   if else if����
	 * 1.switch ֻ���ظø��������������з�֧
	 *   if else ���Ը�����һ�������з�֧��ʹ�ø�Ϊ�㷺
	 * 2.switch ���������ܺ���if else
	 *   �����֦����������������switch
	 */
	
	public static void SwitchCase(){
		/*�����ȼ�
		 * A---[90,100]
		 * B---[80,90)
		 * C---[70,80)
		 * D---[60,70)
		 * ������---[0,60)
		 */
		System.out.println("--------�����ȼ�---------");
		int score; //�û�����ķ���
		//��鲻�Ϸ���������
		do{
			System.out.print("�����������");
			score = scan.nextInt();
		}while(0>score || score>100);
		//���ݷ�������ȼ�
		switch(score/10){
		case 10:
		case 9:      //9,10���õ�A
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:  //�����������֮������������
			System.out.println("������");
		}
		
	}
	
}//class
