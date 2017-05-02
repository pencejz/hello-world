package day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * TCPͨѶ�Ŀͻ���
 * 
 * /sbin/ifconfig
 * 
 * ipconfig
 */
public class Client {
	/*
	 * Socket �׽���
	 * ��װ��TCPЭ�顣 
	 */
	private Socket socket;
	/**
	 * ���췽�������ڳ�ʼ���ͻ��ˣ�����ʼ������
	 * ���ִ�����׳��쳣
	 * @throws Exception
	 */
	public Client() throws Exception{
		try {
			/*
			 * ��ʼ��Socket��Ҫ������������:
			 * 		1:Զ�̼������IP��ַ
			 * 		2:�����Ӧ�ó����ڷ�����������Ķ˿�
			 * ������ͨ��IP��ַ�ҵ��������ļ������ ��ͨ���˿��ҵ��û����ϵķ����Ӧ�ó���ġ�����˿ڲ��ǿͻ��˾����ģ����Ƿ���˾����ġ�  
			 * ʵ����Socket�Ĺ��̾������ӵĹ��̡��������û����Ӧ��������׳��쳣��
			 */
			socket = new Socket("localhost",8088);
		} catch (Exception e) {
			throw e;
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			//�������ڽ��շ���˷�����Ϣ���߳�
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			Scanner scanner = new Scanner(System.in);
			/*
			 * OutputStream getOutputStream()
			 * ͨ��Socket��ȡ����������������ݷ����������
			 */
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw = new PrintWriter(osw,true);
			String message = null;
			while(true){
				message = scanner.nextLine();
				pw.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���߳��������������շ���˷��͹�������Ϣ��������ͻ��˵Ŀ���̨��
	 * @author Administrator
	 *
	 */
	class ServerHandler implements Runnable{
		public void run(){
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								socket.getInputStream(),"UTF-8"));
				
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println(message);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}








