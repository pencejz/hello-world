package day13interface;
/**
 * С�ɻ��Ƿ����С�ɻ��ǵ���(��������з���)
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
