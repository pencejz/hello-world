package day10extends;

public class Test {

	public static void main(String[] args) {
		//�̳в���
		T t = new T();
		System.out.println("t = "+t);
		t.drop();
		System.out.println("t = "+t);
		
		O o = new O();
		System.out.println("o = "+o);
		
		/**
		 * ���췽���ļ̳�
		 * 
		 * ִ�й��̣��������๹�췽��--->���ø��๹�췽��--->�������๹�췽��--->�������๹�췽��
		 */
		Goo g = new Goo();
		System.out.println("g.n = "+g.n);
		System.out.println("g.a = "+g.a);
		
		//�������ĳһ�ַ������
		Tetromino x = randomOne();
		System.out.println(x);
		
		
	}//main
	
	/**
	 * ����������ת��---�������ĳһ�ַ���
	 */
	public static Tetromino randomOne(){
		//��һ�����������0~6����������Ӧ���з���
		int type = (int)(Math.random()*7);
		switch(type){
		case 0:
			return new T();
		case 1:
			return new J();
		case 2:
			return new I();
		case 3:
			return new O();
		case 4:
			return new S();
		case 5:
			return new Z();
		case 6:
			return new L();
		}
		return null; //�������������⣬���ǲ��ᱻִ��
	}
	
}


class Foo{
	int n;
	//���췽��
	public Foo(){
		n = 6;
	}
}
class Goo extends Foo{
	int a;
	//���췽��
	public Goo(){
		/*
		 * �����๹�췽���У�super�������ø��๹�췽��
		 * ÿ��������ִ�й��췽��ǰ����������ִ�и���Ĺ��췽��
		 * ���������Զ����super��Ҳ���ֶ����
		 */
		super();
		a =5;
	}
}


/**
 * ���������û���޲ι��췽����������ͱ���ʹ��super���ø����вι��췽��
 * ����Ĭ�ϵ��õ��Ǹ����޲ι��췽��
 * 
 *������
 *
 *class Koo{
	int n;
	public Koo(int n){
		this.n = n;
	}
}
class Hoo extends Koo{
	
}
 *���������1.�ڸ���������޲ι��췽��
 *       2.��������ʹ��super�� super(1);
 *
 */



