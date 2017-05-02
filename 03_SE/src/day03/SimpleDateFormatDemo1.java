package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ������һ��ָ�������ڸ�ʽ��String��Date֮���໥ת��
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
		 * ��ָ�������ڸ�ʽ��������date����ʾ��ʱ��ת��ΪString��
		 * 2016-06-24 10:22:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		//ָ����ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//����ָ����ʽת��
		String str = sdf.format(date);
		System.out.println(str);
		/**
		 * String--->Date
		 * Date parse(String str)
		 */
		String str1 = "2008��08��08�� 20:08:08";
		//ָ����ʽ
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		//����ָ����ʽת��
		Date date1 = sdf1.parse(str1);
		System.out.println(date1);
		
		
		
	}//main
	
}







