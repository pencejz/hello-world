package day09;

public class Demo3{
	public static void main(String[] args) {
		/**
		 * ���������أ�������һ����������ͬ
		 * pay��������֧���ķ���
		 * ����֧���������ֽ����п���֧����
		 */	
		PayMoney paymoney = new PayMoney();
		paymoney.pay(20.0); //�ֽ�֧��
		paymoney.pay(123456); //�ֽ�֧��
		paymoney.pay("123456"); //֧����֧��
		paymoney.pay("123456", "456789"); //���п�֧��
		
	}
}
		
/**
 * pay��������֧���ķ���
 * ����֧���������ֽ����п���֧����
 */	
class PayMoney{
	public void pay(double money){
		System.out.println("�ֽ�֧��");
	}
	public void pay(String id,String pwd){
		System.out.println("���п�֧��");
	}
	public void pay(String barcode){
		System.out.println("֧����֧��");
	}
	
}


