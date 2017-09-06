package com.iwater;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by wangchuanhai on 2017/6/27.
 */
@EnableWebMvc
@Configuration
public class MyWebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
        registry.addResourceHandler("/resources/js/**").addResourceLocations("classpath:/static/resources/js/");
        registry.addResourceHandler("/resources/css/**").addResourceLocations("classpath:/static/resources/css/");
        registry.addResourceHandler("/resources/images/**").addResourceLocations("classpath:/static/resources/images/");
        super.addResourceHandlers(registry);
    }
}
