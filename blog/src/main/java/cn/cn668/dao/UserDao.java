package cn.cn668.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.cn668.pojo.User;

/**
 * 用户
 * @author YinP
 *
 */
@Mapper
public interface UserDao {

	User findUser(@Param("userName")String userName);
	
	List<User> findUserList();
	
}
