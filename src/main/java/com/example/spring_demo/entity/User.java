package com.example.spring_demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * User
 *
 * @author lizengcai
 * @date 2019/12/25
 */
public class User {
    public User() {
    }
    @JsonIgnore
    private String username;

    private String age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
