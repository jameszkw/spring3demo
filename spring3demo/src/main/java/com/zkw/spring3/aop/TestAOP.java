package com.zkw.spring3.aop;

/**
 * @ClassName: TestAOP
 * @Description: 想要被拦截的类
 * @author James.zhang
 * @date 2015年8月25日 下午12:05:27
 *
 */
public class TestAOP implements IService {
	private String name;

	public void withAop() {
		System.out.println("with AOP name:" + name);
	}

	public void withoutAop() {
		System.out.println("without AOP name:" + name);
	}

	public String getName() {
		System.out.println("getName:" + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}
}
