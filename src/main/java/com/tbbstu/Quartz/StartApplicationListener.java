package com.tbbstu.Quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Scheduler scheduler;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        //修改 30 分钟内还未支付完成的订单状态为失败状态
//        try {
//            TriggerKey triggerKey = TriggerKey.triggerKey("update","g10");
//            Trigger trigger = scheduler.getTrigger(triggerKey);
//            if(trigger == null){
//                trigger = TriggerBuilder.newTrigger()
//                        .withIdentity(triggerKey)
//                        .withSchedule(CronScheduleBuilder.cronSchedule("*/15 * * * * ?"))
//                        .startNow()
//                        .build();
//                JobDetail jobDetail = JobBuilder.newJob(QuartzOrder.class)
//                        .withIdentity("update","g10")
//                        .usingJobData("Content","修改 30 分钟内还未支付完成的订单状态为失败状态")
//                        .build();
//                scheduler.scheduleJob(jobDetail,trigger);
//            }
//            scheduler.start();
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }


//        try {
//            //每 1 小时触发一次定时器：控制台输出内容“我被成功触发拉（每1 小时）
//            TriggerKey triggerKey = TriggerKey.triggerKey("OneHour","g1");
//            Trigger trigger = scheduler.getTrigger(triggerKey);
//            if(trigger == null){
//                trigger = TriggerBuilder.newTrigger()
//                        .withIdentity(triggerKey)
//                        .withSchedule(CronScheduleBuilder.cronSchedule("0 0 */1 * * ?"))
//                        .startNow()
//                        .build();
//                JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class)
//                        .withIdentity("OneHour","g1")
//                        .usingJobData("Content","每一小时")
//                        .build();
//                scheduler.scheduleJob(jobDetail,trigger);
//
//
//
//            }
//            //每 2 分钟触发一次定时器：控制台输出内容“我被成功触发拉（每2 分钟）
//            TriggerKey triggerKey2 = TriggerKey.triggerKey("TwoMinute","g2");
//            Trigger trigger2 = scheduler.getTrigger(triggerKey2);
//            if(trigger2 == null) {
//                trigger2 = TriggerBuilder.newTrigger()
//                        .withIdentity(triggerKey2)
//                        .withSchedule(CronScheduleBuilder.cronSchedule("0 */2 * * * ?"))
//                        .startNow()
//                        .build();
//                JobDetail jobDetail2 = JobBuilder.newJob(QuartzJob.class)
//                        .withIdentity("TwoMinute", "g2")
//                        .usingJobData("Content","每2分钟")
//                        .build();
//                scheduler.scheduleJob(jobDetail2, trigger2);
//            }
//
//
//            //每 5 秒钟触发一次定时器：控制台输出内容“我被成功触发拉（每5 秒钟）
//            TriggerKey triggerKey3 = TriggerKey.triggerKey("FiveSecond","g5");
//            Trigger trigger3 = scheduler.getTrigger(triggerKey3);
//            if(trigger3 == null) {
//                trigger3 = TriggerBuilder.newTrigger()
//                        .withIdentity(triggerKey3)
//                        .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
//                        .startNow()
//                        .build();
//                JobDetail jobDetail3 = JobBuilder.newJob(QuartzJob.class)
//                        .withIdentity("FiveSecond", "g5")
//                        .usingJobData("Content","每5秒钟")
//                        .build();
//                scheduler.scheduleJob(jobDetail3, trigger3);
//            }
//
//            //每天凌晨 1:30 触发一次定时器：控制台输出内容“我被成功触发拉(凌晨1：30)
//            TriggerKey triggerKey4 = TriggerKey.triggerKey("1:30","g4");
//            Trigger trigger4 = scheduler.getTrigger(triggerKey4);
//            if(trigger4 == null) {
//                trigger4 = TriggerBuilder.newTrigger()
//                        .withIdentity(triggerKey4)
//                        .withSchedule(CronScheduleBuilder.cronSchedule("* 30 1 * * ?"))
//                        .startNow()
//                        .build();
//                JobDetail jobDetail4 = JobBuilder.newJob(QuartzJob.class)
//                        .withIdentity("1:30", "g4")
//                        .usingJobData("Content","每天凌晨1:30")
//                        .build();
//                scheduler.scheduleJob(jobDetail4, trigger4);
//            }
//                scheduler.start();
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
    }
}
