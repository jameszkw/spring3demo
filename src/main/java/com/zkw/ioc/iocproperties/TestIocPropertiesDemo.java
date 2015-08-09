/**
 * 
 */
package com.zkw.ioc.iocproperties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.zkw.ioc.beanfactory.demo.Car;

/**
 * @ClassName: TestIocPropertiesDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月9日 下午5:19:19
 *
 */
public class TestIocPropertiesDemo {
	private void beanFactory(){
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:beans.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		System.out.println("init factory");
		IocPropertiesDemo iocPropertiesDemo = bf.getBean("iocproperties", IocPropertiesDemo.class);
		String value = iocPropertiesDemo.getPropertiesValue("a1");
		System.out.println(value);
	}
	public static void main(String[] args) {
		TestIocPropertiesDemo demo = new TestIocPropertiesDemo();
		demo.beanFactory();
	}
}
