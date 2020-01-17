package com.example.spring_demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * TestConfig
 *
 * @author lizengcai
 * @date 2019/12/25
 */
@Component
@PropertySource({"classpath:application.yml"})
@ConfigurationProperties(prefix = "test")
public class TestConfig {
    private String name;
    private String password;
    private String server;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
