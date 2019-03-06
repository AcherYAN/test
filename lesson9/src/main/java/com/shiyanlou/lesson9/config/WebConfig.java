package com.shiyanlou.lesson9.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.shiyanlou.lesson9.interceptor.LoginInterceptor;

// 标识configuration
@Configuration
public class WebConfig extends WebMvcConfigurationSupport{

      // 自动注入拦截器
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(loginInterceptor).addPathPatterns("/user/**").excludePathPatterns("/user/login");

        super.addInterceptors(registry);
    }
}
