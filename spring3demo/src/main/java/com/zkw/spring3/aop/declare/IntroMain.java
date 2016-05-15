package com.zkw.spring3.aop.declare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/5/15 0015.
 */
public class IntroMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        GreetingImpl greeting = (GreetingImpl)context.getBean("greetingIntroProxy");
        //将目标类强制向上转型为Apology接口（这是引入增强给我们带来的特性，也就是“接口动态实现”的功能）
        Apology apology = (Apology)greeting;
        apology.saySorry("jack");
    }
}
