package cn.cn668.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.dao.ContentsDao;
import cn.cn668.pojo.Contents;

/**
 * 内容
 * @author Administrator
 *
 */
@Service
public class ContentsServiceImpl implements ContentsService {
	
	@Autowired
	ContentsDao dao;

	/**
	 * 查询内容集合
	 * @param json
	 * @return
	 */
	@Override
	public List<Contents> findContentss(JSONObject json) {
		// TODO Auto-generated method stub
		return dao.findContentss(json);
	}

}
