package day14;
//�����ڲ���
public class NoInner {

	public static void main(String[] args) {
		/**
		 * �����ڲ���
		 * 1.�����и���
		 * 2.�����ڲ��������������ͬʱ�������������
		 * 3.�﷨��࣬ʹ�÷�����
		 *    new ������()  {};
		 *     ���ù��췽��       ��������
		 * 4.���ڼ��ļ̳г����࣬����ʵ�ֽӿ�
		 * 5.�����ڲ��๲���ⲿ�����еľֲ�����ʱ������ֲ���������Ϊfinal����
		 */
		final int a = 10;
		Yoo yoo = new Yoo(){}; //���������ڲ���---�õ����������������û������
		Yoo yoo1 = new Yoo(); //����Yoo����---�ĵ����Ǹ������
		Xoo xoo = new Xoo(){}; //���������ڲ���---�õ�����ʵ�������ʵ����û������
		
		Goo goo = new Goo(){
			public void test(){
				System.out.println("test, a="+a);
			}
		};
		goo.test();
	}//main
}
class Yoo{}
interface Xoo{}
interface Goo{
	void test();
}