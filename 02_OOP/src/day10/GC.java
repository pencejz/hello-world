package day10;
//垃圾回收器
public class GC {

	public static void main(String[] args) {
		/**
		 * 创建100万个对象，并且及时释放对象的引用，因为有自动垃圾回收，对象及时回收，不会造成内存泄漏
		 */
//		int n = 1000000;
//		int i = 0;
//		for(;i<n;i++){
//			Cell c = new Cell(1,5);
//			c = null;
//		}
//		System.out.println(i);
		
		/**
		 * 创建多个Cell对象，将引用存储到引用数组中，每个对象都被引用，垃圾回收器将无法回收创建的对象
		 * 最后出现内存泄漏(堆内存溢出)
		 * 
		 * 内存泄漏：
		 * 1.java可能发生内存泄漏
		 *  -当程序“大量”创建对象，并且一直被引用，此时java垃圾将无法回收对象占用的内存空间造成内存泄漏
		 * 2.避免内存泄漏方法
		 *  -当对象使用以后，及时将引用赋值null，使得对象成为不被引用的垃圾对象， 垃圾回收器将会正常回收垃圾
		 */
		int n = 1000000000; //10亿
		int i = 0;
		Cell[] cells = new Cell[n];
		for(;i<n;i++){
			Cell c = new Cell(1,5);
			cells[i] = c; //将对象的引用存储到引用数组cells中，对象将一直被引用
			c = null;
		}
		System.out.println(i);		
		
	}

}
