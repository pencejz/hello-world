package day14;
//����ת��
public class Demo {

	public static void main(String[] args) {
		//1.������(�����ࡢ�ӿڸ���)����ı����������������������Ͷ���---��������(�����͸�ֵ��������)
		Koo k1 = new Koo();
		Foo f1 = new Foo();
		Super s1 = k1;
		s1 = f1;
		Free ff = f1;
		//2.ǿ��ת��---����ת��(�����͸�ֵ��������)
		Super ss1 = new Foo();
		Super ss2 = new Koo();
		Free ff1 = new Foo();
		//  ���������������ڼ�ʵ�ʶ�����Ŀ������
		Foo fx = (Foo)ss1;
		Koo kx = (Koo)ss2;
		Foo fy = (Foo)ff1;
		Free e = (Free)ss1;
		//  ����ʧ�ܣ������ڼ�ʵ�����õĶ�����Ŀ�����ͣ�����������쳣
		//Foo f3 = (Foo)ss2; //����java.lang.ClassCastException
		//Free ex = (Free)ss2;
		//3.����instanceofʵ�ְ�ȫ��ǿ������ת��---���жϣ���ת��
		if(ss1 instanceof Free){
			Free fk = (Free)ss1;
			fk.pay();
		}
		
	}//main
	
}
class Koo extends Super{
	
}
class Foo extends Super implements Free{
	public void pay() {
		System.out.println("pay");
	}
}
//����
class Super{
	public void test(){
		System.out.println("test");
	}
}
//�ӿ�
interface Free{
	void pay();
}