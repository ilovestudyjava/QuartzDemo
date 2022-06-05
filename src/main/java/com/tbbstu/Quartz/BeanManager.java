package com.tbbstu.Quartz;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/6/5 01:1:14
 */
@Component
public class BeanManager implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanManager.applicationContext = applicationContext;
    }
    public static Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }


}
