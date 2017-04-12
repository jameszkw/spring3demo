package com.zkw.spring3.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor接口的方法
 *
 * @author James
 * @create 2017-04-12 上午 10:32
 **/

public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        System.out.println("这是BeanPostProcessor实现类构造器！！");
    }
    //第一个参数都是要处理的Bean对象，第二个参数都是Bean的name
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        return o;
    }
    //第一个参数都是要处理的Bean对象，第二个参数都是Bean的name
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        return o;
    }
}
