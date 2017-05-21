package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import day01.DBUtil;

/**
 * ��ȡ���������
 * ͨ�������Ԫ���ݿ��Ե�֪���������Ľṹ�ϵ���Ϣ
 * �磺������ж��ٸ��ֶΣ��ֶε����ֵ���Ϣ
 * @author sss
 *
 */
public class JDBCDemo03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			Statement state = conn.createStatement();
			String sql = "select * from emp ";
			ResultSet rs = state.executeQuery(sql);
			//��ȡ��ǰ�������Ԫ����
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			for(int i=1;i<=count;i++){ //�˴�i=1  ��i=0ʱ����---��Ч��������: getValidColumnIndex
				String colName = rsmd.getColumnName(i);
				System.out.println(colName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
	}
}
