package summary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class day03_时间 {

	public static void main(String[] args) throws ParseException {
		/**
		 * Date类中
		 * long getTime() 获得当前对象表示时间的毫秒值
		 * void setTime(long time) 将给定的一个毫秒值转化为日期
		 */
		System.out.println("---------Date---------");
		//显示当前系统时间(Date的默认时间就是当前系统时间)
		Date date = new Date();
		System.out.println("当前系统时间："+date);
//		System.out.println(new Date()); //以上两句可以缩写为本句
		//获得当前系统的毫秒值
		long time = date.getTime();
//		long time = System.currentTimeMillis(); //等同于上一句
		System.out.println("当前系统的毫秒值："+time);
		/*计算明天这一时刻*/
		time = time + 24*60*60*1000; //计算明天这一时刻的毫秒值
		//将毫秒值转换为默认时间格式
		date.setTime(time);
		System.out.println("明天这一时刻："+date);
		/**
		 * Calendar类中
		 * Date getTime() 将Calendar类转化为Date类
		 * long getTimeInMillis() 获得当前对象表示时间的毫秒值
		 * void setTime(Date date) 将Date类转化为Calendar
		 * int get(int feild) 获得指定时间分量
		 * void set(int feild, int value) 设置指定时间分量
		 * void add(int field,int value) 是当前Calendar加上指定时间分量所对应的值，以表示该日期。若指定的值为负数，则视为减法
		 */
		System.out.println("---------Calendar---------");
		//使用Calendar获取当前时间
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar); //toString方法不能直观反映要表示的日期
		Date date2 = calendar.getTime(); //Calendar类--->Date类
		System.out.println("当前系统时间："+date2);
		calendar.setTime(date2); //Date类--->Calendar类
		System.out.println(date2);
		//获得当前指定时间分量
		System.out.println(calendar.get(Calendar.YEAR)); //年
		System.out.println(calendar.get(Calendar.MONTH)+1); //月(第一个月从0开始)
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); //一年中的某一天
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //一月中的某一天
		System.out.println("DAY_OF_WEEK:"+(calendar.get(Calendar.DAY_OF_WEEK)-1));//一周中的某一天(计算机系统时间是从星期日开始的)
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //今天实在本月的第几周
		System.out.println(calendar.get(Calendar.HOUR)); //时
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); //一天中的某一小时
		System.out.println(calendar.get(Calendar.MINUTE)); //分
		System.out.println(calendar.get(Calendar.SECOND)); //秒
		//设置时间
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.HOUR, 26);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.HOUR_OF_DAY, 30);
		System.out.println(calendar.getTime());
		//获取某个时间分量允许的最大值
		int yearDay = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(yearDay);
		int monthDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(monthDay);
		//查看2年3个月2天后是哪一天
		calendar = Calendar.getInstance();
		System.out.println("当前系统时间："+calendar.getTime());
		System.out.println("当前系统毫秒值："+calendar.getTimeInMillis());
		calendar.add(Calendar.YEAR, 2);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH, 3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_YEAR, 2); //此处最好用DAY_OF_YEAR
		System.out.println(calendar.getTime());
		/**
		 * SimpleDateFormat类
		 * String format(Date date)  将Date类型转换为String类型
		 * Date parse(String str)  将String类型转换为Date类
		 */
		System.out.println("---------SimpleDateFormat---------");
		//Date转换成String
//		Date date1 = new Date();
//		System.out.println("当前系统时间："+date1);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//		String str = sdf.format(date1);
//		String str = (new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date()));
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));//等同于以上5句
		//String转换成Date
//		String str1 = "2008/8/8 08:08:08";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date3 = sdf.parse(str1);
//		System.out.println(date3);
		System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").parse("2008年8月8日 08:08:08"));
		/**
		 * Collection接口中
		 * boolean add(E e) 向集合添加元素
		 * boolean int size() 查询集合中的元素个数
		 * boolean isEmpty() 判断集合是否为空
		 * boolean contains(E e) 判断集合是否包含给定元素
		 * void clear() 清空集合
		 */
		System.out.println("---------Cooection---------");
		Collection<String> c1 = new ArrayList<String>();
		//向集合c1中添加元素
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("four");
		System.out.println("c1 = "+c1);
		//查询集合c1中的元素个数
		System.out.println("c1中的元素个数："+c1.size());
		//判断c1是否为空
		System.out.println("c1是否为空："+c1.isEmpty());
		//判断c1是否包含元素“four”
		System.out.println("c1是否包含元素“four”:"+c1.contains("four"));
		//清空集合c1
		c1.clear();
		System.out.println("c1是否为空："+c1.isEmpty()+"，集合c1已经清空了！");
		
		
		
		
	}//main
	
}



