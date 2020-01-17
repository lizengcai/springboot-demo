package com.example.spring_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController2
 *
 * @author lizengcai
 * @date 2019/12/26
 */
@Controller
@RequestMapping("/test2")
public class TestController2 {

    @Value("${test.name}")
    private String name;

    @GetMapping("index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name",name);
        return "fm/index";
    }

    @GetMapping("hello")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("name",name);
        return "tl/index";
    }
}
