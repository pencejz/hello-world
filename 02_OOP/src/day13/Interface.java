package day13;

public class Interface {

	public static void main(String[] args) {
		
		/**�ӿ��﷨��ʾ */
		Demo demo = new Demo();
		double p = demo.getPrice();
		System.out.println(p);
		//�ӿڿ����������ñ��������������Ͷ���
		Prodect x; //�ӿڿ��Զ������ñ���
		Prodect x1 = demo; //�ӿڶ�������ʵ����Ķ���
		face m = demo;
		//Prodect p = new Prodect();
		Prodect p1 = new Demo(); //�ӿڿ��Դ���ʵ�����͵Ķ��󣬵��ǲ��ܴ����ӿ����Ͷ���
	}//main
}
//ʵ�ֽӿڵ���Demo---��̳�
class Demo implements Prodect,face1{

	public double getPrice() {
		
		return 200;
	}

	public int getType() {
		// TODO Auto-generated method stub
		return BOMB;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return 1;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
}

/**
 * �ӿ�---���󷽷��ļ���
 * 1.�ڽӿ���ֻ�ܶ��峣���ͳ��󷽷�
 * 2.����ʡ�Թؼ���
 *    -��������ʡ��public static final
 *    -��������ʡ��public abstract
 * 3.�ӿڲ��ܴ�������
 * 4.�ӿڿ��Լ̳нӿ�
 * 5.�ӿ�ֻ����Ϊ�����ͣ�������ʵ��
 *    -�ӿ�ʵ���Ǽ̳й�ϵ
 *    -ʵ�ֽӿڹؼ���implements
 *    -ʵ�ֽӿڱ���ʵ�ֽӿ���ȫ���ĳ��󷽷�
 *    -һ���������ʵ�ֶ���ӿڣ��ͱ���ʵ�ֶ���ӿ���ȫ������
 * 6.�ӿڿ��Զ�����������������������ͷ���
 */
interface face{
	//���峣��
	public static final int DOUBLE_FIRE = 2;
	int LIFE = 1; //ʡ��public static final
	//������󷽷�
	public abstract int getType();
	int getScore(); //ʡ��public abstract
}
interface face1 extends face{ /**�ӿ�֮����Լ̳� */
	int BOMB = 3;
	int getSpeed();
}
interface Prodect{
	double getPrice();
}








