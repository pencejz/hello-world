package day10extends;
/**
 * 方块子类
 * T类就继承了Tetromino中申明的属性和方法
 */
//T型方块子类
public class T extends Tetromino{
	//构造方法
	public T(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,4);
	}
}
//O型方块子类
class O extends Tetromino {
	//构造方法
	public O(){
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,5);
		cells[2] = new Cell(1,4);
		cells[3] = new Cell(1,5);
	}
}
//S型方块子类
class S extends Tetromino{
	//构造方法
	public S(){
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,5);
		cells[2] = new Cell(1,3);
		cells[3] = new Cell(1,4);
	}
}
//Z型方块子类
class Z extends Tetromino{
	//构造方法
	public Z(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(1,4);
		cells[3] = new Cell(1,5);
	}
}
//I型方块子类
class I extends Tetromino{
	//构造方法
	public I(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(0,6);
	}
}
//L型方块子类
class L extends Tetromino{
	//构造方法
	public L(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,3);
	}
}
//J型方块子类
class J extends Tetromino{
	//构造方法
	public J(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,5);
	}
}