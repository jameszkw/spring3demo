/**
 * 
 */
package com.zkw.ioc.applicationcontext.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zkw.ioc.beanfactory.demo.Car;

/**
 * @ClassName: Beans
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月8日 下午3:46:46
 *
 */
@Configuration
public class Beans {
	@Bean(name="car")
	public Car buildCar(){
		Car car = new Car();
		car.setBrand("布迪威龙");
		car.setColor("black");
		car.setMaxSpeed("500");
		return car;
	}
}
