package day11;

public class TestPlane {

	public static void main(String[] args) {
		//����С�ɻ�
		Airplane a1 = new Airplane();
		System.out.println("С�ɻ�"+a1);
		//�ɻ������ƶ�---���ø���move����
		a1.move();
		System.out.println("�ƶ���С�ɻ�"+a1);
		//����Ӣ�ۻ�
		Hero h1 = new Hero();
		System.out.println("Ӣ�ۻ�"+h1);
		//�����۷�
		Bee b1 = new Bee();
		System.out.println("�۷�"+b1);
		//������ɻ�
		Bigplane ba1 = new Bigplane();
		System.out.println("��ɻ�"+ba1);
		//�����ӵ�
		Bullet bu1 = new Bullet(240,500);
		System.out.println("�ӵ�"+bu1);
		//�ӵ������ƶ��ƶ�---��д�ĸ���move����
		bu1.move();
		System.out.println("�ƶ�����ӵ�"+bu1);
		//����һ���ӵ�shoot()����
		bu1 = h1.shoot();
		System.out.println("shoot���������ӵ�"+bu1);
		/*
		 * ��������
		 * �ô������ַ�����Ķ��ֶ���
		 * �����ͱ������ɵ��������ͷ���---Bullet b=obj.shoot(); //�������
		 * ���������ǿ��ת��
		 */
		FlyingObject[] all = new FlyingObject[10];
		all[0] = new Airplane();
		FlyingObject obj = new Hero();
		
		Bullet bx = ((Hero)obj).shoot(); //ǿ��ת��
		System.out.println(bx);
		
		
		
	}

}
