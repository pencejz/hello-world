package day01;
//String--->解决字符串频繁修改的问题---> StringBuilder
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		/**
		 * 要求用户输入一个网站的网址，如：www.biadu.com
		 * 然后经过程序处理，输出该地址的域名，如：baidu
		 */
		//getName();
		
		/**
		 * 判断一个字符串是否是回文
		 */
		//isHuiWen();
		/**
		 * 课后作业
		 */
		//test();
		
		
		
		
		
	}//main
	
	//课后作业
	public static void test() {
		
		String str = "HelloWorld";
		//1.输出字符串“HelloWorld”的字符长度
		System.out.println("第一题："+str.length()); //10
		//2.输出“o”的位置---方法1
		System.out.print("第2题：方法1：");
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='o'){
				System.out.print(" "+i);
			}
		}
		System.out.println();
		//2.输出“o”的位置---方法2
		System.out.print("              方法2：");
		for(int i=0;i<str.length();i++){
			i = str.indexOf("o",i);
			if(i<0){
				break;
			}
			System.out.print(" "+i);
		}
		System.out.println();
		//3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
		System.out.println("第3题： "+str.indexOf("o",5));
		//4:截取"HelloWorld"中的"Hello"并输出
		System.out.println("第4题："+str.substring(0, 5));
		//5:截取"HelloWorld"中的"World"并输出
		System.out.println("第5题："+str.substring(5, 10));
		//6:将字符串"  Hello   "中两边的空白去除后输出
		String s = "  Hello   ";
		System.out.println("第6题："+s.trim());
		//7:输出"HelloWorld"中第6个字符"W"
		System.out.println("第7题："+str.charAt(5));
		//8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的
		boolean start = str.startsWith("h");
		boolean end = str.endsWith("ld");
		System.out.println("第8题："+"是否以h开头-"+start+",是否以ld结束-"+end);
		//9:将"HelloWorld"分别转换为全大写和全小写并输出
		System.out.println("第9题："+str.toUpperCase()+" "+str.toLowerCase());
		//10:将"大家好!"修改为:"大家好!我是程序员!"并输出
		//   然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
		//   然后再修改为:"大家好!我是牛牛的程序员!"并输出
		//   然后在修改为:"我是牛牛的程序员!"并输出
		System.out.print("第10题：");
		String s1 = "大家好！";
		StringBuilder builder = new StringBuilder(s1);
		//   增加
		builder.append("我是程序员！");
		//s1 = builder.toString();
		//System.out.println(s1);
		System.out.println(builder);
		//   修改
		builder.replace(4, 10, "我是牛牛的程序员！");
		System.out.println("                "+builder);
		//   删除
		builder.delete(0, 4);
		System.out.println("                "+builder);
		
			
		
		
		
	}

	//获得域名
	public static void getName(){
		//用户输入
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入网址：");
		String str = scan.nextLine();
		//截取两个点之间的内容
		int start = str.indexOf(".")+1;
		int end = str.indexOf(".", start);
		String sub = str.substring(start, end);
		System.out.println("域名为： "+sub);
		scan.close();		
	}
	
	//判断回文
	public static void isHuiWen(){
		//方法1：
		String str = "上海自来水来自海上";
		boolean tf = true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				System.out.println("不是回文！");
				tf = false;
				break; //跳出当前循环
			}
		}
		if(tf){
			System.out.println("是回文！");
		}
		
		//方法2：(常用)
		str = "上海自来水来自海上";
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				System.out.println("不是回文！");
				return; //跳出当前方法
			}
		}
		System.out.println("是回文！");		
	}
}
