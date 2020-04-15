package cn.cn668.config.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;


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
    public JSONObject handleShiroException(Exception ex) {
        result.put("result", false);
		result.put("msg", "无权限访问");
		return result;
    }
    @ResponseBody
    @ExceptionHandler(AuthorizationException.class)
    public JSONObject AuthorizationException(Exception ex) {
        result.put("result", false);
		result.put("msg", "权限认证失败");
		return result;
    }
	
}
