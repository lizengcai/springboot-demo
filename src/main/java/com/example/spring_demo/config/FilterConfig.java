package com.example.spring_demo.config;

import com.example.spring_demo.filter.LoginFilter;
import com.example.spring_demo.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * FilterConfig
 *
 * @author lizengcai
 * @date 2019/12/26
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean setTestFilter(TestFilter testFilter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(testFilter);
        filterRegistrationBean.addUrlPatterns("/url1/*");
        //order的数值越小，在所有的filter中优先级越高
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean setTestFilter2(TestFilter testFilter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(testFilter);
        filterRegistrationBean.addUrlPatterns("/url1/*");
        //order的数值越小，在所有的filter中优先级越高
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
