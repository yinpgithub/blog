package cn.cn668.pojo;

public class Role {
	private Integer id;
	private String roleName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + "]";
	}
	public Role(Integer id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
}
