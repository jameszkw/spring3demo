package com.zkw.spring3.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @ClassName: BeforeAOPInterceptor
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月25日 下午12:06:49
 *
 */
public class BeforeAOPInterceptor implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object instance)
			throws Throwable {
		System.out.println("before()" + method.getName());
	}
}
