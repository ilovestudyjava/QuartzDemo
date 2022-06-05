package com.tbbstu.Quartz;

import com.tbbstu.Utils.DateUtil;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;


@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class QuartzJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        try {
            Thread.sleep(2000);
            System.out.println(context.getScheduler().getSchedulerInstanceId());

            System.out.println("我被成功触发拉("+context.getJobDetail().getJobDataMap().getString("Content")+")");
            System.out.println("执行时间=" + DateUtil.getDateTimeFormat());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
