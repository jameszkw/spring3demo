package com.zkw.spring3.aop.declare;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/5/15 0015.
 */
@Component
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor implements Apology {
    public void saySorry(String name) {
        System.out.println("sorry! "+name);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }
}
