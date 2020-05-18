package cn.cn668.config.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cn668.RJson;

/**
 * 报错实现错误代码的处理
 * @author YinP
 *
 */
@Controller
public class MyExceptionAdvice implements ErrorController{

	@Autowired
    HttpServletRequest request;
	
	@Override
    @RequestMapping("/error")
	@ResponseBody
    public String getErrorPath() {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		switch (statusCode) {
			case 404:
				return new RJson().error(404,"文件不存在").toString();
			case 400:
				return new RJson().error(404,"....").toString();
			default:
				return new RJson().error(500,"服务器内部错误").toString();
		}
    }

}
