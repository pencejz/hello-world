package day03;

import java.util.Calendar;

/**
 * int getActualMaximum()
 * ��ȡĳ��ʱ���������������ֵ
 * @author Administrator
 *
 */
public class CalendarDemo5 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		int yearDay = calendar.getActualMaximum(calendar.DAY_OF_YEAR);
		System.out.println(yearDay);
		int monthDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println(monthDay);
	}
}
