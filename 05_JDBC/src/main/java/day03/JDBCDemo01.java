package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day01.DBUtil;

/**
 * 输入转入账号的用户名
 * 再输入转出账户的用户名
 * 再输入转出账户金额
 * 完成两个账号的转账工作
 */
public class JDBCDemo01 {
	static String sql = null;
	static Connection conn = null;
	static PreparedStatement ps = null;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("请输入转入账户：");
			String inuser = scan.next();
			/* 
			 * 验证转入账户
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
					System.out.println("你输入的账户不存在，请重新输入：");
					inuser = scan.next();
				}
			}
			
			System.out.println("请输入转出账户：");
			String outuser = scan.next();
			/* 
			 * 验证转出账户
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
					System.out.println("你输入的账户不存在，请重新输入：");
					outuser = scan.next();
				}
			}
			
			System.out.println("请输入转账金额：");
			int moveMoney = scan.nextInt();
			/*
			 * 判断转出账户是否有足够的钱
			 */
			sql = " select account "
				+ " from userinfo"
				+ " where username=? ";
			
			/**
			 * JDBC中Connection用来管理事务，默认情况下是自动提交事务的
			 * 这意味着每当调用一次executeUpdate执行DML操作后，都会提交事务
			 */
			conn = DBUtil.getConnection();
			//关闭自动提交事务
			conn.setAutoCommit(false);
			//转入
			sql = " update userinfo "
					     + " set account=account+? "
					     + " where username=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, moveMoney);
			ps.setString(2, inuser);
			int in = ps.executeUpdate();
			ps.close();
			if(in>0){
				System.out.println("转入成功！");
				//转出
				sql = " update userinfo_pjz "
						+ " set account=account-? "
						+ " where username=? ";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, moveMoney);
				ps.setString(2, outuser);
				int out = ps.executeUpdate();
				ps.close();
				if(out>0){
					System.out.println("转出成功！");
					//提交事务
					conn.commit();
				}else{
					System.out.println("转出失败！");
					//失败回退事务
					conn.rollback();
				}
				
			}else{
				System.out.println("转入失败！");
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
			//打开自动提交
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
