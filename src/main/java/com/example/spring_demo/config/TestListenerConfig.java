package com.example.spring_demo.config;

import com.example.spring_demo.component.TestNewListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * TestListenerConfig
 *
 * @author lizengcai
 * @date 2019/12/26
 */
@Configuration
public class TestListenerConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestNewListener()).addPathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

}
