package GuessNumber;
//1.���ѭ��--->��С�Ա�
import java.util.Scanner;   //�û�����֧��

public class GuessNumber {
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);   //����
		int num=250;
		
		System.out.println("�°ɣ�");
		int guess=s.nextInt();      //1.ѭ�����������ʼ��
		while(guess!=num){             //2.ѭ������
			//��С�Ա���ʾ
			if(guess<num){
				System.out.println("С��");
			}else{
				System.out.println("����");
			}
			
			System.out.println("�°ɣ�");
			guess=s.nextInt();          //3.ѭ�������ĸı�
		}
		System.out.println("��ϲ�����ˣ�");
		
		s.close();
		
	}//main
		
}//class


