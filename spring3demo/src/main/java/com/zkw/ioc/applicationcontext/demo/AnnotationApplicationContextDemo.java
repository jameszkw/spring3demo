/**
 * 
 */
package com.zkw.ioc.applicationcontext.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zkw.ioc.beanfactory.demo.Car;

/**
 * @ClassName: AnnotationApplicationContext
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月8日 下午3:44:44
 *
 */
public class AnnotationApplicationContextDemo {
	private void annotationApplicationContextTest(){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car = ctx.getBean("car", Car.class);
		System.out.println(car.getBrand());
		
	}
	public static void main(String[] args) {
		AnnotationApplicationContextDemo demo = new AnnotationApplicationContextDemo();
		demo.annotationApplicationContextTest();
	}
}
