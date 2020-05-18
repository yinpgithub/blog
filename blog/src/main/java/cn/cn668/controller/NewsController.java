package cn.cn668.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

//	@RequestMapping("new.html")
//	public String New() {
//		return "new";
//	}

//	@RequestMapping("{page}.html")
//	public String news(HttpServletRequest request,HttpServletResponse response, @PathVariable("page") String page) throws IOException {
//
//		response.setContentType("text/html;charset=utf-8");
//		
//		JSONObject json = new JSONObject();
//		json.put("page", page);
//
//		Contents contents = service.findContents(json);
//
//		if (contents == null) {
//			return "error/404";
//
//		}
//
//		request.setAttribute("contents", contents);
//
//		return "news";
//	}

//	@RequestMapping(value = {"/","index.html"})
//	public String index(HttpServletRequest request) {
//
//		JSONObject json = new JSONObject();
//		json.put("pageNum", 1);
//		json.put("pageSize", 10);
//
//		List<Contents> contentss = service.findContentss(json);
//
//		request.setAttribute("contentss", contentss);
//
//		return "index";
//	}

//	@RequestMapping("/page/{pageNum}.html")
//	public String page(HttpServletRequest request, @PathVariable("pageNum") Integer pageNum) {
//
//		JSONObject json = new JSONObject();
//		json.put("pageNum", pageNum);
//		json.put("pageSize", 10);
//
//		List<Contents> contentss = service.findContentss(json);
//
//		request.setAttribute("contentss", contentss);
//
//		return "public/index/index";
//	}
}