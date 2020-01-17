package com.example.spring_demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatisConfig
 *
 * @author lizengcai
 * @date 2019/12/30
 */
@Configuration
@MapperScan("com.example.spring_demo.mapper")
public class MyBatisConfig {
}
