package com.zkw.spring3.aop.declare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
//        greeting.sayHello();
        greeting.sayHelloExcep();
    }
}
