package day09;
//���췽������
public class Demo5 {

	public static void main(String[] args) {
		
		//ʹ��new������ù��췽��
		Circle c1 = new Circle(3,3,2); //�����вι��췽��
		Circle c2 = new Circle(); //�����޲ι��췽��
		
		System.out.println("Բc1���꣺("+c1.x+","+c1.y+") "+"Բc1�뾶�� "+c1.r);
		System.out.println("Բc2���꣺("+c2.x+","+c2.y+") "+"Բc2�뾶�� "+c2.r);
		
	}//main

}


class Circle{
	int x; //Բ������(x,y)
	int y;
	int r; //�뾶
	//���幹�췽��
	public Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		//�˴�this.����ʡ��
	}
	//���ع��췽��---������λԲ
	public Circle(){
		//����һ��
//		x = 0;
//		y = 0;
//		r = 1;
		/*
		 * �ڹ��췽���ĵ�һ�е��õ�ǰ����������췽����ʹ������֮��ʵ�������ó�ʼ���߼�����
		 */
		//��������
		this(0,0,1);
	}
	
	
	
}