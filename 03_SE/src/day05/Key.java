package day05;
/**
 * �����Ƕ����һ����Ҫ��ΪHashMap��keyʱ�����������дequals��������Ӧ����ͬ��дhashcode����
 * ��Ϊ�����������ķ���ֱֵ��Ӱ��ɢ�б������
 * API�ĵ�����������������д����Ҫ��
 * 1.��������дequals����ʱ����Ҫ��дhashcode����
 * 2.hashcodeӦ����equals��һ���ԣ�����
 *   ����������equals�Ƚ�Ϊtrue����ôhashcodeֵӦ�����
 *   ��������Ȼû��ǿ��Ҫ�󣬵��Ǿ�����֤����hashcodeֵһ��
 *   ��ôequals�ȽϾ���Ϊtrue������Ϊtrue����hashMap�оͻ��������Ӱ���ѯ����
 * 3.hashcodeֵӦ����һ���ȶ�ֵ������
 * �ڲ���equals�Ƚϵ����Ե�ֵû�з����ı������¶�ε���hashcode�������ص�ֵӦ����ͬ
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
