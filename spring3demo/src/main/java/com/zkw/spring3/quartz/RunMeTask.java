package com.zkw.spring3.quartz;

/**
 * @ClassName: RunMeTask
 * @Description: this is the class you want to schedule in Quartz.
 * @author James.zhang
 * @date 2015年8月23日 下午12:21:05
 *
 */
public class RunMeTask {
	public void printMe() {
		System.out.println("Spring 3 + Quartz 1.8.6 ~");
	}
}
