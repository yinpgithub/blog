package cn.cn668.config.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.cn668.RJson;


/**
 * 配置无权限提示
 * @author YinP
 *
 */
@ControllerAdvice
public class NoPermissionException {
	
	JSONObject result = new JSONObject();

	@ResponseBody
    @ExceptionHandler(UnauthorizedException.class)
    public RJson handleShiroException(Exception ex) {
		return new RJson().error(403, "无权限访问");
    }
    @ResponseBody
    @ExceptionHandler(AuthorizationException.class)
    public RJson AuthorizationException(Exception ex) {
		return new RJson().error(4844, "请先登录");
    }
	
}
