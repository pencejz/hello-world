package day01;
/**
 * �ĵ�ע�͵ĵ�����
 * �ĵ�ע���������������ط����࣬����������
 * ע�����ջᱻjavadoc����벢����һ��API�ĵ�
 * ����������ͨ��������˵����ǰ��Ĺ���
 * @author pjz �����ߣ�
 * @version 1.0 22/06/16 (1����Ϊ��汾�޸�-�����ϵ��޸ġ�0ΪС�汾����-�޸�bug֮���
 *                       22/06/16��Ϊ������ʱ��)
 * @see java.long.String (�ο��İ�)
 * @since JDK1.0 (ʼ��ĳһJDK�汾)
 */
public class APIDocDemo {
	
	/**
	 * sayHello����ʹ�õ��ʺ����
	 */
	public static final String INFO = "��ã�";
	
	/**
	 * Ϊָ���û����һ���ʺ���(�����Ĺ���)
	 * @param name ��Ҫ��ӵ��ʺ�����û��� ��������
	 * @return �����ʺ�����ַ���
	 */
	public String sayHello(String name){
		return INFO+name;
	}
}
