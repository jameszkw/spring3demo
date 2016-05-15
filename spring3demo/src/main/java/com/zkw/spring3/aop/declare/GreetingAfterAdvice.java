package com.zkw.spring3.aop.declare;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 声明式增强
 */
@Component
public class GreetingAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after... ...");
    }
}
