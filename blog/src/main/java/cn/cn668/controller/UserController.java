package cn.cn668.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.pojo.User;
import cn.cn668.service.UserService;
import cn.cn668.util.Equals;

/**
 * 用户
 * @author YinP
 *
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	UserService service;
	
	/**
	 * 通过userName查询user
	 * @param request
	 * @return
	 */
	@RequiresPermissions("user:list")
	@RequestMapping(value = "findUser",method = RequestMethod.POST)
	public void findUser(HttpServletRequest request,HttpServletResponse response) {
		
		String userName = request.getParameter("userName");
		
		try {
			User user = service.findUser(userName);
			response.getWriter().append(user.toString());
		} catch (Exception e) {
			
		}
	}

}
