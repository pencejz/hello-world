package day13interface;
/**
 * 小飞机是飞行物，小飞机是敌人(打掉敌人有分数)
 */
public class Airplane extends FlyingObject implements Enemy{

	public Airplane() {
		super(39, 49);
	}
	
	public void move(){
		y+=2;
	}
	public int getScore() {
		// TODO Auto-generated method stub
		return 1;
	}
	

	public String toString(){
		return "Airplane";
	}

}
