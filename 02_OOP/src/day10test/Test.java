package day10test;

//������
public class Test {

	public static void main(String[] args){
		
		T t = new T();
		System.out.println("����T��"+t);
		//�������ĳһ�ַ���
		Tetromino x = new Tetromino();
		x = randomOne();
		System.out.println("������飺"+x);
		//����
		x.moveLeft();
		System.out.println("���Ʋ�����"+x);
		//����
		x.drop();
		System.out.println("���������"+x);
		//����
		x.moveRight();
		System.out.println("���Ʋ�����"+x);
		
	}//main
	
	//�������ĳһ�ַ���
	public static Tetromino randomOne(){
		
		//�������0~6������
		int type = (int)(Math.random()*7);
		//һһ��Ӧ��������
		switch(type){
		case 0:
			return new T();
		case 1:
			return new I();
		case 2:
			return new S();
		case 3:
			return new Z();
		case 4:
			return new J();
		case 5:
			return new O();
		case 6:
			return new L();
		}
		return null;
	}
	
	
}
