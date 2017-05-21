package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day01.DBUtil;

/**
 * ����ת���˺ŵ��û���
 * ������ת���˻����û���
 * ������ת���˻����
 * ��������˺ŵ�ת�˹���
 */
public class JDBCDemo01 {
	static String sql = null;
	static Connection conn = null;
	static PreparedStatement ps = null;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("������ת���˻���");
			String inuser = scan.next();
			/* 
			 * ��֤ת���˻�
			 */
			sql = " select username "
				+ " from userinfo "
				+ " where username=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, inuser);
			ResultSet rs = ps.executeQuery();
			while(true){
				if(rs.next()){
					break;
				}else{
					System.out.println("��������˻������ڣ����������룺");
					inuser = scan.next();
				}
			}
			
			System.out.println("������ת���˻���");
			String outuser = scan.next();
			/* 
			 * ��֤ת���˻�
			 */
			sql = " select username "
				+ " from userinfo "
				+ " where username=? ";
			ps = conn.prepareStatement(outuser);
			ps.setString(1, outuser);
			rs = ps.executeQuery();
			while(true){
				if(rs.next()){
					break;
				}else{
					System.out.println("��������˻������ڣ����������룺");
					outuser = scan.next();
				}
			}
			
			System.out.println("������ת�˽�");
			int moveMoney = scan.nextInt();
			/*
			 * �ж�ת���˻��Ƿ����㹻��Ǯ
			 */
			sql = " select account "
				+ " from userinfo"
				+ " where username=? ";
			
			/**
			 * JDBC��Connection������������Ĭ����������Զ��ύ�����
			 * ����ζ��ÿ������һ��executeUpdateִ��DML�����󣬶����ύ����
			 */
			conn = DBUtil.getConnection();
			//�ر��Զ��ύ����
			conn.setAutoCommit(false);
			//ת��
			sql = " update userinfo "
					     + " set account=account+? "
					     + " where username=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, moveMoney);
			ps.setString(2, inuser);
			int in = ps.executeUpdate();
			ps.close();
			if(in>0){
				System.out.println("ת��ɹ���");
				//ת��
				sql = " update userinfo_pjz "
						+ " set account=account-? "
						+ " where username=? ";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, moveMoney);
				ps.setString(2, outuser);
				int out = ps.executeUpdate();
				ps.close();
				if(out>0){
					System.out.println("ת���ɹ���");
					//�ύ����
					conn.commit();
				}else{
					System.out.println("ת��ʧ�ܣ�");
					//ʧ�ܻ�������
					conn.rollback();
				}
				
			}else{
				System.out.println("ת��ʧ�ܣ�");
				conn.rollback();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			if(conn!=null){
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
		}finally{
			//���Զ��ύ
			if(conn!=null){
				try {
					conn.setAutoCommit(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			DBUtil.closeConnection(conn);
		}
		
		scan.close();
		
	}//main
	
}
