package com.zkw.spring3.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @ClassName: AfterAOPInterceptor
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月25日 下午12:08:05
 *
 */
public class AfterAOPInterceptor implements AfterReturningAdvice {
	public void afterReturning(Object value, Method method, Object[] args,
			Object instance) throws Throwable {
		System.out.println("after()" + method.getName());
	}
}
