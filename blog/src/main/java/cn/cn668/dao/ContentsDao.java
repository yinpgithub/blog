package cn.cn668.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.pojo.Contents;

/**
 * 内容
 * @author Administrator
 *
 */
@Mapper
public interface ContentsDao {
	
	/**
	 * 查询内容集合
	 * @param json
	 * @return
	 */
	public List<Contents> findContentss(JSONObject json);

}
