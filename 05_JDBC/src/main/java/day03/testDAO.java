package day03;
//ʹ��day01��test�޸�

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day01.DBUtil;
import day03.UserInfoDAO;

/**
 * �û�����ϵͳ
 * ����������Ҫ���û����������ţ�
 * 1 ��ʾ��ע���û�
 * 2 ��ʾ��¼
 * 3 ��ѯ��¼�û������
 * 4 �޸�����
 * 5 ת��
 * 6 �ǳ�
 */
public class testDAO {
	
	public static UserInfo userInfo = null; //�û�����
	public static UserInfoDAO userInfoDAO = new UserInfoDAO(); //UserInfoDAO���ж����˲������ݿ�ķ���
	public static int account = 50000; //���
	static Connection conn; //�����������ݿ�
	static Statement state; //���������ݿ�֮���ͨ��
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			//��ȡ���ݿ�
			conn = DBUtil.getConnection();
			//����Statement�������ݿⷢ��SQL���
			 state = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int input = 0;
		while(true){
			System.out.println("     1-ע��");
			System.out.println("     2-��¼");
			System.out.println("     3-��ѯ���");
			System.out.println("     4-�޸�����");
			System.out.println("     5-ת��");
			System.out.println("     6-�ǳ�");
			System.out.print("��ѡ���ܣ�");
			input = scan.nextInt();
			switch(input){
			case 1: reg(); break;
			case 2: login(); break;
			case 3: showAccount(); break;
			case 4: modifyPWD(); break;
			case 5: transferOfAccount(); break;
			case 6: logout(); break;
			default:
				System.out.print("������ѡ����:");
			}
		}
		
	}//main
	
	/*
	 * ע��
	 * Ҫ���û����룺�û��������룬����
	 * ����userinfo��
	 * id�����У�seq_userinfo_id����
	 * ע���û���ʼ��50000
	 */
	public static void reg(){
		System.out.println("��ӭע�ᣡ����");
		System.out.println("�������������:");
		//�ж��Ƿ��Ѿ����ڸ����֣�������
		String name = scan.next();
		System.out.println("������������룺");
		String pwd = scan.next();
		//������֤
		while(true){
			System.out.println("���ٴ��������룺");
			if(scan.next().equals(pwd)){
				break;
			}else{
				System.out.println("������������벻һ�£��������������룺");
				pwd = scan.next();
			}
		}
		System.out.println("������������䣺");
		String eml = scan.next();
		//��ʼע��
		userInfo = new UserInfo();
		userInfo.setUsername(name);
		userInfo.setPassword(pwd);
		userInfo.setEmail(eml);
		userInfo.setAccount(50000);
		//�������ݹ�������DAO
		if(userInfoDAO.save(userInfo)){
			System.out.println("��ϲ�㣬"+name+"ע��ɹ������¼��");
			login();
		}else{
			System.out.println("ע��ʧ�ܣ�");
		}
	}
	
	/*
	 * ��¼
	 * Ҫ���û����룺�û���������
	 * ��������ȷ����ʾ����ӭ��:xxxx
	 * ��¼ʧ����ʾ���û������������
	 */
	public static void login(){
		System.out.println("��ӭ��¼��");
		System.out.println("�������������:");
		String name = scan.next();
		System.out.println("������������룺");
		String pwd = scan.next();
		//�������ݿⲢ���в���
		userInfo = new UserInfo();
		userInfo.setUsername(name);
		userInfo.setPassword(pwd);
		userInfo = userInfoDAO.findByNameAndPwd(name, pwd);
		if(userInfo!=null){
			System.out.println("��¼�ɹ�����ӭ�㣺"+name);
		}else{
			System.out.println("�û�����������������µ�¼��");
			login();
		}
	}
	
	/*
	 * �����
	 * �����û��Ѿ�ִ�й���¼���������ɹ�����ô��ѯ����ʾ���û����
	 * ��û�е�¼��������ʾ��Ҫ�û��ȵ�¼
	 */
	public static void showAccount(){
		
		try {
			if(userInfo==null){
				System.out.println("���ȵ�¼:");
				login();
			}
			//�����
			userInfo=userInfoDAO.findAccount(userInfo.getId());
			if(userInfo!=null){
				System.out.println("���"+userInfo.getUsername()+"��������Ϊ��"+userInfo.getAccount());
			}else{
				account = 0;
				System.out.println("������Ϊ��"+account);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * �޸�����
	 * ���û��Ѿ���¼��ֱ��Ҫ���û������µ����벢�޸ĸ��û�����
	 * ����Ҫ���û��ȵ�¼
	 */
	public static void modifyPWD(){
		String newPWD = null;
		try {
			if(userInfo==null){
				System.out.println("���ȵ�¼:");
				login();
			}else{
				for(int i=0;i<3;i++){
					System.out.println("����������룺");
					String oldPWD = scan.next();
					System.out.println(1);
					//��֤������
					if(oldPWD.equals(userInfo.getPassword())){
						System.out.println("�����������룺");
						newPWD = scan.next();
						while(true){ //��֤������
							System.out.println("���ٴ��������룺");
							if(scan.next().equals(newPWD)){
								break;
							}else{
								System.out.println("������������벻һ�£��������������룺");
								newPWD = scan.next();
							}
						}
						//�޸����벢���浽���ݿ�
						userInfo.setPassword(newPWD);
						boolean b = userInfoDAO.update(userInfo);
						if(b){
							System.out.println("�����޸ĳɹ���");
						}else{
							System.out.println("�����޸�ʧ�ܣ�");
						}
					}else{
						System.out.println("����������������������룡(�㻹��"+(2-i)+"���������)");
						continue;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * ת��
	 * 1Ҫ���¼
	 * 2Ҫ������ת���˺����֣�������ת�˽������ת�˲���
	 * ע��ת���Ľ��ܲ����ڵ�ǰ��¼�û������
	 * ʹ��PreparedStatementʵ��
	 */
	public static void transferOfAccount(){
		try {
			if(userInfo==null){
				System.out.println("���¼��");
				login();
			}else{
				Scanner scanner = new Scanner(System.in);
				System.out.println("������ת���˺ŵ��û���:");
				String inName = scanner.nextLine();
				System.out.println("������ת�˽��:");
				int money = Integer.parseInt(scanner.nextLine());
				//�ж����
				userInfo=userInfoDAO.findAccount(userInfo.getId());
				int account=userInfo.getAccount();
				if(userInfo!=null){
					if(account<money){
						System.out.println("�����˻����㣬��ǰ���Ϊ:"+account);
					}else{
						//��ʼת��
						//�޸�ת���˺����
						if(userInfoDAO.moveAccount(inName, money)){
							System.out.println("ת����ɹ�!");
							//�޸�ת���˺����
							if(userInfoDAO.moveAccount(userInfo.getUsername(), -money)){
								System.out.println("ת�����!");
							}else{
								System.out.println("ת��ʧ��!");
							}
							
						}else{
							System.out.println("ת����ʧ��!");
						}					
					}
				}else{
					System.out.println("�˺��쳣!");
				}			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConnection(conn);
		}
	}
	
	//�ǳ�
	public static void logout(){
		if(userInfo==null){
			System.out.println("���û�е�¼��Ŷ��");
		}else{
			userInfo=null;
			System.out.println("���Ѿ��ǳ����ټ���");
		}
	}
}

/**
 * �����û���������
 * �������ͣ�java.sql.SQLException: �����ж�ʧ  IN �� OUT ����:: 4
 * ����λ�ã�ps.setInt(1, 50000);
 * �������Ϊps.setInt(4, 50000);
 */

/**
 * ����ѯʱ����
 * java.sql.SQLException: δ���� ResultSet.next
 * ������� int account = rs.getInt("account");
 * 	    String username = rs.getString("username");
 *       ������ŵ������if�����
 */

/**
 * ת�˹���ģ��
 * ���⣺������ת���˻�ʱ����
 * ����λ�ã�friendAccount = rs.getInt(account);
 * �������ͣ�java.sql.SQLException: ��Ч��������
 * �����friendAccount = rs.getInt("account");
 */


