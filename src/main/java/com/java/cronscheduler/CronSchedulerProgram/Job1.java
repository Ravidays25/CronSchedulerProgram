package com.java.cronscheduler.CronSchedulerProgram;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Job1 implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Job1 --->>> Hello geeks! Time is " + new Date());
	}
	
	
}
