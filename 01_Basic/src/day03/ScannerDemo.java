package day03;
//Scanner�����ַ���
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//in�������̨(Console)���ӿ���̨��ȡ����
		System.out.print("�������ַ�����");
		String str = scan.nextLine();
		System.out.println("������������ǣ�"+str);
		//ȡ���ַ�����ĳһ��λ�õ��ַ������浽c��
		char c = str.charAt(0);
		System.out.println(c);
		//�ж�������ַ�c�Ƿ�Ϊ��д��ĸ---�ǣ�����true�����ǣ�����flase
		//  A(65)~Z(90)
		boolean isChar = 'A'<=c && c<='Z';
		System.out.println(isChar);
		
		scan.close();
		
	}

}


