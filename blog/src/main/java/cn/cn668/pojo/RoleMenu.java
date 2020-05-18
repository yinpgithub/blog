package cn.cn668.pojo;

public class RoleMenu {
	private Integer id;
	private Integer roleId;
	private Integer menuId;
	public RoleMenu() {
		// TODO Auto-generated constructor stub
	}
	public RoleMenu(Integer id, Integer roleId, Integer menuId) {
		this.id = id;
		this.roleId = roleId;
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "RoleMenu [id=" + id + ", roleId=" + roleId + ", menuId=" + menuId + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
}
