package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {
		/**
		 * 要求用户输入自己的生日：1992-08-05
		 * 输出到今天为止活了多少天？
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的生日(yyyy-MM-dd)");
		String str = scan.nextLine();
		//给定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//按照格式得到生日日期(String--->Date)
		Date date = sdf.parse(str);
		System.out.println(date);
		//从1970年到生日的毫秒数
		long birthTime = date.getTime(); //将1970年元旦到某一日期的时间段转化为毫秒数
		//获取从1970年元旦到当前时间的毫秒数
		long nowTime = System.currentTimeMillis();
		//得到天数
		long days = (nowTime-birthTime)/1000/60/60/24;
		System.out.println("恭喜你！到今天，你已经在地球上平安的度过了"+days+"天!");
		
		
		//从1970年元旦起，到生日后10000天的总毫秒值
		long futureTime = birthTime+(long)10000*24*60*60*1000;
		//从生日开始10000天以后的日期
		date.setTime(futureTime); //将1970年元旦至某一时刻的毫秒数转化为日期
		//设置日期格式
		sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//按照格式得到生日日期(Date--->String)
		str = sdf.format(date);
		System.out.println("你的10000天纪念日为："+str);
		scan.close();
		

	}
	
	/**
	 * 用户输入一个商品的生产日期(2014-06-24)和保质期的天数(100)
	 * 计算商品的促销日
	 * 规则：该商品过期日的前两周的周三
	 */

}
