package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day01.DBUtil;

/**
 * Statement被设计用来执行静态SQL语句，意思是该SQL不含有任何动态拼接的内容。
 * 因为会出现两个问题：
 * 1.执行效率差
 * 2.会有SQL注入攻击的危险
 * 
 * 执行含有动态内容的SQL语句，应当使用：PreparedStatement。它不存在以上两个不足
 * 当批量执行相同语义的SQL语句，但是其中的值有变化时，使用Statement效率不如PreparedStatement
 * 例如：
 * 向userinfo表插入100条数据时，每条数据中各个字段的值不同
 * 由于Statement是先将SQL语句在java这边先拼接好后再将该SQL发送给数据库
 * 那么数据库会发现每条insert语句内容都不完全一样，那么会当做全新的SQL语句去执行
 * 这时数据库会为每条SQL语句生成一个全新的执行计划（耗时耗资源）
 * PreparedStatement在创建时就要求传入预编译SQL
 * 所以，实现将insert语句传入给数据库，那么数据库为其生成一个执行计划，但是由于该SQL含有“？”
 * 所以该执行计划还缺少数据，那么ps实际上每次只需要将“？”对应的值发送一次
 * 然后数据库就会使用该执行计划执行一次
 * 为此，数据库不会为每个用户都创建一次执行计划了
 */
public class JDBCDemo01 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			/*
			 * 向userinfo表中插入数据
			 * 由于插入的数据是用户输入，所以就导致可能会有拼接DQL语句的操作
			 * 这时就应当使用PreparedStatement来执行预编译DQL语句
			 * 预编译SQL语句是将动态信息先以“？”代替，来确保SQL语义
			 */
			String sql = " insert into userinfo(id,username,password,email,account) "
					   + " values(seq_userinfo_id.nextval, ?, ?, ?, ?) ";
			/*
			 * 创建PS时要将预编译SQL语句传入
			 * 在创建时就已经将传入的预编译SQL发送给数据库了
			 * 因为预编译SQL没有任何动态数据的拼接，所以语义不会有任何改变
			 * 因为“？”的存在，使得该SQL还不能执行，数据库等待将“？”对应的值传递过去后才会执行
			 */
			PreparedStatement ps = conn.prepareStatement(sql);
			/*
			 * 在执行之前SQL之前，要先指定好“？”对应的值
			 * void setXXXX(问号位置，问号值) 指定问号值
			 */
			for(int i=0;i<100;i++){
				ps.setString(1, "user"+i);
				ps.setString(2, "123456");
				ps.setString(3, "user"+i+"@tedu.com");
				ps.setInt(4, 50000);
				int n = ps.executeUpdate(); //执行SQL  此时不在传入SQL，因为在之前已经传入过了
				if(n>0){
					System.out.println("插入完毕！");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		
	}//main
}






















