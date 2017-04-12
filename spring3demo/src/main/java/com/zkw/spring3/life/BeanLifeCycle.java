package com.zkw.spring3.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的生命周期
 *
 * @author James
 * @create 2017-04-12 上午 10:59
 **/

public class BeanLifeCycle {
    public static void main(String[] args) {
        System.out.println("现在开始初始化容器");
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring3/life/life.xml");
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        Person person = ctx.getBean("person",Person.class);
        System.out.println(person);
        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
    }
}
