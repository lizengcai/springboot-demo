package com.example.spring_demo.component.autoTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * TestAutoTask
 *
 * @author lizengcai
 * @date 2019/12/30
 */
@Component
public class TestAutoTask {

    @Scheduled(fixedDelay=5000)
    public void test() throws  Exception{
        System.out.println("111112222");
        Thread.sleep(10000);
    }
}
