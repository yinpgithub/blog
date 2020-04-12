package cn.cn668.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.cn668.pojo.User;

/**
 * 注册
 * @author YinP
 *
 */
@Mapper
public interface RegisterDao {

	public Integer register(User dx);
	
}
