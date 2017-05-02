package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 */
public class Client {
	/*
	 * �׽��� ��װ��TCPЭ���ͨѶ ʹ�������Խ��л���TCP��ͨѶ
	 */
	private Socket socket;

	/*
	 * ���췽����������ʼ���ͻ���
	 */
	public Client() {
		try {
			/*
			 * ʵ����Socket��ʱ����Ҫ�������������� 1��Զ�˼������IP��ַ 2��Զ�˼�����Ķ˿�
			 * ͨ��IP��ַ�����ҵ�����˵ļ������ͨ���˿ڿ����ҵ������ڸû��� �ϵķ����Ӧ�ó���
			 * 
			 * ʵ����Socket�Ĺ��̾�������Զ�˼�����Ĺ��̣� ��Զ�˼����û����Ӧ�����׳��쳣����ʵ����ʧ��
			 */
			System.out.println("�������ӷ����...");
			socket = new Socket("localhost",8088);
//			socket = new Socket("172.16.17.50",8088); //����
//			socket = new Socket("172.16.0.45",8088); //�˺�
//			socket = new Socket("172.16.17.254",8088); //����
//			socket = new Socket("172.16.17.233",8089); //wuyup
//			socket = new Socket("172.16.17.35",8088);
			System.out.println("���ӷ������ϣ�");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start() {
		try {
			//���Ƚ���ȡ����˷��͹�����Ϣ���߳���������
			ServerHandler handler=new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			Scanner scan = new Scanner(System.in);
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);
			//�����ǳ�
			String nickname = null;
			while(true){
				System.out.println("�������ǳƣ�");
				nickname = scan.nextLine();
				if(nickname.length()==0){
					System.out.println("����������һ���ַ���");
					continue;
				}
				break;
			}
			//���������ǳ�
			pw.println(nickname);
			System.out.println("��ã�"+nickname+"��ʼ����ɣ�");
			String str=null;
			while(true){
				str = scan.nextLine();
				pw.println(str);
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
		
	}//main
	
	private class ServerHandler implements Runnable{
		
		public void run() {
			
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
//				BufferedReader br = new BufferedReader(
//						new InputStreamReader(
//								socket.getInputStream(), "UTF-8"));
				String message=null;
				while((message=br.readLine())!=null){
					System.out.println(message);
				}
			} catch (Exception e) {
				
			}
		}
		
	}
}



















