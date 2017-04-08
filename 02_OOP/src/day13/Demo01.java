package day13;

public class Demo01 {

	public static void main(String[] args) {
		
		//Super s = new Super(); //abstract���Ƹ��ഴ������
		Super s = new Sub();
		/**�ڶ����ȴ���һ�������Ͷ���(����2������x��y)��Ȼ�󻹻��ڴ���һ�������Ͷ���(����3������x,y,z)
		 * ��ʱ�ĸ����Ͷ���������������ڲ�������5������(������x,������y,������x,������y,������z)
		 * ����x,y��ֵ��������---������Ӧ��ע����⣬����˵�ڸ������ж������Ժ󣬲�Ҫ�����������ظ����� */
		//�����ͱ���s���ʸ���������x,y
		System.out.println(s.x+","+s.y); //3,4
		//�����ͱ���ss��������������x,y
		Sub ss = (Sub)s;
		System.out.println(ss.x+","+ss.y); //5,6
		int z = ((Sub)s).z;
		System.out.println(z); //7
		/**�����븸�����Ի򷽷�����ʱ��ʹ��super.(������/������)���ø��������Ի򷽷� */
		Sub1 sss= new Sub1();
		sss.testSu();
		//super�Է����Ĳ���
		s.test();

	}//main
}

abstract class Super{
	int x,y;
	public Super(){
		x=3; y=4;
	}
	public void test(){
		System.out.println("Super.test()");
	}
}

//Sub������
class Sub extends Super{
	int x, y, z;
	public Sub(){
		super();
		x=5; y=6; z=7;
	}
}
//Sub��ȷ����---ʹ��super.����
class Sub1 extends Super{
	int x, y, z;
	
	public Sub1(){
		super();
		x=5; y=6; z=7;	
	}
	public void test(){
		System.out.println("Sub1.test()");
	}
	//����super.
	public void testSu(){
		System.out.println("x = "+x);
		System.out.println("super.x = "+super.x);
	}
	
}

