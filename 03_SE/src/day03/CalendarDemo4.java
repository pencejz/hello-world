package day03;

import java.util.Calendar;

/**
 * ��ȡ��ǰCalendar��ʾ�����ں�ָ��ʱ���������Ӧ��ֵ
 * @author Administrator
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		/**
		 * int get(int field)
		 * ��ȡָ��ʱ�������Ӧ��ֵ
		 */
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1; //��һ�´�0��ʼ��
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		//�鿴�������ܼ�
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		//ע�⣺һ���еĵ�һ��Ϊ������
		String[] ary = new String[]{"��","һ","��","��","��","��","��"};
		System.out.println("����������"+ary[weekDay-1]);
		System.out.println(ary.length);
		//�鿴�����ǽ���ĵڼ���
		int yearDay = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+yearDay+"��");
		
		
		
		
		
	}
	
	
	
}





