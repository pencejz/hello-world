package day10;
/**
 * ������������
 */
import java.util.Arrays;

public class Demo_Cell {
	public static void main(String[] args){
		//Cell�����
		Cell[] ary= new Cell[4];
		System.out.println(Arrays.toString(ary));
		/*
		 * ���nullֵ���ᷢ����ָ���쳣
		 * ˵����1.���������д洢��Ԫ�����������ͱ���
		 *     2.Ԫ�ص�Ĭ��ֵΪnull
		 *     3.�����飬��Cell����
		 */
		//��ʼ������Ԫ��
		ary[0] = new Cell(0,3);
		ary[1] = new Cell(0,4);
		ary[2] = new Cell(0,5);
		ary[3] = new Cell(1,4);
		System.out.println("ary = "+Arrays.toString(ary));
		
		//T�ͷ��������
		T t = new T();
		System.out.println("T = "+t.toString());
		//ʡ����ʽ��System.out.println("T = "+t);
		t.drop();
		System.out.println("T = "+t);
	}
}
