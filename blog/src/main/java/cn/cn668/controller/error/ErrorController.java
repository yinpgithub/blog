package cn.cn668.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异常
 * @author YinP
 *
 */
@Controller
public class ErrorController {

	@RequestMapping("404.html")
	public String error404 () {
		return "error/404";
	}
	
	@RequestMapping("400.html")
	public String error400 () {
		return "error/400";
	}
	
	@RequestMapping("500.html")
	public String error500 () {
		return "error/500";
	}
	
}
