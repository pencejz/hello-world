package day09;

public class Demo3{
	public static void main(String[] args) {
		/**
		 * 方法的重载：方法名一样，参数不同
		 * pay方法用于支付的方法
		 * 三种支付方法：现金、银行卡，支付宝
		 */	
		PayMoney paymoney = new PayMoney();
		paymoney.pay(20.0); //现金支付
		paymoney.pay(123456); //现金支付
		paymoney.pay("123456"); //支付宝支付
		paymoney.pay("123456", "456789"); //银行卡支付
		
	}
}
		
/**
 * pay方法用于支付的方法
 * 三种支付方法：现金、银行卡，支付宝
 */	
class PayMoney{
	public void pay(double money){
		System.out.println("现金支付");
	}
	public void pay(String id,String pwd){
		System.out.println("银行卡支付");
	}
	public void pay(String barcode){
		System.out.println("支付宝支付");
	}
	
}


