//3.���ӵ÷�
package GuessNumber;
//��������Ϸ
import java.util.Scanner;  //�û�����֧��

public class GuessNumber3 {
	
	public static void main(String[] args){
		int score=0;
		Scanner scan=new Scanner(System.in);   //����
		//ϵͳ�����������
		int num=(int)(Math.random()*1000+1);  //�������1--1000������
		                                      //Matn.random()--------�������0--0.9999...
		                                      //Matn.random()*1000--------�������0--999.9...
		                                      //Matn.random()*1000+1--------�������1--1000.999...
		                                      //(int)(Matn.random()*1000+1)--------�������1--1000������(ǿ��ת��)
		System.out.println(num);      //��ʾ���������
		String a=String.valueOf(num);		//����������������ĳ���
		System.out.println(a.length());     //��ʾ����������ĳ���
		System.out.println("�°ɣ�(��0�˳�)");
		int guess;
		int i=0; //�²����
		for(;i<1000;i++){
			guess=scan.nextInt();
			if(guess==0){
				System.out.println("�´������ɣ�");
				break;
			}else if(guess==num){
					score=a.length()*100-i*10;
					System.out.println("��ϲ�����ˣ����ĵ÷���:"+score+"�֡����ܹ�����"+i+"�Ρ�");
					break;
				}else if(guess<num){
					System.out.println("С��");
				}else{
					System.out.println("����");
				}
				System.out.println("�����°ɣ�");
					
		}//for
		
		scan.close();
		
	}//main
	
}//class



