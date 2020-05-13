package cn.cn668.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ControllerAdvice
public class SpringMVC extends WebMvcConfigurationSupport {

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 将url为 /static/** 的请求映射到 /static/ 路径下进行查找
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

}
