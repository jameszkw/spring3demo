package com.zkw.sourcecode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-11 下午 8:06
 **/

public class StrapBootSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:sourcecode/sourcecode.xml");
    }
}
