package day06;
/**�������*/
import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		/**
		 * ��������1---ʹ�ó��ȴ�������(��֪��Ԫ�س�ʼֵ��Ԫ�ظ����϶�ʱʹ��)
		 * ֱ������һ������ʱ���������һ�����鳤��
		 * ʹ���±�(��������ţ�index)����ÿ��Ԫ��
		 * ÿ��Ԫ�ص�Ĭ��ֵ��0
		 */
		System.out.println("---------��������-----------");
		//ary������10��int�͵ı���
		int[] ary = new int[10];
		int n = ary[0];
		System.out.println("ary["+n+"]="+n);//���ֵ��Ϊ0
		/**
		 * ��������2---ʹ��Ԫ�ش�������(�Ѿ�֪��Ԫ�صĳ�ʼֵ��Ԫ�صĸ�������ʱʹ��)
		 * ����������ͬʱֱ��ʹ��Ԫ�س�ʼ��
		 * ע�⣺����ֱ�Ӹ������鳤�ȣ���Ϊ��ʼ��ʱ��������Ԫ�صĸ������ʹ��������鳤��
		 */
		//int[] ary2 = new int[]{3,4,0,9,7,8};
		int[] ary2 = {3,4,0,9,7,8};
		System.out.println("ary2["+0+"]="+ary2[0]); //3
		//�˴�����ʹ�ü򻯰棺int[] ary2 = {3,4,0,9,7,8};
		
		int[] ary3;
		ary3 = new int[]{1,2,3}; //��ȷ
		//ary3 = {1,2,3}; //�������
		//�˴�����ʹ�ü򻯰�		
		/**�򻯰�
		 * 1.�򻯰�ֻ��ʹ��������������ͬʱ��ʼ���������
		 * 2.��������������κ������
		 */
		
		/**
		 * �������Ͳ���
		 */
		double[] ary4 = new double[4];
		System.out.println("ary4[0]="+ary4[0]); //0.0
		
		boolean[] ary5 = new boolean[10];
		System.out.println("ary5[5]="+ary5[5]); //false
		
		byte[] ary6 = new byte[10];
		System.out.println("ary6[2]="+ary6[2]); //0
		
		char[] ary7 = new char[5];
		System.out.println("ary7[0]="+ary7[0]); //�ַ���Ĭ��ֵ�ǿո�
		/*
		 * �ַ�����Ԫ���Զ���ʼ��λ ���Ϊ0���ַ���
		 * ���Ϊ0����һ������Ŀ����ַ�����ӡ���ɼ�����ʾ�ַ����Ľ������
		 * ����������ַ�����linux����ϵͳ�У�linuxϵͳ��Ϊ��������������ַ��������
		 * �����ǿתΪint�����
		 */
		
		/**ʹ��length���Ի�ȡ���鳤��*/
		System.out.println("ary7�����鳤��Ϊ��"+ary7.length);
		/**ʹ�����鳤�ȱ���ÿһ��Ԫ��*/
		//������ÿ��Ԫ�ظ�ֵΪ100
		for(int i=0;i<ary7.length;i++){
			ary7[i] = 100;
			System.out.print("ary7["+i+"]="+(int)ary7[i]+" ");	
		}
		System.out.println();
		//�������10000��1~100֮���������
		int[] rad = new int[10000];
		Random random = new Random();
		for(int i=0;i<rad.length;i++){
			rad[i] = random.nextInt(100)+1;
			//rad[i] = (int)Math.random()*100+1;
		}
		//����rad��ƽ����
		int sum = 0;
		for(int i=0;i<rad.length;i++){
			sum += rad[i];
		}
		double avg = (double)sum/rad.length;
		System.out.println("�����������rad��ƽ�����ǣ� "+avg);
		
		/**
		 * �������
		 */
		System.out.println("------------�������----------------");
		int[] ary8 = {1,4,7,2,5,8};
		//1.�����˳�����
		System.out.print("�����˳�����Ϊ��");
		for(int i=0;i<ary8.length;i++){
			System.out.print(ary8[i]+" ");
		}
		System.out.println();
		//2.������������
		System.out.print("������������Ϊ��");
		for(int i=ary8.length-1;i>=0;i--){
			System.out.print(ary8[i]+" ");
		}
		System.out.println();
		
		/**������ary8�����ݣ�1,4,7,2,5,8,���������*/
		//��������
		System.out.println("---------���鵹�����----------");
		System.out.print("����ary8����Ϊ��");
		for(int i=0;i<ary8.length/2;i++){
			int t = ary8[i];
			ary8[i] = ary8[ary8.length-1-i];
			ary8[ary8.length-1-i] = t;
		}
		//�������
		for(int i=0;i<ary8.length;i++){
			System.out.print(ary8[i]+" ");
		}
		System.out.println();
		
		/**
		 * �ҳ�����ary8�е����ֵ
		 */
		int max = ary8[0];
		for(int i=0;i<ary8.length;i++){
			if(max<ary8[i]){
				max = ary8[i];
			}
		}
		System.out.println("ary8�е����ֵ��"+max);
		System.out.println();
		
		/**
		 * ���鸴��һ��system.arraycopy(Դ���飬Դλ�ã�Ŀ�����飬Ŀ��λ�ã����Ƶĸ���)����
		 */
		System.out.println("----------����ĸ���------------");
		//��a1���Ƶ�a0��
		int[] a1 = {1,1,1,1,1,1};
		int[] a0 = {0,0,0,0,0,0};
		System.arraycopy(a1,0,a0,0,a1.length);
		System.out.print("���ƺ��a0Ϊ��");
		for(int i=0;i<a1.length;i++){
			System.out.print(a0[i]+" ");
		}
		System.out.println();
		//��a2�ģ�20,30,40�����Ƶ�a3�е��������λ��
		int[] a2 = {10,20,30,40,50};
		int[] a3 = new int[6];
		System.arraycopy(a2, 1, a3, 2, 3);
		System.out.println("���ƺ��a3Ϊ��"+Arrays.toString(a3));
		
		/**
		 * ���鸴�ƶ���Arryays.copyOf(Դ���飬�����鳤��)����---����ԭ����ĸ���
		 * ʵ�����鳤�ȱ仯
		 * Arrays.toString(a):�������е�Ԫ���붺�������ӳ�һ���ַ��������
		 */
		int[] a4 = {10,20,30,40,50}; //Դ����
		//�������a4
		System.out.println("a4="+Arrays.toString(a4));
		//����ԭ����ĸ���
		int[] a5 = Arrays.copyOf(a4, 7); //�����鳤��>Դ����---����
		System.out.println("����a5= "+Arrays.toString(a5));
		int[] a6 = Arrays.copyOf(a4, 3); //�����鳤��<Դ����---����
		System.out.println("����a6= "+Arrays.toString(a6));
		int[] a7 = Arrays.copyOf(a4, 5); //�����鳤��==Դ����
		System.out.println("����a7= "+Arrays.toString(a7));
		/*
		 * a4����1��Ԫ��
		 * ��a4����Ϊ�����飬Դ���齫������
		 */
		a4 = Arrays.copyOf(a4, a4.length+1);
		System.out.println("���ݺ�a4= "+Arrays.toString(a4));
		//��100׷�ӵ�����a4�����
		a4[a4.length-1] = 100; 
		System.out.println("׷��100���a4= "+Arrays.toString(a4));
		//ɾ�����һ��Ԫ��100
		a4 = Arrays.copyOf(a4, a4.length-1);
		System.out.println("����100���a4= "+Arrays.toString(a4));
		
		
		
	}//main

}//class
