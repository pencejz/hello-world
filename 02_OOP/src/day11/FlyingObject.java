package day11;

import java.util.Random;

/**
 * �����︸��
 */
public class FlyingObject {

	//��������
	int x, y, w, h; //����������x�������� ����y�� ��������w�� ������߶�y
	//�޲ι��췽��---�ӵ���Ӣ�ۻ�����
	public FlyingObject(){}
	//�вι��췽��---С�ɻ�����ɻ����۷����
	public FlyingObject(int w,int h){
		this.w = w;
		this.h = h;
		Random random = new Random();
		x = random.nextInt(480-w); //�趨��Ļ���Ϊ480
		y = -h;
	}
	
	//�����ƶ�����
	public void move(){
		y++;
	}
	
	//�������
	public String toString(){
		return "���꣺("+x+","+y+")"+",��ȣ�"+w+",�߶�"+h;
	}
}
