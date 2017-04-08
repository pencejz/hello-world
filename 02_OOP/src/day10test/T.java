package day10test;
//方块类型子类

//T型子类
class T extends Tetromino{

	//构造方法
	public T(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,4);
	}
}
//O型子类
class O extends Tetromino{

	//构造方法
	public O(){
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,5);
		cells[2] = new Cell(1,4);
		cells[3] = new Cell(1,5);
	}
}
//J型子类
class J extends Tetromino{

	//构造方法
	public J(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,5);
	}
}
//L型子类
class L extends Tetromino{

	//构造方法
	public L(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(1,3);
	}
}
//I型子类
class I extends Tetromino{

	//构造方法
	public I(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(0,6);
	}
}
//S型子类
class S extends Tetromino{

	//构造方法
	public S(){
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,5);
		cells[2] = new Cell(1,5);
		cells[3] = new Cell(1,6);
	}
}
//Z型子类
class Z extends Tetromino{

	//构造方法
	public Z(){
		cells[0] = new Cell(0,3);
		cells[1] = new Cell(0,4);
		cells[2] = new Cell(1,4);
		cells[3] = new Cell(1,5);
	}
}