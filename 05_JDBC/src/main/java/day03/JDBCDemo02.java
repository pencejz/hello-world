package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day01.DBUtil;

/**
 * 批量执行SQL语句时效率问题
 * 以及JDBC的批操作
 * 影响批量执行SQL语句的因素一般有：
 * 		1事务
 * 		2网络传输
 * 		3执行计划
 */
public class JDBCDemo02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			//向userinfo_pjz中插入100条数据
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			String sql = " insert into userinfo(id, username, password, email, account) "
					   + " values(seq_userinfo_id.nextval, ?, ?, ?, 50000)";
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i=0;i<100;i++){
				ps.setString(1, "user"+i);
				ps.setString(2, "123");
				ps.setString(3, "user"+i+"@.com");
//				//每次执行都会发生一次网络调用
//				ps.executeUpdate();
				/*
				 * addBatch的作用是先不将内容发给数据库，而是先缓存在本地
				 */
				ps.addBatch();
			}
			/*
			 * 一次性将所有缓存的批量操作发送给数据库，减少了大量的网络调用
			 */
			int[] d = ps.executeBatch();
			//提交事务
			conn.commit();
			System.out.println("插入完毕！");
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
