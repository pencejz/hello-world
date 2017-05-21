package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * �û�����ϵͳ
 * ����������Ҫ���û����������ţ�
 * 1 ��ʾ��ע���û�
 * 2 ��ʾ��¼
 * 3 ��ѯ��¼�û������
 * 4 �޸�����
 * 5 ת��
 * 6 �ǳ�
 * @author sss
 * @version 1.0
 *
 */
public class test {
	
	public static int id = -1; //�û���¼id
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
	 * id�����У�seq_userinfo_pjz_id����
	 * ע���û���ʼ��50000
	 */
	public static void reg(){
		System.out.println("��ӭע�ᣡ����");
		System.out.println("�������������:");
		//�ж��Ƿ��Ѿ����ڸ����֣���������
		
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
		//ʹ��������ʽ��֤����
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[a-zA-Z]+)+";
		boolean tf = eml.matches(regex);
		while(true){
			if(tf){
				break;
			}else{
				System.out.println("������һ����ȷ�����䣡");
				eml = scan.next();
			}
		}
		try {
			//ִ��SQL���
			String sql = " INSERT INTO userinfo_pjz(ID,username,PASSWORD,email,ACCOUNT) "
                       + " VALUES(seq_userinfo_pjz_id.NEXTVAL, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pwd);
			ps.setString(3, eml);
			ps.setInt(4, 50000);
			int d = ps.executeUpdate(); //ִ��sql���
			if(d>0){
				System.out.println("��ϲ�㣬"+name+"ע��ɹ������¼��");
				login();
			}else{
				System.out.println("ע��ʧ�ܣ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
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
		try {
			//�������ݿⲢ���в���
			String sql = " SELECT id,username,PASSWORD "
                       + " from userinfo_pjz "
                       + " where username=? and password=? ";
			PreparedStatement ps = conn.prepareStatement(sql); //Ԥ����
			ps.setString(1, name); //�����ʺ�ֵ
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery(); //ִ��sql���
			if(rs.next()){
				id = rs.getInt("id");
				System.out.println("��¼�ɹ�����ӭ�㣺"+name);
			}else{
				System.out.println("�û�����������������µ�¼��");
				login();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * �����
	 * �����û��Ѿ�ִ�й���¼���������ɹ�����ô��ѯ����ʾ���û����
	 * ��û�е�¼��������ʾ��Ҫ�û��ȵ�¼
	 */
	public static void showAccount(){
		if(id==-1){
			System.out.println("���ȵ�¼:");
			login();
		}
		try {
			//�����
			String sql = " SELECT id, username, account "
                       + " from userinfo_pjz "
                       + " where id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				int account = rs.getInt("account");
				String username = rs.getString("username");
				System.out.println("���"+username+"��������Ϊ��"+account);
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
			if(id==-1){
				System.out.println("���ȵ�¼:");
				login();
			}else{
				System.out.println("����������룺");
				String oldPWD = scan.next();
				//��֤������
				String sql = " select password "
						   + " from userinfo_pjz "
						   + " where id=? "
						   + " and password=? ";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ps.setString(2, oldPWD);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){ //��֤�ɹ�
					System.out.println("�����������룺");
					newPWD = scan.next();
					while(true){
						System.out.println("���ٴ��������룺");
						if(scan.next().equals(newPWD)){
							break;
						}else{
							System.out.println("������������벻һ�£��������������룺");
							newPWD = scan.next();
						}
					}
				}
			}
			//�޸�����
			String sql = " update userinfo_pjz "
                       + " set password=? "
                       + " where id=? ";
			PreparedStatement ps1 = conn.prepareStatement(sql);
			ps1.setString(1, newPWD);
			ps1.setInt(2, id);
			int d = ps1.executeUpdate();
			if(d>0){
				System.out.println("�����޸ĳɹ���");
			}else{
				System.out.println("�����޸�ʧ�ܣ�");
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
			if(id==-1){
				System.out.println("���¼��");
				login();
			}else{
				while(true){
					System.out.println("������Ҫת����˺ţ�");
					String friendName = scan.next();
					//�ж��Ƿ���ڸ��˻��������ڣ���ȡ�����˻������н��
					String sql = " SELECT id, username, account "
		                       + " from userinfo_pjz "
		                       + " where username=? ";
					PreparedStatement ps = conn.prepareStatement(sql); //Ԥ����
					ps.setString(1, friendName); //�����ʺ�ֵ
					ResultSet rs = ps.executeQuery(); //ִ��sql���
					int friendAccount; //��ʾת���˻��Ľ��
					
					if(!rs.next()){ //�˻�������
						System.out.println("��������˻������ڣ����������룡");
						//���������˻�
						transferOfAccount();
						
					}else{ //�˻�����
						while(true){
							friendAccount = rs.getInt("account"); //��ȡת���˻��Ľ��
							System.out.println("������Ҫת��Ľ�");
							int moveAccount = scan.nextInt();
							/*��ȡ�Լ��Ľ��������ж��Ƿ����0�����������ת�ˣ�����������*/
							//�������ݿⲢ����ת��
							sql = " SELECT id, account "
								+ " from userinfo_pjz "
								+ " where id=? ";
							ps = conn.prepareStatement(sql); //Ԥ����
							ps.setInt(1, id); //�����ʺ�ֵ
							rs = ps.executeQuery(); //ִ��sql���
							rs.next();
							int myAccount = rs.getInt("account"); //��ȡ�����еĽ��
							int bal = myAccount-moveAccount; //��ת�˺�����
							if(bal<0){
								System.out.println("���㣬ת��ʧ�ܣ�");
								//������������
								continue;
							}else{ //����㹻
								//�Լ��Ľ�����
								sql = " update userinfo_pjz "
									+ " set account=? "
									+ " where id=? ";
								ps = conn.prepareStatement(sql);
								ps.setInt(1, bal);
								ps.setInt(2, id);
								rs = ps.executeQuery();
								//ת���˺Ž������
								sql = " update userinfo_pjz "
									+ " set account=? "
									+ " where username=? ";
								ps = conn.prepareStatement(sql);
								ps.setInt(1, moveAccount+friendAccount);
								ps.setString(2, friendName);
								rs = ps.executeQuery();
								//ת�˳ɹ�
								System.out.println("ת�˳ɹ����㻹ʣ��"+bal+"Ԫ");
								break;
							}
						}
					}
				}

				
			}//�ѵ�¼
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�ǳ�
	public static void logout(){
		if(id!=-1){
			id=-1;
		}
		System.out.println("���Ѿ��˳����ټ���");
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


