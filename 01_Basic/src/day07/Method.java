package day07;
import java.math.BigDecimal;
import java.util.Arrays;
//����
public class Method {

	public static void main(String[] args) {
		/**
		 * ��ʾ������ʹ��
		 */
		//���ã�invoke���������ظ�ʹ�÷���---n��������Ҫ����
		double n = sum(1,2); //�ɼ���int��---ϵͳ�Ὣint�Զ�תΪdouble
		//char n = sum(1,2); //������---��Ҫǿת
		System.out.println(n);
		
		/**
		 * main�����в��Ե���print(����)����
		 */
		
		int[] ary = {1,4,7,2,5,8,3,6,9};
		print(ary); //�������
		Arrays.sort(ary); //��������
		print(ary);
		
		/**
		 * ��������֮��ľ���
		 */
		distance(4,5,6,7);
		
	}//main
	/**
	 * ��������д�����У�����д�ڷ�����
	 * ����5Ҫ�أ�1.public static---���δ�
	 *         2.int---����ֵ���ͣ�������������
	 *         3.sum---������������������̵�ǰ������
	 *         4.(int n1,int n2)---����
	 *         5.{}---�����壬�Ƿ����ļ������
	 * �﷨Լ����������������˷���ֵ�����ڷ����б���ʹ��return������Ӧ�����͵�ֵ����Ϊ�����ķ��ؽ��
	 * ���´��룺������һ�����Է����ظ�ʹ�õļ�����̣�������������ƽ����
	 */
	public static int sum(int n1,int n2){
		//��n1��n2������ƽ���ͣ�����ƽ������Ϊ���
		int y = n1 * n1 + n2 * n2;
		System.out.println(y);
		return y;
	}
	
	/**
	 * �����ķ���ֵ
	 * 1.����ֵ��ʾ�����ļ�����
	 * 2.һ������û�м���������Ҫ�����޷���ֵvoid���͵ķ���
	 * 3.һ���������û�з���ֵ��Ҳ����ʹ��return��������������
	 * 
	 * ʵ�ִ�ӡһ���������ݵ�һ������
	 */
	public static void print(int[] ary){
		//�������У������㷨��ӡ�������ݵ�����̨��
		for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * ��������֮��ľ���
	 * ��1(x1,y1)
	 * ��2(x2,y2)
	 */
	public static double distance(double x1,double y1,double x2,double y2){
		//double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		double d = Math.sqrt(sum((x1-x2),(y1-y2))); //��������sum����
		//������λ���
		BigDecimal b = new BigDecimal(d);
		double d1 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("����d = "+d1);
		return d1;
	}
	//����sum����---����ǩ����ͬ(���������͡������ĸ���)
	public static double sum(double n1,double n2){
		//��n1��n2������ƽ���ͣ�����ƽ������Ϊ���
		double y = n1 * n1 + n2 * n2;
		System.out.println(y);
		return y;
	}
}//class
