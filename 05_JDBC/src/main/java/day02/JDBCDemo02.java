package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day01.DBUtil;

/**
 * ps���Ա���SQLע�빥��
 */

public class JDBCDemo02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = " select id "
					   + " from userinfo "
					   + " where username=? and password=? ";
			//Ԥ���룬����sql��䴫�����ݿ�
			PreparedStatement ps = conn.prepareStatement(sql);
			//ָ���ʺ�ֵ
			ps.setString(1, "pjz");
			ps.setString(2, "123");
//			//ֻ�Ὣ���ݿ����������ֵ���ѣ������ٸı�SQL����
//			ps.setString(2, "1' or '1'='1'");
			//ִ��sql���
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("��¼�ɹ���");
			}else{
				System.out.println("��¼ʧ�ܣ�");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
	}
}
