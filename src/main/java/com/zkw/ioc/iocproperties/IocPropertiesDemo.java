/**
 * 
 */
package com.zkw.ioc.iocproperties;

import java.util.Map;

/**
 * @ClassName: IocPropertiesDemo
 * @Description:  通过依赖注入的方式获取Properties
 * @author James.zhang
 * @date 2015年8月9日 下午5:06:18
 *
 */
public class IocPropertiesDemo {
	private Map<String,String> properties;
	public IocPropertiesDemo(Map<String,String> map) {
		this.properties = map;
	}
	
	public String getPropertiesValue(String key){
		return properties.get(key);
	}
}
