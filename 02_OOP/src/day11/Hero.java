package day11;
//Ӣ�ۻ���
public class Hero extends FlyingObject{

	//���췽��
	public Hero(){
		super(); //�ɲ�д
		w = 97;
		h = 124;
		x = (480-w)/2;
		y = 500;
	}
	//�ӵ��������
	public Bullet shoot(){
		//���ݷɻ���λ�ü�����ӵ���λ�ã������µ��ӵ����󣬷����ӵ�����
		//      Ӣ�ۻ�x   Ӣ�ۻ�w   �ӵ�w
		int x = this.x+this.w/2-8/2;
		//       Ӣ�ۻ�y  �ӵ�y
		int y = this.y-14;
		return new Bullet(x,y);
	}
	//��д����move����---ȡ���ƶ�����
	public void move(){}
	/*
	 * ����move����---ʵ��������ƶ�
	 * �˴��������ظ����е�move����
	 */
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	

}
