package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 允许按照一个指定的日期格式在String与Date之间相互转换
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo1 {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		System.out.println(date);
		
		/**
		 * Date--->String
		 * String format(Date date)
		 * 按指定的日期格式将给定的date所表示的时间转换为String型
		 * 2016-06-24 10:22:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		//指定格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//按照指定格式转换
		String str = sdf.format(date);
		System.out.println(str);
		/**
		 * String--->Date
		 * Date parse(String str)
		 */
		String str1 = "2008年08月08日 20:08:08";
		//指定格式
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//按照指定格式转换
		Date date1 = sdf1.parse(str1);
		System.out.println(date1);
		
		
		
	}//main
	
}







