package day03;

import java.util.Calendar;

/**
 * 获取当前Calendar表示的日期和指定时间分量所对应的值
 * @author Administrator
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		/**
		 * int get(int field)
		 * 获取指定时间分量对应的值
		 */
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1; //第一月从0开始算
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		//查看今天是周几
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		//注意：一周中的第一天为星期天
		String[] ary = new String[]{"日","一","二","三","四","五","六"};
		System.out.println("今天是星期"+ary[weekDay-1]);
		System.out.println(ary.length);
		//查看今天是今年的第几天
		int yearDay = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+yearDay+"天");
		
		
		
		
		
	}
	
	
	
}





