package day13interface;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		//��շ���һȺ������
		FlyingObject[] sky = new FlyingObject[4];
		//�����ĸ�����ķ�����
		sky[0] = randomOne();
		sky[1] = randomOne();
		sky[2] = randomOne();
		sky[3] = randomOne();
		System.out.println(Arrays.toString(sky));
		//�����еķ������Ƕ��ֶ�����
		//ͳ�����������е��������е�����
		int sum = 0;
		int ss = 0;
		for(int i=0;i<sky.length;i++){
			if(sky[i] instanceof Enemy){
				int s = ((Enemy)sky[i]).getScore();
				sum++;
				ss+=s;
				
			}
		}
		System.out.println("����������"+sum);
		//ͳ�Ƶ����ܷ�
		System.out.println("�����ܷ֣�"+ss);
		//���������õĶ�������
		boolean b = sky[0] instanceof Bee;
		System.out.println(b);
		

	}
	//����ĳһ������ĵ��˵ķ���---������޹صĿ���ʹ��static
	public static FlyingObject randomOne(){
		Random random = new Random();
		int type = random.nextInt(5);
		switch(type){
		case 0: return new Bee();
		case 1:
		case 2:
		case 3: return new Airplane();
		case 4:	return new Airplane2();
		}
		return null;
	}
	
	
}
