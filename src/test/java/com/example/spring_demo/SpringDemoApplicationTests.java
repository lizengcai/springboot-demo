package com.example.spring_demo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDemoApplicationTests {

    @Test
    public void testOne(){
        System.out.println("test hello 1");
        TestCase.assertEquals(1, 1);

    }
    @Test
    public void testTwo(){
        System.out.println("test hello 2");
        TestCase.assertEquals(1, 1);

    }
    @Before
    public void testBefore(){
        System.out.println("before");
    }
    @After
    public void testAfter(){
        System.out.println("after");
    }

}
