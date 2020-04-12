package cn.cn668.util;

/**
 * 非空判断工具类
 * @author YinP
 *
 */
public class Equals {
	
	/**
	 * String 非空判断
	 * @param str
	 * @return
	 */
	public static boolean StringEqualsNull(String str) {
		if(str==null || str=="" ) {
			return false;
		}else {
			return true;
		}
	}

}
