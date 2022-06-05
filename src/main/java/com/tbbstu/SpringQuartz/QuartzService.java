package com.tbbstu.SpringQuartz;

import com.tbbstu.Utils.DateUtil;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/6/5 11:11:37
 */
@EnableScheduling
@Component
public class QuartzService {

    /**
     * 每一小时执行一次
     * @return
     */
    @Scheduled(cron = "0 0 */1 * * ?")
    public void task1(){
        System.out.println(DateUtil.getDateTimeFormat()+"----------"+"我被触发啦(每一小时执行一次)");
    }

    /**
     * 每2分钟执行一次
     * @return
     */
    @Scheduled(cron = "0 */2 * * * ?")
    public void task2(){
        System.out.println(DateUtil.getDateTimeFormat()+"----------"+"我被触发啦(每2分钟执行一次)");

    }

    /**
     * 每5秒钟执行一次
     * @return
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void task3() {
        System.out.println(DateUtil.getDateTimeFormat() + "----------" + "我被触发啦(每5秒钟执行一次)");
    }

    /**
     * 每天凌晨1:30执行一次
     * @return
     */
    @Scheduled(cron = "* 30 1 * * ?")
    public void task4(){
        System.out.println(DateUtil.getDateTimeFormat()+"----------"+"我被触发啦(每天凌晨1:30执行一次)");
    }

}

