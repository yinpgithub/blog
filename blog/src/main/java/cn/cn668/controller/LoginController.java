package cn.cn668.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.RJson;
import cn.cn668.service.LoginService;
import cn.cn668.util.Equals;

/**
 * 登录
 * 
 * @author YinP
 *
 */
@Controller
@CrossOrigin
public class LoginController {

	@Autowired
	LoginService service;

	JSONObject result = new JSONObject();
	
	@RequestMapping("test")
	public RJson login (@RequestParam String view) {
		return RJson.success(view);
	}
	
	

	/**
	 * 登录
	 * 
	 * @param request
	 * @return
	 */
//	@RequiresPermissions(value = {"admin","vip"},logical = Logical.OR)
	@ResponseBody
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public RJson login(HttpServletRequest request, HttpServletResponse response) {

		try {
			Thread.sleep(1000);
			// 接收参数
			String str = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
			response.setContentType("application/json");
			// 将接受到的字符串转换为json数组
			JSONObject json = JSONObject.parseObject(str);

			String userName = json.getString("userName");
			if (!Equals.StringEqualsNull(userName)) {
				return new RJson().error(500,"参数'userName'=" + userName + "无效");
			}
			String password = json.getString("password");
			if (!Equals.StringEqualsNull(password)) {
				return new RJson().error(500,"参数'password'=" + password + "无效");
			}
			
			String res = service.login(userName, password);
			return new RJson().success(res);
		} catch (Exception e) {
			result.put("result", false);
			result.put("msg", e.getMessage());
			return new RJson().error(500,e.getMessage());
		}
	}

}
