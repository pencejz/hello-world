package day05;
/**
 * whileѭ����forѭ��ʵ��
 * �û���������n��ʵ�ֽ�n�������
 */
import java.util.Scanner;

public class While {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*whileѭ��ʵ��*/
		//While();
		
		/*forѭ��ʵ��*/
//		For();
		
		/*breakѭ��ʵ��---����ѭ��*/
//		Break();
		
		
	}//main
	
	public static void While(){
		System.out.println("������һ������n��");
		int n = scan.nextInt(); //�û����������n
		int m = 0; //n�ķ������ֵm
		while(n>0){
			int last = n % 10; //��ǰn�ĸ�λ����ֵ
			m = m*10 + last;
			n = n/10;
		}
		System.out.println(m);
	}
	
	public static void For(){
		System.out.println("������һ������n��");
		int n = scan.nextInt(); //�û����������n
		int m = 0; //n�ķ������ֵm
		int l = String.valueOf(n).length(); //�û��������������
		for(int i=0;i<l;i++){
			int last = n % 10; //��ǰn�ĸ�λ����ֵ
			m = m*10 + last;
			n = n/10;
		}
		System.out.println(m);
	}
	
	public static void Break(){
		System.out.println("������һ������n��");
		int n = scan.nextInt(); //�û����������n
		int m = 0; //n�ķ������ֵm
		while(true){ //��ѭ��
			int last = n % 10; //��ǰn�ĸ�λ����ֵ
			m = m*10 + last;
			n = n/10; //ɾ��n�ĸ�λ����ֵ
			if(n==0){
				break;
			}
		}
		System.out.println(m);
	}
	
	
}//class
