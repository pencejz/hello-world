package day04;
/**��Ŀ����*/
import java.util.Scanner;

public class Opt3Demo {

	public static void main(String[] args) {
		/**
		 *�������ʽ---��Ŀ����
		 */
		//�����û������������rows��ÿҳ25�У����������ҳ��
		Scanner scan = new Scanner(System.in);
		System.out.print("������ҳ����");
		int rows = scan.nextInt();
		int pages;
		
		//��Ŀ����
		pages = rows%25 == 0 ? rows/25 : rows/25+1; //����ҳ��
		System.out.println("�ܵ�ҳ��Ϊ��"+pages);
		
		//��Ŀ����Ƕ��
		int size = (0<=rows && rows<=65535)  //�����ҳ����ĳһ��Χ��
				? (pages = rows%25 == 0 ? rows/25 : rows/25+1)  //����ҳ��
				: 0;
		if(size == 0){
			System.out.println("�������ҳ������");
		}
		System.out.println(size);
		int a = -3;
		String r = a>0 ? "����" : (a == 0 ? "0" : "����");
		System.out.println("r="+r);
		/**������жϳ���
		 * �û�����һ�����
		 * ����1.�ܱ�4����,���ܱ�100����
		 *    2.�ܱ�400����
		 */
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		boolean leap = ((year%4 == 0) && !(year%100 == 0)) || (year%400 == 0);
		if(leap){
			System.out.println(year+"��������");
		}else{
			System.out.println(year+"�겻������");
		}
		
		scan.close();
		
	}//main

}//class


















