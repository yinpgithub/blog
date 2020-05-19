package cn.cn668.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cn668.RJson;
import cn.cn668.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;

	@Override
	public RJson login(String userName, String password) {

		// 从SecurityUtils里边创建一个 subject
		Subject subject = SecurityUtils.getSubject();
		// 在认证提交前准备 token（令牌）
		UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
		// 执行认证登陆
		try {
			subject.login(token);
			System.out.println(token);
		} catch (UnknownAccountException uae) {
			return RJson.error(500, "未知账户");
		} catch (IncorrectCredentialsException ice) {
			return RJson.error(500, "密码不正确");
		} catch (LockedAccountException lae) {
			return RJson.error(500, "账户已锁定");
		} catch (ExcessiveAttemptsException eae) {
			return RJson.error(500, "用户名或密码错误次数过多");
		}
		if (subject.isAuthenticated()) {
			return RJson.success("登录成功",token);
		} else {
			token.clear();
			return RJson.error(500, "登录失败");
		}
	}

}
