package day03;

import java.util.Scanner;

public class CharDemo {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		/**�ӿ���̨����һ���ַ����ж��Ƿ���Ӣ���ַ�*/
		System.out.print("�������ַ�����");
		String str = scan.nextLine();
		char c = str.charAt(0);
		boolean isChar = ('A'<=c&&c<='Z')||('a'<=c&&c<='z');
		System.out.println(isChar);
		
		/**�ӿ���̨����һ���ַ����жϲ���Ӣ���ַ�*/
/*		System.out.print("�������ַ�����");
		String str1 = scan.nextLine();
		char c1 = str1.charAt(0);
		boolean isChar1 = !(('A'<=c&&c<='Z')||('a'<=c&&c<='z'));
		System.out.println(isChar1);
*/		
		/**�ӿ���̨����һ�����䣬�ж��Ƿ�Ϊ��ͯ������ǣ��������ͯ�ڿ���*/
/*		System.out.println("���������䣺");
		int age = scan.nextInt();
		if(age<=16){
			System.out.println("��ͯ�ڿ��֣�");
		}
*/		
		/**
		 * ��·�߼�
		 * 1.����ʱ����һ��Ϊ�٣����ɵõ�false
		 * 2.���ʱ����һ��Ϊ�棬���ɵõ�true
		 */
		int i = 100,j = 200;
		boolean b1 = (i>j)&&(i++>100);
		System.out.println(b1); //i>jΪ�٣������ж�i++>100,�Ϳɵõ�false
		System.out.println(i); //i�Ľ��Ϊ100��i++δִ�У������ֶ�·
		boolean b3 = (i<j)&&(i++>100);
		System.out.println(b3); //i<jΪ�棬�����ж�i++>100Ϊ�٣����õ�false
		System.out.println(i); //i�Ľ��Ϊ101��ִ�й�i++
		boolean b2 = (i<j)||(j++<200);
		System.out.println(b2); //i<jΪ�棬����ִ��j++���Ϳɵõ�true
		System.out.println(j); //j�Ľ����200��j++δִ�У������ֶ�·
		
		scan.close();
	}
}
