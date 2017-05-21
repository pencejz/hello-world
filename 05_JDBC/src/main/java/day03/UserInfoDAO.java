package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day01.DBUtil;

/**
 * DAO-Data Access Object
 * DAO是一系列的类，它是一个层次，处于数据持久层
 * 作用是让业务逻辑层对于数据的操作完全面向对象化
 * DAO针对数据的操作会定义相关的方法，具体看业务逻辑对数据操作的要求而定
 * @author sss
 *
 */
public class UserInfoDAO {
	/**
	 * 将给定的UserInfo记录保存到userInfo表中
	 * @param userInfo
	 * @return 是否保存成功
	 */
	public boolean save(UserInfo userInfo){
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = " insert into userinfo(id, username, password, email, account) "
					   + " values(seq_userinfo_id.nextval, ?, ?, ?, ?) ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userInfo.getUsername());
			ps.setString(2, userInfo.getPassword());
			ps.setString(3, userInfo.getEmail());
			ps.setInt(4, userInfo.getAccount());
			int d = ps.executeUpdate();
			if(d>0){
				System.out.println("插入完毕！");
				return true;
			}else{
				System.out.println("插入失败！");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		
		return false;
	}
	
	/**
	 * 修改指定用户信息
	 * @param userInfo
	 * @return 返回是否修改成功
	 */
	public boolean update(UserInfo userInfo){
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = " update userinfo "
					   + " set username=?,password=?,email=?,account=? "
					   + " where id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userInfo.getUsername());
			ps.setString(2, userInfo.getPassword());
			ps.setString(3, userInfo.getEmail());
			ps.setInt(4, userInfo.getAccount());
			ps.setInt(5, userInfo.getId());
			int d =ps.executeUpdate();
			if(d>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		return false;
	}

	/**
	 * 根据给定的用户名和密码查询用户信息
	 * @param username
	 * @param password
	 * @return null表示没有找到数据
	 */
	public UserInfo findByNameAndPwd(String username, String password){
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = " select id,username,password,email "
					   + " from userinfo "
					   + " where username=? and password=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				UserInfo userInfo = new UserInfo();
				userInfo.setId(rs.getInt("id"));
				userInfo.setUsername(rs.getString("username"));
				userInfo.setPassword(rs.getString("password"));
				userInfo.setEmail(rs.getString("email"));
				userInfo.setAccount(rs.getInt("account"));
				return userInfo;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		return null;
	}

	/**
	 * 根据给定id查询相关信息
	 * @param id
	 * @return
	 */
	public UserInfo findById(int id){
		Connection conn = null;
		try {
			String sql = " select id,username,password,email "
					   + " from userinfo "
					   + " where id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				UserInfo userInfo = new UserInfo();
				userInfo.setId(rs.getInt("id"));
				userInfo.setUsername(rs.getString("username"));
				userInfo.setPassword(rs.getString("password"));
				userInfo.setEmail(rs.getString("email"));
				return userInfo;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		return null;
	}
	
	/**
	 * 余额查询功能
	 * @param id 要查询的人的id号
	 * @return 余额
	 */
	public UserInfo findAccount(int id){
		Connection conn =null;
		try{
			conn=DBUtil.getConnection();
			String sql = " SELECT id,username,password,email,account "
					   + " FROM userinfo "
					   + " WHERE id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				UserInfo userInfo = new UserInfo();
				userInfo.setId(rs.getInt("id"));
				userInfo.setUsername(rs.getString("username"));
				userInfo.setPassword(rs.getString("password"));
				userInfo.setEmail(rs.getString("email"));
				userInfo.setAccount(rs.getInt("account"));
				return userInfo;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		return null;
	}
	
	/**
	 * 转账功能
	 * @param inuser 要转入的账户
	 * @param money 要转入的金额
	 * @return 是否转账成功
	 */
	public boolean moveAccount(String inuser, int money){
		Connection conn =null;
		try{
			conn=DBUtil.getConnection();
			String sql = " UPDATE userinfo "
						 + " SET account=account+? "
						 + " WHERE username=? ";
			PreparedStatement ps = conn.prepareStatement(sql,new String[]{"account"});
			ps.setInt(1, money);
			ps.setString(2,inuser);
			int d = ps.executeUpdate();
			ps.close();
			if(d>0){
				return true;
			}	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		return false;
	}
	
}














