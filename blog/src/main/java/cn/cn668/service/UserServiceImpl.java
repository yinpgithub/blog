package cn.cn668.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cn668.dao.UserDao;
import cn.cn668.pojo.User;

/**
 * 用户
 * @author YinP
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;

	@Override
	public User findUser(String userName) {
		// TODO Auto-generated method stub
		return dao.findUser(userName);
	}

	@Override
	public List<User> findUserList() {
		// TODO Auto-generated method stub
		return dao.findUserList();
	}

}
