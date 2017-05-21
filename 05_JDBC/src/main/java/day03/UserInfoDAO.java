package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day01.DBUtil;

/**
 * DAO-Data Access Object
 * DAO��һϵ�е��࣬����һ����Σ��������ݳ־ò�
 * ��������ҵ���߼���������ݵĲ�����ȫ�������
 * DAO������ݵĲ����ᶨ����صķ��������忴ҵ���߼������ݲ�����Ҫ�����
 * @author sss
 *
 */
public class UserInfoDAO {
	/**
	 * ��������UserInfo��¼���浽userInfo����
	 * @param userInfo
	 * @return �Ƿ񱣴�ɹ�
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
				System.out.println("������ϣ�");
				return true;
			}else{
				System.out.println("����ʧ�ܣ�");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConnection(conn);
		}
		
		return false;
	}
	
	/**
	 * �޸�ָ���û���Ϣ
	 * @param userInfo
	 * @return �����Ƿ��޸ĳɹ�
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
	 * ���ݸ������û����������ѯ�û���Ϣ
	 * @param username
	 * @param password
	 * @return null��ʾû���ҵ�����
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
	 * ���ݸ���id��ѯ�����Ϣ
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
	 * ����ѯ����
	 * @param id Ҫ��ѯ���˵�id��
	 * @return ���
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
	 * ת�˹���
	 * @param inuser Ҫת����˻�
	 * @param money Ҫת��Ľ��
	 * @return �Ƿ�ת�˳ɹ�
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














