package day03;
/**
 * calendar设置时间
 */
import java.util.Calendar;

/**
 * Calendar提供了一个方法：
 * void set(int field,int value)
 * 针对给定的时间分量(时间单位)，来对其进行设定值
 * 时间分量是一个int型的值，无需记住具体的数字，因为都是使用Calendar的常量
 * @author Administrator
 *
 */
public class CalendarDemo3 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		/*
		 * 设置时间为2008.08.08 20:08:08
		 */
		calendar.set(Calendar.YEAR, 2008);       //年
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH, 7);         //月，第一个月是从0开始算起
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_MONTH, 8);  //月中的某一天
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.HOUR, 8);          //时(12小时制)
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.HOUR_OF_DAY, 20);  //天中的某一小时(24小时制)
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MINUTE, 8);        //分
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.SECOND, 8);        //秒
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_YEAR, 100); //年中的某一天
		System.out.println(calendar.getTime());
		
		
	}
	
	
	
}
