package day13interface;

public class Airplane2 extends FlyingObject implements Enemy,Award{

	public Airplane2(){
		super(39,49);
	}
	
	public void move(){
		y+=2;
	}
	
	public int getAward() {
		// TODO Auto-generated method stub
		return DOUBLE_FIRE;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return 2;
	}

	public String toString(){
		return "Airplane2";
	}
}
