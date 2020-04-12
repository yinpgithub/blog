package cn.cn668.pojo;

/**
 * 用户实体类
 * @author YinP
 *
 */
public class User {

	private Integer id;
	private String userName;//用户名
	private String password;//密码
	private String mail;//邮箱
	private String headPortrait;//头像
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", mail=" + mail
				+ ", headPortrait=" + headPortrait + "]";
	}
	
}