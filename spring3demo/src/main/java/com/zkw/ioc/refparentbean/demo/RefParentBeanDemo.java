/**
 * 
 */
package com.zkw.ioc.refparentbean.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: RefBeanDemo
 * @Description: 父容器、子容器
 * @author James.zhang
 * @date 2015年8月9日 下午8:27:57
 *
 */
public class RefParentBeanDemo {
	private void refBeanTest(){
		//父容器
		ClassPathXmlApplicationContext pFactory = new ClassPathXmlApplicationContext(new String[]{"beans1.xml"});
		//指定pFactory为该容器的父容器
		ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"beans2.xml"},pFactory);
		Boss boss = (Boss)factory.getBean("boss");
		System.out.println(boss.getCar().toString());
	}
	
	public static void main(String[] args) {
		RefParentBeanDemo demo = new RefParentBeanDemo();
		demo.refBeanTest();
	}
}
