package day09;
/**
 * ��ȡ�̵߳������Ϣ
 * @author Administrator
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		//��ȡ����mian�������߳�
		Thread main = Thread.currentThread();
		//�鿴�߳�����---String getName()
		System.out.println("name��"+main.getName());
		//�鿴�̵߳�id---long getId()
		System.out.println("id��"+main.getId());
		//�鿴�̵߳����ȼ�---int getPriority()
		System.out.println("priority��"+main.getPriority());
		//�鿴�߳��Ƿ񻹻���---boolean isAlive()
		System.out.println("isAlive��"+main.isAlive());
		//�鿴�߳��Ƿ�Ϊ�ػ��߳�---boolean isDaemon()
		System.out.println("isDaemon��"+main.isDaemon());
		//�鿴�߳��Ƿ��ж�---boolean isInterrupted()
		System.out.println("isInterrupted��"+main.isInterrupted());
		
		
	}
}
