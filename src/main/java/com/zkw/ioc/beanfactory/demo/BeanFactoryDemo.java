/**
 * 
 */
package com.zkw.ioc.beanfactory.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @ClassName: BeanFactoryDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月8日 下午3:22:03
 *
 */
public class BeanFactoryDemo {
	private void beanFactoryTest(){
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:beans.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		System.out.println("init factory");
		Car car = bf.getBean("car", Car.class);
		System.out.println(car.getBrand());
		
	}
	public static void main(String[] args) {
		BeanFactoryDemo demo = new BeanFactoryDemo();
		demo.beanFactoryTest();
	}
}
