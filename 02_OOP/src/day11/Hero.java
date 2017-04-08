package day11;
//英雄机类
public class Hero extends FlyingObject{

	//构造方法
	public Hero(){
		super(); //可不写
		w = 97;
		h = 124;
		x = (480-w)/2;
		y = 500;
	}
	//子弹射击方法
	public Bullet shoot(){
		//根据飞机的位置计算出子弹的位置，创建新的子弹对象，返回子弹对象
		//      英雄机x   英雄机w   子弹w
		int x = this.x+this.w/2-8/2;
		//       英雄机y  子弹y
		int y = this.y-14;
		return new Bullet(x,y);
	}
	//重写父类move方法---取消移动功能
	public void move(){}
	/*
	 * 父类move方法---实现随鼠标移动
	 * 此处不是重载父类中的move方法
	 */
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	

}
