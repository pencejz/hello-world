package AnswerQuestion;
//��10��������
import java.util.Scanner;

public class AnswerQuestion {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		int score=0; //�������
		for(int i=1;i<11;i++){
			//����---�������1~100������
			int a=(int)(Math.random()*100)+1;
			int b=(int)(Math.random()*100)+1;
			int result=a+b; //����a+b��ֵ
			System.out.println("�������"+i+"��."+a+"+"+b+"=?");
			//����
			System.out.print("��д����Ĵ�(����-1�˳�):");
			int answer=scan.nextInt(); //�û�����Ĵ�
			//����-1����ǰ����,�˳�ѭ��
			if(answer==-1){
				break;
			}
			//����
			if(answer==result){
				System.out.println("��ϲ�㣬�����ˣ�");
				score+=10;
			}else{
				System.out.println("���ź��������ˣ�");
			}
			//�ּܷ���
		}
		
		System.out.println("�ܷ�Ϊ:"+score);
		scan.close();
	}

}
