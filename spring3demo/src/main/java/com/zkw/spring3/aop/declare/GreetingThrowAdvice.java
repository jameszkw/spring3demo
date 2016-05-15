package com.zkw.spring3.aop.declare;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.asm.commons.Method;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
@Component
public class GreetingThrowAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method,Object[] args,Object target,Exception e){
        System.out.println("exception--------------");
        System.out.println("target class: "+target.getClass().getName());
        System.out.println("method name: "+method.getName());
        System.out.println("exception: "+ e.getMessage());
    }
}
