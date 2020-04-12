package cn.cn668.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.cn668.service.LoginService;
import cn.cn668.util.Equals;
import net.sf.json.JSONObject;

/**
 * 登录
 * @author YinP
 *
 */
@RestController
public class LoginController {
	
	@Autowired
	LoginService service;
	
	JSONObject result = new JSONObject();
	
	/**
	 * 登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public JSONObject login(HttpServletRequest request) {
		
		String userName = request.getParameter("userName");
		if(!Equals.StringEqualsNull(userName)) {
			result.put("result", false);
			result.put("msg", "参数'userName'="+userName+"无效");
			return result;
		}
		String password = request.getParameter("password");
		if(!Equals.StringEqualsNull(password)) {
			result.put("result", false);
			result.put("msg", "参数'password'="+password+"无效");
			return result;
		}
		
		try {
			String res = service.login(userName, password);
			result.put("result", true);
			result.put("msg", res);
			return result;
		} catch (Exception e) {
			result.put("result", false);
			result.put("msg", e.getMessage());
			return result;
		}
	}

}
