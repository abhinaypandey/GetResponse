package com.amgen.getResponse.service.dataExchange;
import java.util.ResourceBundle;

import org.quartz.*;
import org.quartz.core.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.quartz.JobDetail;
import org.quartz.CronTrigger;

import com.amgen.getResponse.utility.GetResponseLog;
import com.amgen.getResponse.utility.GetResponseLoggerFactory;

import sun.rmi.runtime.Log;


public class CronJob {
	CronJob(){
		
		try {
			ResourceBundle bundle=ResourceBundle.getBundle("properties.cron");
			String cronExpression=bundle.getString("cronExpression");
			if(CronExpression.isValidExpression(cronExpression)){
				JobDetail jd=JobBuilder
						.newJob(DataTransferJob.class)
						.withIdentity("EncryptionJob")
						.build();
				
				Trigger t=TriggerBuilder
						.newTrigger()
						.withIdentity("EncryptionJob")
						.withSchedule(CronScheduleBuilder.cronSchedule(cronExpression))
						.build();
				
				SchedulerFactory sf=new StdSchedulerFactory();
				Scheduler sched=sf.getScheduler();
				sched.start();
				sched.scheduleJob(jd, t);
			}
			
			else{
				GetResponseLog log=GetResponseLoggerFactory.getLog("GetResponseLog");
				log.error("Invalid cron Expression");
				System.out.println("Invalid cron Expression");
			}
			
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
	}
	
	public static void main(String arg[]){
		new CronJob();
	}
}

