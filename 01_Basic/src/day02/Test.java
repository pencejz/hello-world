package day02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] arges){
		/**����һ
		 * �����û�������������ݣ��������
		 * ����int�ͱ���age���ڴ洢�������
		 * ����double�ͱ���price���ڴ洢�����������ѵĽ��
		 * ����char�ͱ���gender���ڴ洢����Ա�
		 * ����boolean�ͱ���isMerried���ڴ洢���ѻ�����״̬
		 */
//		test1();

		/**�����
		 * ��дһ��������̨�տ����
		 * Ҫ�󣺽����û��������Ʒ���ۡ����������Լ��տ���
		 * ���㲢���Ӧ�ս�������
		 * BigDecimal---ר�ž�ȷ���㸡��������
		 */
//		test2();
		
		
		/**˼��
		 * char x;int y;float w,z;
		 * ��x*y+w-z�Ľ����ʲô���ͣ�
		 */
		char x='a';
		int y=1;
		float w=2.5f;
		float z=1.1f;
		a(x*y+w-z);
		
	}//main
	
	//������Ϊdouble�����double
	public static void a(double d){
		System.out.println("double");
	}
	//������Ϊfloat��������Ϊfloat
	public static void a(float f){
		System.out.println("float");
	}
	
	
	public static void test1(){
		//�û���������
		System.out.println("���������䣺");
		int age=scan.nextInt();
		System.out.println("������������ǣ�"+age);
		//�û�����۸�
		System.out.println("������۸�");
		double price=scan.nextDouble();
		System.out.println("������ļ۸��ǣ�"+price);
		//�û������Ա�
		System.out.println("�������Ա�");
		String gender=scan.nextLine();
		System.out.println("��������Ա��ǣ�"+gender);
		//�û������Ƿ���
		System.out.println("�������Ƿ��飺");
		boolean isMerried=scan.nextBoolean();
		System.out.println("������Ļ���״���ǣ�"+isMerried);
		
	}
	
	public static void test2(){
		//��Ʒ��������
		System.out.print("�����뵥�ۣ�");
		double price=scan.nextDouble();
		//���������
		System.out.print("�����빺��������");
		int count=scan.nextInt();
		//ʵ���տ���
		System.out.println("�˿͸���Ǯ��");
		double pay=scan.nextDouble();
		//Ӧ�ս��
		double total=price*count;
		//����
		double bal=pay-total;
		BigDecimal b = new BigDecimal(bal);
		double bal2 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		//���
		System.out.println("Ӧ�ս�"+total+"Ԫ");
		System.out.println("��֧����"+pay+"Ԫ");
		System.out.println("���㣺"+bal2+"Ԫ");
		
	}

	
}//class
