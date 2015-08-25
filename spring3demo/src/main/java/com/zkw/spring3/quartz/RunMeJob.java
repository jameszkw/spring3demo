package com.zkw.spring3.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ClassName: RunMeJob
 * @Description: With Spring, you can declare Quartz job in two ways :
 *  1. MethodInvokingJobDetailFactoryBean
	This is the simplest and straightforward method, suitable for simple scheduler.
	2. JobDetailBean
	2.1 The QuartzJobBean is more flexible and suitable for complex scheduler. 
	You need to create a class extends the Spring’s QuartzJobBean, 
	and define the method you want to schedule in executeInternal() method, 
	and pass the scheduler task (RunMeTask) via setter method.
	
	2.2 Configure the target class via jobClass and method to run via jobDataAsMap.
	<bean name="runMeJob" class="org.springframework.scheduling.quartz.JobDetailBean">
	<property name="jobClass" value="com.mkyong.common.RunMeJob" />
	<property name="jobDataAsMap">
		<map>
			<entry key="runMeTask" value-ref="runMeTask" />
		</map>
	</property>
</bean>
 * @author James.zhang
 * @date 2015年8月23日 下午12:24:24
 *
 */
public class RunMeJob extends QuartzJobBean {
	private RunMeTask runMeTask;

	public void setRunMeTask(RunMeTask runMeTask) {
		this.runMeTask = runMeTask;
	}

	protected void executeInternal(JobExecutionContext context)
		throws JobExecutionException {
		runMeTask.printMe();
	}
}
