package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {
		/**
		 * Ҫ���û������Լ������գ�1992-08-05
		 * ���������Ϊֹ���˶����죿
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������(yyyy-MM-dd)");
		String str = scan.nextLine();
		//�������ڸ�ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//���ո�ʽ�õ���������(String--->Date)
		Date date = sdf.parse(str);
		System.out.println(date);
		//��1970�굽���յĺ�����
		long birthTime = date.getTime(); //��1970��Ԫ����ĳһ���ڵ�ʱ���ת��Ϊ������
		//��ȡ��1970��Ԫ������ǰʱ��ĺ�����
		long nowTime = System.currentTimeMillis();
		//�õ�����
		long days = (nowTime-birthTime)/1000/60/60/24;
		System.out.println("��ϲ�㣡�����죬���Ѿ��ڵ�����ƽ���Ķȹ���"+days+"��!");
		
		
		//��1970��Ԫ���𣬵����պ�10000����ܺ���ֵ
		long futureTime = birthTime+(long)10000*24*60*60*1000;
		//�����տ�ʼ10000���Ժ������
		date.setTime(futureTime); //��1970��Ԫ����ĳһʱ�̵ĺ�����ת��Ϊ����
		//�������ڸ�ʽ
		sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//���ո�ʽ�õ���������(Date--->String)
		str = sdf.format(date);
		System.out.println("���10000�������Ϊ��"+str);
		scan.close();
		

	}
	
	/**
	 * �û�����һ����Ʒ����������(2014-06-24)�ͱ����ڵ�����(100)
	 * ������Ʒ�Ĵ�����
	 * ���򣺸���Ʒ�����յ�ǰ���ܵ�����
	 */

}
