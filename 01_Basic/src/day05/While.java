package day05;
/**
 * while循环、for循环实现
 * 用户输入整数n，实现将n反向输出
 */
import java.util.Scanner;

public class While {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*while循环实现*/
		//While();
		
		/*for循环实现*/
//		For();
		
		/*break循环实现---跳出循环*/
//		Break();
		
		
	}//main
	
	public static void While(){
		System.out.println("请输入一个整数n：");
		int n = scan.nextInt(); //用户输入的整数n
		int m = 0; //n的反向输出值m
		while(n>0){
			int last = n % 10; //当前n的个位数的值
			m = m*10 + last;
			n = n/10;
		}
		System.out.println(m);
	}
	
	public static void For(){
		System.out.println("请输入一个整数n：");
		int n = scan.nextInt(); //用户输入的整数n
		int m = 0; //n的反向输出值m
		int l = String.valueOf(n).length(); //用户输入的整数长度
		for(int i=0;i<l;i++){
			int last = n % 10; //当前n的个位数的值
			m = m*10 + last;
			n = n/10;
		}
		System.out.println(m);
	}
	
	public static void Break(){
		System.out.println("请输入一个整数n：");
		int n = scan.nextInt(); //用户输入的整数n
		int m = 0; //n的反向输出值m
		while(true){ //死循环
			int last = n % 10; //当前n的个位数的值
			m = m*10 + last;
			n = n/10; //删除n的各位数的值
			if(n==0){
				break;
			}
		}
		System.out.println(m);
	}
	
	
}//class
