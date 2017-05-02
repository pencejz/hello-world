package day03;
//Date与Calendar的互转

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * 日历类。用于对时间的操作，提供了丰富的操作时间的相关方法
 * 它本身是一个抽象类，常用的实现类：GregorianCalendar，即为阳历立法
 * Calendar提供了个静态方法getInstance来获取一个当前系统所在地区适用的Calendar实现类实例
 * 通常返回就是GregorianCalendar
 */
public class CalendarDemo2 {
	
	public static void main(String[] args) {
		//获取当前系统时间
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString方法不能直观的反映出表示的日期
		 */
		System.out.println(calendar);
		/**
		 * Date getTime()
		 * Calendar--->Date
		 * Calendar提供了该方法可以返回一个Date类型实例
		 * 该实例表示的日期就是当前Calendar表示的日期
		 * 该方法也可以看成是从Calendar类转换成Date的类操作
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		//明天这一刻
		date.setTime(date.getTime()+1000*24*60*60);
		System.out.println("date表示："+date);
		/**
		 * void setTime(Date date)
		 * Calendar提供了该方法允许让当前Calendar表示给定的Date所表示的日期
		 * Date--->Calendar的过程
		 */
		calendar.setTime(date);
		System.out.println("calendar表示："+date);
		
	}
	
}















