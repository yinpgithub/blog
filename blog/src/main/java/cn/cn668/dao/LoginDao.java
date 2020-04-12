package cn.cn668.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.cn668.pojo.User;

/**
 * 登录
 * @author YinP
 *
 */
@Mapper
public interface LoginDao {
	User login(@Param("userName")String userName);
}
