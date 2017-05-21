package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day01.DBUtil;

/**
 * ����ִ��SQL���ʱЧ������
 * �Լ�JDBC��������
 * Ӱ������ִ��SQL��������һ���У�
 * 		1����
 * 		2���紫��
 * 		3ִ�мƻ�
 */
public class JDBCDemo02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			//��userinfo_pjz�в���100������
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			String sql = " insert into userinfo(id, username, password, email, account) "
					   + " values(seq_userinfo_id.nextval, ?, ?, ?, 50000)";
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i=0;i<100;i++){
				ps.setString(1, "user"+i);
				ps.setString(2, "123");
				ps.setString(3, "user"+i+"@.com");
//				//ÿ��ִ�ж��ᷢ��һ���������
//				ps.executeUpdate();
				/*
				 * addBatch���������Ȳ������ݷ������ݿ⣬�����Ȼ����ڱ���
				 */
				ps.addBatch();
			}
			/*
			 * һ���Խ����л���������������͸����ݿ⣬�����˴������������
			 */
			int[] d = ps.executeBatch();
			//�ύ����
			conn.commit();
			System.out.println("������ϣ�");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.setAutoCommit(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			DBUtil.closeConnection(conn);
		}
	}
}
