package day11;
//�ӵ���
public class Bullet extends FlyingObject{

	//���췽��
	public Bullet(int x,int y){
		super();
		this.x = x;
		this.y = y;
		this.w = 8;
		this.h = 14;
	}
	
	//��д������move����---�ӵ����Ϸ�
	public void move(){
		y--;
	}
}
