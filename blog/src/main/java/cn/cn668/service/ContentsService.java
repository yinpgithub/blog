package cn.cn668.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.pojo.Contents;

/**
 * 内容
 * @author Administrator
 *
 */
public interface ContentsService {
	
	/**
	 * 查询内容集合
	 * @param json
	 * @return
	 */
	public List<Contents> findContentss(JSONObject json);
	
	/**
	 * 查询内容
	 * @param object
	 * @return
	 */
	public Contents findContents(JSONObject json);
	
}
