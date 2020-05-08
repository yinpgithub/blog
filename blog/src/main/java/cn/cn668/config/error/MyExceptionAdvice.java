package cn.cn668.config.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String getErrorPath() {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		switch (statusCode) {
			case 404:
				return "error/404";
			case 400:
				return "error/400";
			default:
				return "error/500";
		}
    }

}
