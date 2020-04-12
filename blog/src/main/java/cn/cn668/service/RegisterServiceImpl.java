package cn.cn668.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cn668.dao.RegisterDao;
import cn.cn668.pojo.User;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterDao dao;

	@Override
	public boolean register(User dx) {
		Integer result = dao.register(dx);
		if(result==1) {
			return true;
		}else {
			return false;
		}
	}

}
