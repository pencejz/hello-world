package day05;
/**DoWhileʵ�ּ���û�������Ƿ���0~100֮��ķ����ķ���*/
import java.util.Scanner;

public class Score {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		//score();
		//ifScore();
		//switchScore();
		
	}//main
	
	/**DoWhileʵ�ּ���û�������Ƿ���0~100֮��ķ����ķ��� */
	public static void score(){
		int score; //�����û�����ķ���
		do{ //�û��������
			System.out.print("�����������");
			score = scan.nextInt();
			if(0>score || score>100){
				System.out.println("������ķ������Ϸ������������룡");
			}
		}while(0>score || score>100);
		System.out.println("������ķ���Ϊ��"+score);
	}
	/**
	 * DoWhileʵ�ּ���û�������Ƿ���0~100֮��ķ����ķ���
	 * �����û�����ķ�������if��������Ӧ�ĵȼ�
	 */
	public static void ifScore(){
		int score;
		do{
			System.out.print("�����������");
			score = scan.nextInt();
			if(0>score || score>100){
				System.out.println("������ķ������Ϸ������������룡");
			}
		}while(0>score || score>100);
		System.out.println("������ķ���Ϊ��"+score);
		//if�����Ӧ�ȼ�
		if(score >=90){
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score >=70){
			System.out.println("C");
		}else if(score >=60){
			System.out.println("D");
		}else if(score <60){
			System.out.println("�����񣡣���");
		}
		
	}
	/**
	 * DoWhileʵ�ּ���û�������Ƿ���0~100֮��ķ����ķ���
	 * �����û�����ķ�������switch��������Ӧ�ĵȼ�
	 */
	public static void switchScore(){
		//�û�����ͷ������
		int score;
		do{
			System.out.println("�����������");
			score = scan.nextInt();
			if(0>score || score>100){
				System.out.println("������ķ������Ϸ������������룡");
			}
		}while(0>score || score>100);
		System.out.println("������ķ���Ϊ��"+score);
		//�ȼ���ѯ
		switch(score/10){
		case 10:
			System.out.println("��ϲ�㣡���100�֣�");
			break;
		case 9:
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
		default:
			System.out.println("�����񣡣���");
			
		}
		
	}

	
}//class









