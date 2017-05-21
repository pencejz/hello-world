package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import day01.DBUtil;

/**
 * 获取结果集数据
 * 通过结果集元数据可以得知结果集自身的结构上的信息
 * 如：结果集有多少个字段，字段的名字等信息
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
			//获取当前结果集的元数据
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			for(int i=1;i<=count;i++){ //此处i=1  当i=0时报错---无效的列索引: getValidColumnIndex
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
