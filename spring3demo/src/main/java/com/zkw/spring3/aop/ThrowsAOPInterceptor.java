package com.zkw.spring3.aop;

import java.lang.reflect.Method;

import javax.security.auth.login.AccountException;

import org.springframework.aop.ThrowsAdvice;

/**
 * @ClassName: ThrowsAOPInterceptor
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月25日 下午12:08:54
 *
 */
public class ThrowsAOPInterceptor implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object instance,
			AccountException ex) throws Throwable {
		System.out.println("after()" + method.getName() + "throws exception:"
				+ ex);
	}

	public void afterThrowing(NullPointerException ex) throws Throwable {
		System.out.println("throws exception:" + ex);
	}
}
