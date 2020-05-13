package cn.cn668.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Component
public class ViewResolverConfig {

	@Autowired
    @Qualifier("thymeleafViewResolver")
    private void myViewConfig(ThymeleafViewResolver thymeleafViewResolver){
        if(thymeleafViewResolver != null){
            Map<String, Object> map = new HashMap<>();
            map.put("path","blog");
            thymeleafViewResolver.setStaticVariables(map);
        }
    }
	
}
