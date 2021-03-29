package com.shsxt.house.config;

import com.shsxt.house.jobs.MyFirstJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    //job实例
    @Bean
    public JobDetail getJobDetail(){
        return JobBuilder.newJob(MyFirstJob.class).storeDurably().build();
    }
    //触发器job的执行
//    @Bean
//    public Trigger trigger01(){
//        SimpleScheduleBuilder simpleScheduleBuilder=SimpleScheduleBuilder.simpleSchedule()
//                //每秒执行一次
//                .withIntervalInSeconds(1)
//                //执行周期:永久执行
//                .repeatForever();
//        Trigger trigger= TriggerBuilder.newTrigger()
//                .withIdentity("trigger01","group01")
//                .withSchedule(simpleScheduleBuilder)
//                .forJob(getJobDetail())
//                .build();
//        return trigger;
//    }
//    @Bean
//    public Trigger trigger02(){
//        //每5秒
//        CronScheduleBuilder cronScheduleBuilder=CronScheduleBuilder.cronSchedule("0/5 * * * * ? *");
//        Trigger trigger=TriggerBuilder.newTrigger()
//                .withIdentity("trigger02","group01")
//                .withSchedule(cronScheduleBuilder)
//                .forJob(getJobDetail())
//                .build();
//        return trigger;
//    }
}
