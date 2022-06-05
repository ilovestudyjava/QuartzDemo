package com.tbbstu.Quartz;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/6/4 20:20:31
 */

import com.tbbstu.Service.OrderService;
import com.tbbstu.Service.OrderServiceImpl;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Component
public class QuartzOrder implements Job  {

    @Autowired(required = false)
    private OrderService orderService;
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        OrderService orderService = (OrderServiceImpl) BeanManager.getBean("orderService");
        try {
            int i = orderService.saveEditOrder();
            System.out.println(context.getJobDetail().getJobDataMap().getString("Content"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


}
