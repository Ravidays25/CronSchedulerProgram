package com.java.cronscheduler.CronSchedulerProgram;

import java.io.IOException;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Job2 implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Job2 --->>> Hello gee! Time is " + new Date());
		try {
			System.out.println("shell scripst started");
			Runtime.getRuntime().exec("sh ./sample.sh");
			System.out.println("shell scripst End");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
