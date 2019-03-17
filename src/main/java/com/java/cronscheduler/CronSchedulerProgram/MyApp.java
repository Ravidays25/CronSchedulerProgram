package com.java.cronscheduler.CronSchedulerProgram;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MyApp {

	public static void main(String[] args) {

		try {
			JobDetail job1 = JobBuilder.newJob(Job1.class).withIdentity("job1", "group1").build();
			JobDetail job2 = JobBuilder.newJob(Job2.class).withIdentity("job2", "group2").build();

			Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("cronTrigger1", "group1")
					.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
			Trigger trigger2 = TriggerBuilder.newTrigger().withIdentity("cronTrigger2", "group2")
					.withSchedule(CronScheduleBuilder.cronSchedule("0/7 * * * * ?")).build();
			
			Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
			scheduler1.start();
			scheduler1.scheduleJob(job1, trigger1);

			Scheduler scheduler2 = new StdSchedulerFactory().getScheduler();
			scheduler2.start();
			scheduler2.scheduleJob(job2, trigger2);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
