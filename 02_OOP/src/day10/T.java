package day10;

import java.util.Arrays;

public class T {
	//����T�ͷ����������
	Cell[] cells = new Cell[4];
	//Cell[] cells; //һ�����ù��췽�����ͻ����ָ���쳣
	//���췽��
	public T(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,4);
	}
	
	//����ϵͳtoString����������������õ�ַ��Ϊ����
	public String toString(){
		//����Cell������д��toString����
//1		return cells[0].toString()+","+
//2		cells[1].toString()+","+		
//3		cells[2].toString()+","+
//4		cells[3].toString();
		return Arrays.toString(cells); //���� == 1234
	}
	//���䷽��
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//����
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	//����
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	
}
