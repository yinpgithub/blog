package cn.cn668.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.cn668.RJson;
import cn.cn668.pojo.User;
import cn.cn668.service.UserService;

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
	 * @throws InterruptedException 
	 */
	@RequiresPermissions(value = {"管理员","e794a8e688b7e7aea1e79086"},logical = Logical.OR)
	@RequestMapping(value = "findUserList",method = RequestMethod.POST)
	public RJson findUserList(HttpServletRequest request,HttpServletResponse response) throws InterruptedException {
		Thread.sleep(500);
		try {
			List<User> user = service.findUserList();
			return RJson.success(user);
		} catch (Exception e) {
			return RJson.error(500,e.getMessage());
		}
	}

}
