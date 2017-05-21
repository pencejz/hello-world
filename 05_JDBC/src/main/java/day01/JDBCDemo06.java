package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * ����DBUtil��
 * �鿴emp���е�Ա������
 */
public class JDBCDemo06 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			Statement state = conn.createStatement();
			String sql = "select count(*) c from emp";
			ResultSet rs = state.executeQuery(sql);
			if(rs.next()){
//				int count = rs.getInt(1); //��һ���ֶ�
				int count = rs.getInt("c");
				System.out.println("������Ϊ��"+count);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		
	}//main
	
}
