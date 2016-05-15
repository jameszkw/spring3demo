package com.zkw.spring3.aop.simple;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/14 0014.
 * aop前置增强
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before... ...");
    }
}
