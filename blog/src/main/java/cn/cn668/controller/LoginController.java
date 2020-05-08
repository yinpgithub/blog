package cn.cn668.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.service.LoginService;
import cn.cn668.util.Equals;

/**
 * 登录
 * 
 * @author YinP
 *
 */
@RestController
@CrossOrigin
public class LoginController {

	@Autowired
	LoginService service;

	JSONObject result = new JSONObject();
	
	@RequestMapping("login.html")
	public String login () {
		return "login";
	}

	/**
	 * 登录
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public JSONObject login(HttpServletRequest request, HttpServletResponse response) {

		try {
			
			// 接收参数
			String str = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
			response.setContentType("application/json");
			// 将接受到的字符串转换为json数组
			JSONObject json = JSONObject.parseObject(str);

			String userName = json.getString("userName");
			if (!Equals.StringEqualsNull(userName)) {
				result.put("result", false);
				result.put("msg", "参数'userName'=" + userName + "无效");
				return result;
			}
			String password = json.getString("password");
			if (!Equals.StringEqualsNull(password)) {
				result.put("result", false);
				result.put("msg", "参数'password'=" + password + "无效");
				return result;
			}
			
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
