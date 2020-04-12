package cn.cn668.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.cn668.pojo.User;
import cn.cn668.service.UserService;
import cn.cn668.util.Equals;
import net.sf.json.JSONObject;

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
	@RequestMapping(value = "findUser")
	public JSONObject findUser(HttpServletRequest request) {
		
		String userName = request.getParameter("userName");
		if(!Equals.StringEqualsNull(userName)) {
			return JSONObject.fromObject("参数'userName'="+userName+"无效");
		}
		
		try {
			User user = service.findUser(userName);
			return JSONObject.fromObject(user);
		} catch (Exception e) {
			return JSONObject.fromObject(e.getMessage());
		}
	}

}
