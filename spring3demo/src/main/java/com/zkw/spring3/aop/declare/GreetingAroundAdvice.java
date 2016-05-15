package com.zkw.spring3.aop.declare;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 声明式增强
 */
@Component
public class GreetingAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("around before ... ...");
        Object result = methodInvocation.proceed();
        System.out.println("around after ... ...");
        return result;
    }
}
