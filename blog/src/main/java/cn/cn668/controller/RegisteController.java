package cn.cn668.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.pojo.User;
import cn.cn668.service.RegisterService;
import cn.cn668.util.Equals;

/**
 * 注册
 * @author YinP
 *
 */
@RestController
public class RegisteController {
	
	@Autowired
	RegisterService service;
	
	JSONObject result = new JSONObject();
	
	/**
	 * 注册
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "registe",method = RequestMethod.POST)
	public JSONObject registe(HttpServletRequest request) {
		
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
			User dx = new User();
			dx.setUserName(userName);
			dx.setPassword(password);
			
			boolean res = service.register(dx);
			if(res) {
				result.put("result", true);
				result.put("msg", "注册成功");
			}else {
				result.put("result", false);
				result.put("msg", "注册失败");
			}
			
			return result;
		} catch (Exception e) {
			result.put("result", false);
			result.put("msg", e.getMessage());
			return result;
		}
	}

}
