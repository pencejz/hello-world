package day02;

import java.util.Scanner;

/**
 * 正则表达式校验身份证号码、邮编、电话号码的合法性
 * @author Administrator
 *
 */
public class RegexUtil {
	//定义静态常量的正则表达式
	public static final String ID_CARD = 
			"^[1-9]\\d{13}(\\d|[a-zA-Z])|[1-9]\\d{16}(\\d|[a-zA-Z])$"; //身份证号码正则表达式
	public static final String ZIP_CODE = "^[1-9][0-9]{5}$"; //邮编正则表达式
	public static final String PHONE_NUMBER = "^1\\d{10}$"; //电话正则表达式
	public static final String DISCOUNT = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";//正浮点数
	//检查字符串是否和正则表达式匹配
	public static boolean check(String str,String regex){
		return str.matches(regex);
	}
	//检测身份证的合法性
	public static void idCard(String str){
		if(check(str,ID_CARD)){
			System.out.println("你输入的身份证合法！");
		}else{
			System.out.println("你输入的身份证不合法！");
		}
	}
	//检测邮编的合法性
	public static void zipCode(String str){
		if(check(str,ZIP_CODE)){
			System.out.println("你输入的邮编合法！");
		}else{
			System.out.println("你输入的邮编不合法！");
		}
	}
	//检测电话号码的合法性
	public static void phoneNumber(String str){
		if(check(str,PHONE_NUMBER)){
			System.out.println("你输入的电话号码合法！");
		}else{
			System.out.println("你输入的电话号码不合法！");
		}
	}
	public static void 正浮点数(String str){
		if(check(str,DISCOUNT)){
			System.out.println("你输入的正浮点数合法！");
		}else{
			System.out.println("你输入的正浮点数不合法！");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入身份证号码："+"\n");
//		String id = scan.nextLine();
//		System.out.print("请输入邮编："+"\n");
//		String code = scan.nextLine();
//		System.out.print("请输入电话号码："+"\n");
//		String phoneNumber = scan.nextLine();
//		
//		idCard(id);
//		zipCode(code);
//		phoneNumber(phoneNumber);
		
//		System.out.print("请输入浮点数："+"\n");
//		String a = scan.nextLine();
//		正浮点数(a);
		
		
		//(E22,(E10,E18,E20,E22,E23,E24))
		String regex = "^([A-Z]d{2},([A-Z]d{2})(,[A-Z]d{2})+)$";
		String str = "(E22,(E10,E18,E20,E22,E23,E24))";
		System.out.println(str.matches(regex));

		
		
		
		
		
		
		
		
		
	}
	
	
	

}
