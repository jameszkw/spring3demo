package com.zkw.spring3.aop;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName: TestMain
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月25日 下午12:14:13
 *
 */
public class TestMain {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("aop2.xml"));
		IService hello = (IService) factory.getBean("aopProxy");
		hello.withAop();
		hello.withoutAop();
	}
}
