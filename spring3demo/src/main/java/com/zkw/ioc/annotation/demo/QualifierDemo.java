/**
 * 
 */
package com.zkw.ioc.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: QualifierDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月9日 下午10:16:41
 *
 */
@Service
public class QualifierDemo {
	@Autowired
	
	private Car car;
}
