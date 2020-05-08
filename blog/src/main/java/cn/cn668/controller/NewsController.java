package cn.cn668.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import cn.cn668.pojo.Contents;
import cn.cn668.service.ContentsService;

@Controller
public class NewsController {
	
	@Autowired
	ContentsService service;
	
	@RequestMapping("{id}.html")
	public String news (HttpServletRequest request,@PathVariable("id") String id) {
		switch (id) {
		case "1":
			request.setAttribute("title","如何让富婆爱上你");
			request.setAttribute("content","https://www.sohu.com/a/254788180_100245552");
			break;
		case "2":
			request.setAttribute("title","疫情发生以来，全国已累计发放190多亿元消费券");
			request.setAttribute("content","https://baijiahao.baidu.com/s?id=1666089738670434147&wfr=spider&for=pc");
			break;
		case "3":
			request.setAttribute("title","centos7固定局域网ip");
			request.setAttribute("content","https://cn668.cn/82.html");
			break;
		}
		
		request.setAttribute("id",id);
		return "public/news/news";
	}
	
	@RequestMapping("/")
	public String index (HttpServletRequest request) {
		
		JSONObject json = new JSONObject();
		json.put("pageNum", 1);
		json.put("pageSize", 10);
		
		List<Contents> contentss = service.findContentss(json);
		
		request.setAttribute("contentss",contentss );
//		System.out.println("11111111111111111");
//		request.setAttribute("test","123");
		
		return "index";
	}
	
	@RequestMapping("/page/{pageNum}.html")
	public String page (HttpServletRequest request,
			@PathVariable("pageNum") Integer pageNum) {
		
		JSONObject json = new JSONObject();
		json.put("pageNum", pageNum);
		json.put("pageSize", 10);
		
		List<Contents> contentss = service.findContentss(json);
		
		request.setAttribute("contentss",contentss );
		
		return "public/index/index";
	}
}