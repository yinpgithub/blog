package cn.cn668.service;

import cn.cn668.RJson;

/**
 * 登录
 * @author YinP
 *
 */
public interface LoginService {
	RJson login(String userName,String password);
}
