package com.zkw.spring3.aop.simple;

import com.zkw.spring3.aop.declare.GreetingAroundAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class AdviceMain {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        //单独实现前置增强与后置增强
//        proxyFactory.addAdvice(new GreetingBeforeAdvice());
//        proxyFactory.addAdvice(new GreetingAfterAdvice());

        //用同一个类实现前置增强与后置增强
//        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());

        //环绕增强
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello();
    }
}
