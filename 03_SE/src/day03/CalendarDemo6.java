package day03;

import java.util.Calendar;

/**
 * void add(int field,int value)
 * �ǵ�ǰCalendar����ָ��ʱ���������Ӧ��ֵ���Ա�ʾ�����ڡ�
 * ��ָ����ֵΪ����������Ϊ����
 * @author Administrator
 *
 */
public class CalendarDemo6 {

	public static void main(String[] args) {
		
		/**
		 * �鿴3��2����3���Ժ������죿
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		calendar.add(calendar.YEAR, 3); //����3��
		System.out.println(calendar.getTime());
		calendar.add(calendar.MONTH, 2); //����2����
		System.out.println(calendar.getTime());
		calendar.add(calendar.DAY_OF_YEAR, 3); //����3�졣�˴����ʹ��DAY_OF_YEAR
		System.out.println(calendar.getTime());
		
		
	}
}
