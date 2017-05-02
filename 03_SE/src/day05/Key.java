package day05;
/**
 * 当我们定义的一个类要作为HashMap的key时，这个类若重写equals方法，就应当连同重写hashcode方法
 * 因为这两个方法的返回值直接影响散列表的性能
 * API文档对这两个方法的重写做出要求：
 * 1.当我们重写equals方法时，就要重写hashcode方法
 * 2.hashcode应当与equals有一致性，即：
 *   两个对象若equals比较为true，那么hashcode值应当相等
 *   反过来虽然没有强制要求，但是尽量保证两个hashcode值一样
 *   那么equals比较尽量为true，若不为true，在hashMap中就会产生链表，影响查询性能
 * 3.hashcode值应当是一个稳定值，即：
 * 在参与equals比较的属性的值没有发生改变的情况下多次调用hashcode方法返回的值应当相同
 * @author Administrator
 *
 */
public class Key {

	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
