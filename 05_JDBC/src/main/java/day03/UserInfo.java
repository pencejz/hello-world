package day03;
/**
 * 该类用于表示userinfo表
 * 其实每一个实例用于表示userinfo表中的一条记录
 * @author sss
 *
 */
public class UserInfo {
	
	private int id;
	private String username;
	private String password;
	private String email;
	private int account;
	
	public UserInfo(){}

	public UserInfo(int id, String username, String password, String email, int account) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String toString() {
		return id +", "+ username +", "+ password +", "+ email+", "+account;
	}
	
	
	
}
