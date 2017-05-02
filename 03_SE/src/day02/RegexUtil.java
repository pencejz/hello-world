package day02;

import java.util.Scanner;

/**
 * ������ʽУ�����֤���롢�ʱࡢ�绰����ĺϷ���
 * @author Administrator
 *
 */
public class RegexUtil {
	//���徲̬������������ʽ
	public static final String ID_CARD = 
			"^[1-9]\\d{13}(\\d|[a-zA-Z])|[1-9]\\d{16}(\\d|[a-zA-Z])$"; //���֤����������ʽ
	public static final String ZIP_CODE = "^[1-9][0-9]{5}$"; //�ʱ�������ʽ
	public static final String PHONE_NUMBER = "^1\\d{10}$"; //�绰������ʽ
	public static final String DISCOUNT = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";//��������
	//����ַ����Ƿ��������ʽƥ��
	public static boolean check(String str,String regex){
		return str.matches(regex);
	}
	//������֤�ĺϷ���
	public static void idCard(String str){
		if(check(str,ID_CARD)){
			System.out.println("����������֤�Ϸ���");
		}else{
			System.out.println("����������֤���Ϸ���");
		}
	}
	//����ʱ�ĺϷ���
	public static void zipCode(String str){
		if(check(str,ZIP_CODE)){
			System.out.println("��������ʱ�Ϸ���");
		}else{
			System.out.println("��������ʱ಻�Ϸ���");
		}
	}
	//���绰����ĺϷ���
	public static void phoneNumber(String str){
		if(check(str,PHONE_NUMBER)){
			System.out.println("������ĵ绰����Ϸ���");
		}else{
			System.out.println("������ĵ绰���벻�Ϸ���");
		}
	}
	public static void ��������(String str){
		if(check(str,DISCOUNT)){
			System.out.println("����������������Ϸ���");
		}else{
			System.out.println("������������������Ϸ���");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("���������֤���룺"+"\n");
//		String id = scan.nextLine();
//		System.out.print("�������ʱࣺ"+"\n");
//		String code = scan.nextLine();
//		System.out.print("������绰���룺"+"\n");
//		String phoneNumber = scan.nextLine();
//		
//		idCard(id);
//		zipCode(code);
//		phoneNumber(phoneNumber);
		
//		System.out.print("�����븡������"+"\n");
//		String a = scan.nextLine();
//		��������(a);
		
		
		//(E22,(E10,E18,E20,E22,E23,E24))
		String regex = "^([A-Z]d{2},([A-Z]d{2})(,[A-Z]d{2})+)$";
		String str = "(E22,(E10,E18,E20,E22,E23,E24))";
		System.out.println(str.matches(regex));

		
		
		
		
		
		
		
		
		
	}
	
	
	

}
