//2.������;�˳�---->ϵͳ�����������
package GuessNumber;
import java.util.Scanner;  //�û�����֧��

public class GuessNumber2 {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);   //����
		//ϵͳ�����������
		int num=(int)(Math.random()*1000+1);  //�������1--1000������
		                                      //Matn.random()--------�������0--0.9999...
		                                      //Matn.random()*1000--------�������0--999.9...
		                                      //Matn.random()*1000+1--------�������1--1000.999...
		                                      //(int)(Matn.random()*1000+1)--------�������1--1000������(ǿ��ת��)
		//System.out.println(num);      //��ʾ���������
		
		System.out.println("�°ɣ�");
		int guess=scan.nextInt();      //ѭ�����������ʼ��
		
		while(guess!=num){             //ѭ������
			
			if(guess==0){
				break;                 //�õ�0��ֱ���˳�
			}
			
			if(guess<num){
				System.out.println("С��");
			}else{
				System.out.println("����");
			}                			//��С�Ա���ʾ
			
			
			System.out.println("�°ɣ�");
			guess=scan.nextInt();             //ѭ�������ĸı�
			
		}
		
		if(guess==num){
			System.out.println("��ϲ�����ˣ�");
		}else{
			System.out.println("�´������ɣ�");
		}
		
		scan.close();
		
	}//main
	
}//class



