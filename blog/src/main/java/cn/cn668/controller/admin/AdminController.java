package cn.cn668.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.service.LoginService;

/**
 * 登录
 * 
 * @author YinP
 *
 */
@Controller
@CrossOrigin
@RequestMapping("admin")
public class AdminController {

	@Autowired
	LoginService service;

	JSONObject result = new JSONObject();
	
	@RequestMapping("")
	public String admin () {
		return "admin/index";
	}
	
	@RequestMapping("index.html")
	public String login () {
		return "admin/index";
	}
}
