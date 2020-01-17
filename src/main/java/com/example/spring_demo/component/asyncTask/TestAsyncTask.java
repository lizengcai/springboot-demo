package com.example.spring_demo.component.asyncTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * TestAsyncTask
 *
 * @author lizengcai
 * @date 2019/12/31
 */
@Component
@Async
public class TestAsyncTask {
    public void test1(){
        System.out.println("async test1");
    }

    public Future<String> test2(){
        System.out.println("async test2");
        return new AsyncResult<>("AAA");
    }

}
