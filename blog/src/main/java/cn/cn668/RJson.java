package cn.cn668;

public class RJson {

	private Integer code;
	private String msg;
	private Object result;
	
	@Override
	public String toString() {
		return "RJson [code=" + code + ", msg=" + msg + ", result=" + result + "]";
	}
	public RJson() {
		// TODO Auto-generated constructor stub
	}
	public RJson(Integer code, String msg, Object result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}
	
	public static RJson success(Object result) {
		return new RJson(200,"请求成功",result);
	}
	
	public static RJson error(String msg) {
		return new RJson(500,msg,null);
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
}
