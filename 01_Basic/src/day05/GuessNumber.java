package day05;

import java.util.Random;
import java.util.Scanner;

/**
 * ��������Ϸ
 * ����һ����a���û��²�
 * ��ʾ���˻���С�ˣ�Ȼ������²�
 * ֱ���²���ȷΪֹ
 * 0---�˳�
 * ����ʱ����������:1.nanoTime():������
 *              2.Radom��
 */
public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//int a = (int)(System.nanoTime() %100 +1);
		Random random = new Random();
		int a = random.nextInt(10)+1;
		System.out.println(a);
		while(true){
			System.out.println("�°ɣ�(����0---�˳�)");
			int n = scan.nextInt();
			if(n==0){
				System.out.println("��ӭ�´�������");
				break;
			}
			if(n==a){
				System.out.println("��ϲ��¶��ˣ�");
				break;
			}
			if(n<a){
				System.out.println("С��");
			}
			if(n>a){
				System.out.println("����");
			}
			
		}//while
		
	}//mian
	
}//class
