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
	private String dt;
	private String mail;//邮箱
	private String headPortrait;//头像
	private Integer roleId;//角色id
	private Role role;//角色
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String userName, String password, String dt, String mail, String headPortrait,
			Integer roleId, Role role) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.dt = dt;
		this.mail = mail;
		this.headPortrait = headPortrait;
		this.roleId = roleId;
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", dt=" + dt + ", mail=" + mail
				+ ", headPortrait=" + headPortrait + ", roleId=" + roleId + ", role=" + role + "]";
	}
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
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
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
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}