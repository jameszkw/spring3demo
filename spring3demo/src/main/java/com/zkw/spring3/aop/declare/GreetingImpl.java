package com.zkw.spring3.aop.declare;


import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
@Component
public class GreetingImpl implements Greeting {
    public void sayHello(){
        System.out.println("hello... ...");
    }

    public void sayHelloExcep(){
        System.out.println("excep hello... ...");
        throw new RuntimeException("error");
    }
}
