package day01;
//String--->����ַ���Ƶ���޸ĵ�����---> StringBuilder
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		/**
		 * Ҫ���û�����һ����վ����ַ���磺www.biadu.com
		 * Ȼ�󾭹�����������õ�ַ���������磺baidu
		 */
		//getName();
		
		/**
		 * �ж�һ���ַ����Ƿ��ǻ���
		 */
		//isHuiWen();
		/**
		 * �κ���ҵ
		 */
		//test();
		
		
		
		
		
	}//main
	
	//�κ���ҵ
	public static void test() {
		
		String str = "HelloWorld";
		//1.����ַ�����HelloWorld�����ַ�����
		System.out.println("��һ�⣺"+str.length()); //10
		//2.�����o����λ��---����1
		System.out.print("��2�⣺����1��");
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='o'){
				System.out.print(" "+i);
			}
		}
		System.out.println();
		//2.�����o����λ��---����2
		System.out.print("              ����2��");
		for(int i=0;i<str.length();i++){
			i = str.indexOf("o",i);
			if(i<0){
				break;
			}
			System.out.print(" "+i);
		}
		System.out.println();
		//3:���"HelloWorld"�д��±�5����ʼ��һ�γ���"o"��λ��
		System.out.println("��3�⣺ "+str.indexOf("o",5));
		//4:��ȡ"HelloWorld"�е�"Hello"�����
		System.out.println("��4�⣺"+str.substring(0, 5));
		//5:��ȡ"HelloWorld"�е�"World"�����
		System.out.println("��5�⣺"+str.substring(5, 10));
		//6:���ַ���"  Hello   "�����ߵĿհ�ȥ�������
		String s = "  Hello   ";
		System.out.println("��6�⣺"+s.trim());
		//7:���"HelloWorld"�е�6���ַ�"W"
		System.out.println("��7�⣺"+str.charAt(5));
		//8:���"HelloWorld"�Ƿ�����"h"��ͷ��"ld"��β��
		boolean start = str.startsWith("h");
		boolean end = str.endsWith("ld");
		System.out.println("��8�⣺"+"�Ƿ���h��ͷ-"+start+",�Ƿ���ld����-"+end);
		//9:��"HelloWorld"�ֱ�ת��Ϊȫ��д��ȫСд�����
		System.out.println("��9�⣺"+str.toUpperCase()+" "+str.toLowerCase());
		//10:��"��Һ�!"�޸�Ϊ:"��Һ�!���ǳ���Ա!"�����
		//   Ȼ��"��Һ�!���ǳ���Ա!"�޸�Ϊ:"��Һ�!��������ĳ���Ա!"�����
		//   Ȼ�����޸�Ϊ:"��Һ�!����ţţ�ĳ���Ա!"�����
		//   Ȼ�����޸�Ϊ:"����ţţ�ĳ���Ա!"�����
		System.out.print("��10�⣺");
		String s1 = "��Һã�";
		StringBuilder builder = new StringBuilder(s1);
		//   ����
		builder.append("���ǳ���Ա��");
		//s1 = builder.toString();
		//System.out.println(s1);
		System.out.println(builder);
		//   �޸�
		builder.replace(4, 10, "����ţţ�ĳ���Ա��");
		System.out.println("                "+builder);
		//   ɾ��
		builder.delete(0, 4);
		System.out.println("                "+builder);
		
			
		
		
		
	}

	//�������
	public static void getName(){
		//�û�����
		Scanner scan = new Scanner(System.in);
		System.out.print("��������ַ��");
		String str = scan.nextLine();
		//��ȡ������֮�������
		int start = str.indexOf(".")+1;
		int end = str.indexOf(".", start);
		String sub = str.substring(start, end);
		System.out.println("����Ϊ�� "+sub);
		scan.close();		
	}
	
	//�жϻ���
	public static void isHuiWen(){
		//����1��
		String str = "�Ϻ�����ˮ���Ժ���";
		boolean tf = true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				System.out.println("���ǻ��ģ�");
				tf = false;
				break; //������ǰѭ��
			}
		}
		if(tf){
			System.out.println("�ǻ��ģ�");
		}
		
		//����2��(����)
		str = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				System.out.println("���ǻ��ģ�");
				return; //������ǰ����
			}
		}
		System.out.println("�ǻ��ģ�");		
	}
}
