package day12;

public class Final {

	public static void main(String[] args) {
		/**final���α���---��ʼ��֮�󲻿��ٸı�*/
		final int a;
		a = 10; //��ʼ��
		//a = 15; //�������final���α��������ٴθ�ֵ
		
		final int[] ary = {3,4,5};
		//ary[0] = null; //�����ٴθı�
		ary[0] = 5;
		System.out.println(ary[0]); //5
		/* ���ɸı�������ù�ϵ(���õ�������Ԫ�صĵ�ַӳ��)����������Ԫ�ص�ֵ�ǿ��Ըı��*/
		
		//final�������
		String s = f(3,4);
		System.out.println(s);
		
		/* final�����Ա����
		 * final���ε����ԣ�����ʵ��������ÿһ����������
		 * static���γ�Ա�������ǡ�һ�ݡ��ı��������ж�����һ�� */
		Roo r1 = new Roo(4);
		r1.a = 1;
		Roo r2 = new Roo(5);
		//r2.b = 3; //�������
		System.out.println(r1.b+","+r2.b);
		
		/* static final == final static �ɶ���Ϊ����
		 * ����������ͬʱ�����ʼ�����Ҳ��ɱ�����
		 * �����������java�������ڱ����ڼ佫����PI�����滻Ϊ3.14
		 * ��ʱ�������ڼ���������K�࣬Ҳ�����в������3.14 */
		System.out.println(K.PI);
		K k = new K();
		
		//final���η���---���ɱ���д
		
		//final������---���ɱ��̳�
		
		
	}//main
	
	//final�������
	public static String f(final int a,int b){
		//a = 1; //�������---�ڲ�������÷���ʱ���Ѿ���һ�γ�ʼ��
		b = 2;
		return a+","+b;
	}
	
}
//final�����Ա����
class Roo{
	int a;
	final int b;
	public Roo(int b){
		this.b = b;
	}
}
//��������
class K{
	public static final double PI = 3.14;
	static{
		System.out.println("����K");
	}
}

//final���η���---���ɱ���д
class A{
	final public void a1(){}
	public void a2(){}
}
class B extends A{
	//public void a1(){} //�������
	public void a2(){}
}

/* final������---���ɱ��̳�
 * JDK��һЩ�������ʹ�ã����磺Math String Double Integer�� */
final class C{}
//class D extends C{} //�������








