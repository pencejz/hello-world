package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/**
 * �����ҷ����
 */
public class Server {
	/*
	 * java.net.ServerSocket �����ڷ���˵�ServerSocket�����������˿ڣ��ͻ��˾���ͨ��
	 * ����˿�������Ӧ�ó��������ӵġ� ServerSocket����һ��ְ����Ǽ����ö˿ڣ�һ��һ���ͻ������ӣ���߾ͻ�
	 * �Զ�����һ��Socket��ͨ�����Socket�Ϳ�����ո����ӵĿͻ���ͨѶ��
	 */
	private ServerSocket server;
	/*
	 * ������
	 * �ü����û�������пͻ��˵�������Ա��ڷ���˹㲥��Ϣ
	 */
	private List<PrintWriter> allOut;

	public Server() {
		try {
			/*
			 * ��ʼ��ServerSocketʱҪָ������˿ڣ��ͻ���ͨ���ö˿ڽ������ӣ�
			 * �ö˿ںŲ��������ϵͳ����Ӧ�ó���������ظ���������׳��쳣
			 */
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * �����������һ���µ������
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out){
		allOut.add(out);
	}
	/*
	 * �������ļ��ϴӹ�������ɾ��
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out){
		allOut.remove(out);
	}
	/*
	 * �����������е����������������������Ϣ�������пͻ���
	 */
	private synchronized void sendMessage(String message){
		for(PrintWriter out : allOut){
			out.println(message);
		}
	}
	
	
	
	public void start() {
		try {
			/*
			 * �÷�����һ����������������һֱ��������˿ڣ�8088��, ֱ��һ���ͻ������ӣ� Ȼ�󴴽�һ����ÿͻ���ͨѶ��Socket
			 */
			while (true) {
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ��������ˣ�");
				// ����һ���߳�������ÿͻ��˵Ľ���
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �߳��ڲ���
	 * ���̸߳�����һ���ͻ��˽��н���
	 */
	private class ClientHandler implements Runnable {
		private Socket socket;
		//�ͻ��˵ĵ�ַ��Ϣ
		private String host;
		private String name;
		private String nickname; //�ǳ�

		public ClientHandler(Socket socket) {
			this.socket = socket;
			/*
			 * ��ȡԶ�̼�����ĵ�ַ��Ϣ
			 */
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
			name=address.getHostName();
		}

		public void run() {
			PrintWriter pw = null;
			try {
				//
				sendMessage(host+"("+name+")��"+"�����ˣ�");
				/*
				 * ͨ��Socket��ȡ��������Ա���Խ���Ϣ���͸��ͻ���
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				pw=new PrintWriter(osw,true);
				//�������������빲����
				addOut(pw);
				/*
				 * Socket�ṩ�ķ����� InputStream getInputStream()
				 * �÷�����ȡ����������������ȡԶ�˼�������͹��������ݵ�
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				//�ͻ��˷��͵ĵ�һ���ַ���Ϊ�ǳ�
				nickname = br.readLine();
				//֪ͨ�����û�����
				sendMessage(nickname+"�����ˣ�"+"��ǰ��������"+allOut.size()+"��");
				String message = null;
				while ((message = br.readLine()) != null) {
					/*
					 * ���ͻ��˶Ͽ����Ӻ����ڿͻ��˵Ĳ���ϵͳ��ͬ������˵� br.readLine������ִ�н��Ҳ��ͬ��
					 * ��windows�ͻ��˶Ͽ����Ӻ�br.readLine������ֱ���׳��쳣
					 * ��linux�ͻ��˶Ͽ����Ӻ�br.readLine�����᷵��null
					 */
					//�����յ�����Ϣ���������̨
					System.out.println(nickname+"˵��" + message);
					//�������Ļ����ظ��ͻ���
//					pw.println(nickname+"˵��(�����)" + message);
					//�������Ļ�ת�������пͻ���
					sendMessage(nickname+"˵��" + message);
				}
			} catch (Exception e) {

			}finally{
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				  //�����ͻ��˵�������ӹ�������ɾ��
				removeOut(pw);
				sendMessage(nickname+"("+name+")��"+"�����ˣ���ǰ����������"+allOut.size()+"��"); //�㲥������Ϣ
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
