package day03;

import java.util.Date;

/**
 * java.util.Date ʱ����
 * Data���ÿһ��ʵ�����ڱ�ʾһ��ȷ����ʱ���
 * ���ڲ�ά��һ��longֵ����ʾ��1970��Ԫ�����ö����ʾ��ʱ��֮���������ĺ���ֵ��
 * ����Date����ƴ��ڲ��㣬���Դ󲿷ֲ���ʱ��ķ����������Ϊ��ʱ�ģ���˼�ǲ�Ҫ��ʹ�ø÷�������������
 * ��ˣ�ʹ��Date������ڱ�ʾһ��ʱ��
 * @author Administrator
 *
 */
public class DateDemo1 {
	
	public static void main(String[] args) {
		//��ʾ��ǰϵͳʱ��
		Date date = new Date();
		System.out.println(date); //Ĭ��ֵ��Ϊ��ǰϵͳʱ��
		//date.getYear(); //Date��Ĵ󲿷ַ����ǹ�ʱ�ģ��������⣬����ʱ������ʹ��
		
		/**
		 * long getTime()
		 * ��ȡ��ǰDate�ڲ�ά�ֵ�longֵ
		 * ��ô�1970��Ԫ������ǰdate�����ʾ��ʱ��ĺ���ֵ
		 */
		//�õ���ǰϵͳ�ĺ���ֵ
		long time = date.getTime();
//		��ͬ��long time = System.currentTimeMillis();
		System.out.println(time);
		
		//�����������ʱ��
		time = time+1000*60*60*24; //����һ������ֵ(һ��ĺ��볤��)
		/**
		 * void setTime(long time)
		 * ʹ��ǰDate��ʾ������longֵ����ʾ��ʱ��
		 * �õ���1970�����time����֮�������
		 */
		date.setTime(time); //date.setTime(time)��ֵ����date��ֵ������ʾһ������
		System.out.println(date);

		
		
	}
	
}
