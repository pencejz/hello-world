package day03;
/**
 * calendar����ʱ��
 */
import java.util.Calendar;

/**
 * Calendar�ṩ��һ��������
 * void set(int field,int value)
 * ��Ը�����ʱ�����(ʱ�䵥λ)������������趨ֵ
 * ʱ�������һ��int�͵�ֵ�������ס��������֣���Ϊ����ʹ��Calendar�ĳ���
 * @author Administrator
 *
 */
public class CalendarDemo3 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		/*
		 * ����ʱ��Ϊ2008.08.08 20:08:08
		 */
		calendar.set(Calendar.YEAR, 2008);       //��
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH, 7);         //�£���һ�����Ǵ�0��ʼ����
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_MONTH, 8);  //���е�ĳһ��
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.HOUR, 8);          //ʱ(12Сʱ��)
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.HOUR_OF_DAY, 20);  //���е�ĳһСʱ(24Сʱ��)
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MINUTE, 8);        //��
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.SECOND, 8);        //��
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_YEAR, 100); //���е�ĳһ��
		System.out.println(calendar.getTime());
		
		
	}
	
	
	
}
