package com.zkw.spring3.aop.simple;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class GreetingBeforeAndAfterAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("ba before... ...");

    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("ba after... ...");
    }
}
