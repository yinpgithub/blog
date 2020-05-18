package cn.cn668.service;

import java.util.List;

import cn.cn668.pojo.User;

/**
 * 用户
 * @author YinP
 *
 */
public interface UserService {
	User findUser(String userName);
	List<User> findUserList();
}
