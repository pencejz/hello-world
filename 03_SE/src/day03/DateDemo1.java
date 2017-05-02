package day03;

import java.util.Date;

/**
 * java.util.Date 时间类
 * Data类的每一个实例用于表示一个确定的时间点
 * 其内部维持一个long值，表示从1970年元旦到该对象表示的时间之间所经历的毫秒值。
 * 由于Date类设计存在不足，所以大部分操作时间的方法都被标记为过时的，意思是不要再使用该方法来开发程序
 * 因此，使用Date类仅用于表示一个时间
 * @author Administrator
 *
 */
public class DateDemo1 {
	
	public static void main(String[] args) {
		//显示当前系统时间
		Date date = new Date();
		System.out.println(date); //默认值即为当前系统时间
		//date.getYear(); //Date类的大部分方法是过时的，存在问题，开发时不建议使用
		
		/**
		 * long getTime()
		 * 获取当前Date内部维持的long值
		 * 获得从1970年元旦到当前date对象表示的时间的毫秒值
		 */
		//得到当前系统的毫秒值
		long time = date.getTime();
//		等同于long time = System.currentTimeMillis();
		System.out.println(time);
		
		//计算明天这个时刻
		time = time+1000*60*60*24; //给定一个毫秒值(一天的毫秒长度)
		/**
		 * void setTime(long time)
		 * 使当前Date表示给定的long值所表示的时间
		 * 得到从1970年起的time毫秒之后的日期
		 */
		date.setTime(time); //date.setTime(time)的值就是date的值，即表示一个日期
		System.out.println(date);

		
		
	}
	
}
