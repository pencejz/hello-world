package day03;
//Scanner输入字符串
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//in代表控制台(Console)，从控制台读取数据
		System.out.print("请输入字符串：");
		String str = scan.nextLine();
		System.out.println("你输入的内容是："+str);
		//取出字符串中某一个位置的字符，保存到c中
		char c = str.charAt(0);
		System.out.println(c);
		//判断输入的字符c是否为大写字母---是，返回true。不是，返回flase
		//  A(65)~Z(90)
		boolean isChar = 'A'<=c && c<='Z';
		System.out.println(isChar);
		
		scan.close();
		
	}

}


