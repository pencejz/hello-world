package day03;
//Date��Calendar�Ļ�ת

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * �����ࡣ���ڶ�ʱ��Ĳ������ṩ�˷ḻ�Ĳ���ʱ�����ط���
 * ��������һ�������࣬���õ�ʵ���ࣺGregorianCalendar����Ϊ��������
 * Calendar�ṩ�˸���̬����getInstance����ȡһ����ǰϵͳ���ڵ������õ�Calendarʵ����ʵ��
 * ͨ�����ؾ���GregorianCalendar
 */
public class CalendarDemo2 {
	
	public static void main(String[] args) {
		//��ȡ��ǰϵͳʱ��
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString��������ֱ�۵ķ�ӳ����ʾ������
		 */
		System.out.println(calendar);
		/**
		 * Date getTime()
		 * Calendar--->Date
		 * Calendar�ṩ�˸÷������Է���һ��Date����ʵ��
		 * ��ʵ����ʾ�����ھ��ǵ�ǰCalendar��ʾ������
		 * �÷���Ҳ���Կ����Ǵ�Calendar��ת����Date�������
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		//������һ��
		date.setTime(date.getTime()+1000*24*60*60);
		System.out.println("date��ʾ��"+date);
		/**
		 * void setTime(Date date)
		 * Calendar�ṩ�˸÷��������õ�ǰCalendar��ʾ������Date����ʾ������
		 * Date--->Calendar�Ĺ���
		 */
		calendar.setTime(date);
		System.out.println("calendar��ʾ��"+date);
		
	}
	
}















