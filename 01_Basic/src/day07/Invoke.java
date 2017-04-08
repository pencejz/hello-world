package day07;
//变量
public class Invoke {

	public static void main(String[] args) {
		//max方法调用
		int a = 5, b = 9;
		max(5,9);
		
	}//main
	
	/**
	 * 计算两个数中的最大值
	 */
	public static int max(int a,int b){
		int y = a>b?a:b;
		System.out.println("最大值："+y);
		return y;
	}
	
}//class

/**
 * 局部变量：在方法中声明的变量，指在方法范围内有效的变量
 * 方法的参数也是局部变量
 * 局部变量在java栈中分配空间，当方法调用结束，方法中的局部变量全部销毁，回收
 */




