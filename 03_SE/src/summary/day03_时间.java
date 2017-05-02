package summary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class day03_ʱ�� {

	public static void main(String[] args) throws ParseException {
		/**
		 * Date����
		 * long getTime() ��õ�ǰ�����ʾʱ��ĺ���ֵ
		 * void setTime(long time) ��������һ������ֵת��Ϊ����
		 */
		System.out.println("---------Date---------");
		//��ʾ��ǰϵͳʱ��(Date��Ĭ��ʱ����ǵ�ǰϵͳʱ��)
		Date date = new Date();
		System.out.println("��ǰϵͳʱ�䣺"+date);
//		System.out.println(new Date()); //�������������дΪ����
		//��õ�ǰϵͳ�ĺ���ֵ
		long time = date.getTime();
//		long time = System.currentTimeMillis(); //��ͬ����һ��
		System.out.println("��ǰϵͳ�ĺ���ֵ��"+time);
		/*����������һʱ��*/
		time = time + 24*60*60*1000; //����������һʱ�̵ĺ���ֵ
		//������ֵת��ΪĬ��ʱ���ʽ
		date.setTime(time);
		System.out.println("������һʱ�̣�"+date);
		/**
		 * Calendar����
		 * Date getTime() ��Calendar��ת��ΪDate��
		 * long getTimeInMillis() ��õ�ǰ�����ʾʱ��ĺ���ֵ
		 * void setTime(Date date) ��Date��ת��ΪCalendar
		 * int get(int feild) ���ָ��ʱ�����
		 * void set(int feild, int value) ����ָ��ʱ�����
		 * void add(int field,int value) �ǵ�ǰCalendar����ָ��ʱ���������Ӧ��ֵ���Ա�ʾ�����ڡ���ָ����ֵΪ����������Ϊ����
		 */
		System.out.println("---------Calendar---------");
		//ʹ��Calendar��ȡ��ǰʱ��
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar); //toString��������ֱ�۷�ӳҪ��ʾ������
		Date date2 = calendar.getTime(); //Calendar��--->Date��
		System.out.println("��ǰϵͳʱ�䣺"+date2);
		calendar.setTime(date2); //Date��--->Calendar��
		System.out.println(date2);
		//��õ�ǰָ��ʱ�����
		System.out.println(calendar.get(Calendar.YEAR)); //��
		System.out.println(calendar.get(Calendar.MONTH)+1); //��(��һ���´�0��ʼ)
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); //һ���е�ĳһ��
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //һ���е�ĳһ��
		System.out.println("DAY_OF_WEEK:"+(calendar.get(Calendar.DAY_OF_WEEK)-1));//һ���е�ĳһ��(�����ϵͳʱ���Ǵ������տ�ʼ��)
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //����ʵ�ڱ��µĵڼ���
		System.out.println(calendar.get(Calendar.HOUR)); //ʱ
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); //һ���е�ĳһСʱ
		System.out.println(calendar.get(Calendar.MINUTE)); //��
		System.out.println(calendar.get(Calendar.SECOND)); //��
		//����ʱ��
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.HOUR, 26);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.HOUR_OF_DAY, 30);
		System.out.println(calendar.getTime());
		//��ȡĳ��ʱ�������������ֵ
		int yearDay = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(yearDay);
		int monthDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(monthDay);
		//�鿴2��3����2�������һ��
		calendar = Calendar.getInstance();
		System.out.println("��ǰϵͳʱ�䣺"+calendar.getTime());
		System.out.println("��ǰϵͳ����ֵ��"+calendar.getTimeInMillis());
		calendar.add(Calendar.YEAR, 2);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH, 3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_YEAR, 2); //�˴������DAY_OF_YEAR
		System.out.println(calendar.getTime());
		/**
		 * SimpleDateFormat��
		 * String format(Date date)  ��Date����ת��ΪString����
		 * Date parse(String str)  ��String����ת��ΪDate��
		 */
		System.out.println("---------SimpleDateFormat---------");
		//Dateת����String
//		Date date1 = new Date();
//		System.out.println("��ǰϵͳʱ�䣺"+date1);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//		String str = sdf.format(date1);
//		String str = (new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date()));
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));//��ͬ������5��
		//Stringת����Date
//		String str1 = "2008/8/8 08:08:08";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date3 = sdf.parse(str1);
//		System.out.println(date3);
		System.out.println(new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss").parse("2008��8��8�� 08:08:08"));
		/**
		 * Collection�ӿ���
		 * boolean add(E e) �򼯺����Ԫ��
		 * boolean int size() ��ѯ�����е�Ԫ�ظ���
		 * boolean isEmpty() �жϼ����Ƿ�Ϊ��
		 * boolean contains(E e) �жϼ����Ƿ��������Ԫ��
		 * void clear() ��ռ���
		 */
		System.out.println("---------Cooection---------");
		Collection<String> c1 = new ArrayList<String>();
		//�򼯺�c1�����Ԫ��
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("four");
		System.out.println("c1 = "+c1);
		//��ѯ����c1�е�Ԫ�ظ���
		System.out.println("c1�е�Ԫ�ظ�����"+c1.size());
		//�ж�c1�Ƿ�Ϊ��
		System.out.println("c1�Ƿ�Ϊ�գ�"+c1.isEmpty());
		//�ж�c1�Ƿ����Ԫ�ء�four��
		System.out.println("c1�Ƿ����Ԫ�ء�four��:"+c1.contains("four"));
		//��ռ���c1
		c1.clear();
		System.out.println("c1�Ƿ�Ϊ�գ�"+c1.isEmpty()+"������c1�Ѿ�����ˣ�");
		
		
		
		
	}//main
	
}



