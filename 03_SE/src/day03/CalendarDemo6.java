package day03;

import java.util.Calendar;

/**
 * void add(int field,int value)
 * 是当前Calendar加上指定时间分量所对应的值，以表示该日期。
 * 若指定的值为负数，则视为减法
 * @author Administrator
 *
 */
public class CalendarDemo6 {

	public static void main(String[] args) {
		
		/**
		 * 查看3年2个月3天以后是哪天？
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		calendar.add(calendar.YEAR, 3); //加上3年
		System.out.println(calendar.getTime());
		calendar.add(calendar.MONTH, 2); //加上2个月
		System.out.println(calendar.getTime());
		calendar.add(calendar.DAY_OF_YEAR, 3); //加上3天。此处最好使用DAY_OF_YEAR
		System.out.println(calendar.getTime());
		
		
	}
}
