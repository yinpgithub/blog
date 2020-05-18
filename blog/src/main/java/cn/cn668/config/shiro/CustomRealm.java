package cn.cn668.config.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import cn.cn668.dao.LoginDao;
import cn.cn668.dao.UserDao;
import cn.cn668.pojo.User;
import cn.cn668.util.MD5;

import java.util.HashSet;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {
	
	@Autowired
	LoginDao dao;
	@Autowired
	UserDao userDao;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		String userName = (String) SecurityUtils.getSubject().getPrincipal();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		User user = userDao.findUser(userName);
		Set<String> stringSet = new HashSet<>();
		stringSet.add(user.getRole().getRoleName());
		info.setStringPermissions(stringSet);
		return info;
	}

	/**
	 * 这里可以注入userService,为了方便演示，我就写死了帐号了密码 private UserService userService;
	 * <p>
	 * 获取即将需要认证的信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		System.out.println("-------身份认证方法--------");
		String userName = (String) authenticationToken.getPrincipal();
		String userPwd = MD5.MD5Pwd(userName,new String((char[]) authenticationToken.getCredentials()));
		// 根据用户名从数据库获取密码
		User user = dao.login(userName);
		if (user == null) {
			throw new AccountException("用户不存在");
		} else if (!userPwd.equals(user.getPassword())) {
			throw new AccountException("密码不正确");
		}
		return new SimpleAuthenticationInfo(userName, user.getPassword(),
                ByteSource.Util.bytes(userName + "cn668.cn"), getName());
	}
}
