package day10extends;
/**
 * ��������
 * T��ͼ̳���Tetromino�����������Ժͷ���
 */
//T�ͷ�������
public class T extends Tetromino{
	//���췽��
	public T(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,4);
	}
}
//O�ͷ�������
class O extends Tetromino {
	//���췽��
	public O(){
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,5);
		cells[2] = new Cell(1,4);
		cells[3] = new Cell(1,5);
	}
}
//S�ͷ�������
class S extends Tetromino{
	//���췽��
	public S(){
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,5);
		cells[2] = new Cell(1,3);
		cells[3] = new Cell(1,4);
	}
}
//Z�ͷ�������
class Z extends Tetromino{
	//���췽��
	public Z(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(1,4);
		cells[3] = new Cell(1,5);
	}
}
//I�ͷ�������
class I extends Tetromino{
	//���췽��
	public I(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(0,6);
	}
}
//L�ͷ�������
class L extends Tetromino{
	//���췽��
	public L(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,3);
	}
}
//J�ͷ�������
class J extends Tetromino{
	//���췽��
	public J(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,5);
	}
}