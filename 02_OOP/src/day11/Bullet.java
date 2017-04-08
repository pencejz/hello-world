package day11;
//子弹类
public class Bullet extends FlyingObject{

	//构造方法
	public Bullet(int x,int y){
		super();
		this.x = x;
		this.y = y;
		this.w = 8;
		this.h = 14;
	}
	
	//重写父类中move方法---子弹向上飞
	public void move(){
		y--;
	}
}
