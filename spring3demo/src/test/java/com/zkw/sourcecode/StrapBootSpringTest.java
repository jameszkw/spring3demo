package com.zkw.sourcecode;

import com.zkw.sourcecode.bean.Phone;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-11 下午 8:11
 **/

public class StrapBootSpringTest {
    @Test
    public void testStartSpring(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:sourcecode/sourcecode.xml");

    }
    @Test
    public void testSeperateStart(){
        ClassPathResource res=new ClassPathResource("sourcecode/sourcecode.xml");
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        Phone phone=(Phone)factory.getBean("");
    }
}
