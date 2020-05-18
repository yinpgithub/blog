package cn.cn668.pojo;

public class Menu {
	private Integer id;
	private String menu;
	private String hexadecimal;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getHexadecimal() {
		return hexadecimal;
	}
	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", menu=" + menu + ", hexadecimal=" + hexadecimal + "]";
	}
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	public Menu(Integer id, String menu, String hexadecimal) {
		this.id = id;
		this.menu = menu;
		this.hexadecimal = hexadecimal;
	}
}
