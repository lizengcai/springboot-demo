package com.example.spring_demo.controller;

import com.example.spring_demo.component.asyncTask.TestAsyncTask;
import com.example.spring_demo.config.TestConfig;
import com.example.spring_demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * TestController
 *
 * @author lizengcai
 * @date 2019/12/25
 */
@PropertySource({"classpath:application.yml"})
@RestController
@RequestMapping("/test")
public class TestController {

    HashMap params = new HashMap();

    @Value("${test.name}")
    private String name;

    @Autowired
    private TestConfig testConfig;

    @Autowired
    private TestAsyncTask asyncTask;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Object getUser(@PathVariable String id ) {
        params.clear();
        params.put("id", id);
        params.put("name",name);
        params.put("conf",testConfig);
        //int i = Integer.parseInt(id)/0;
        asyncTask.test1();
        Future<String> future = asyncTask.test2();
        try {
            System.out.println(future.get());
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return params;
    }

    @GetMapping(value="/v1/page_user2")
    public Object pageUserV2(@RequestParam(defaultValue="0",name="page") int  from, int size ){
        params.clear();
        params.put("from", from);
        params.put("size", size);
        return params;
    }

    @RequestMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user){
        params.clear();
        params.put("user", user);
        return params;
    }

    @GetMapping("/v1/get_header")
    public Object getHeader(@RequestHeader("access_token") String accessToken, String id){
        params.clear();
        params.put("access_token", accessToken);
        params.put("id", id);
        return params;
    }

    @GetMapping("/v1/test_request")
    public Object testRequest(HttpServletRequest request){
        params.clear();
        String id = request.getParameter("id");
        params.put("id", id);
        return params;
    }
}
