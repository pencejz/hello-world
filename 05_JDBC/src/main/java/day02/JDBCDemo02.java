package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day01.DBUtil;

/**
 * ps可以避免SQL注入攻击
 */

public class JDBCDemo02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = " select id "
					   + " from userinfo "
					   + " where username=? and password=? ";
			//预编译，并将sql语句传入数据库
			PreparedStatement ps = conn.prepareStatement(sql);
			//指定问号值
			ps.setString(1, "pjz");
			ps.setString(2, "123");
//			//只会将内容看作是密码的值而已，不会再改变SQL语义
//			ps.setString(2, "1' or '1'='1'");
			//执行sql语句
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("登录成功！");
			}else{
				System.out.println("登录失败！");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
	}
}
