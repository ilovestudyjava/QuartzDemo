# QuartzDemo
#QuartzDemo说明书



## 1.环境

​	Jdk1.8、mysql连接8.0.20、Idea2020.1

## 2.测试

1. #### Git的Https链接: https://github.com/ilovestudyjava/QuartzDemo.git  拉取代码

2. #### 点开application.properties文件,输入正确的数据库用户名和密码

   ![image](https://user-images.githubusercontent.com/106589093/172035092-dd50ef17-ceb9-44ce-94ac-12a18ee960f8.png)

3. #### 打开tables_mysql.sql ，将里面的内容 粘贴 在 数据库查询器 中 执行。

  ![image](https://user-images.githubusercontent.com/106589093/172035100-ccdc142f-27ab-496b-a0d1-b412ceca27e8.png)

4. #### 默认采用Spirng自带的定时器，所以直接打开如下图Start类，点击执行。

  ![image](https://user-images.githubusercontent.com/106589093/172035111-6e0c78c0-302c-465c-830f-0ad6b4eda04e.png)

   ​	 执行结果:

    （1）由于1小时和每天凌晨1:30时间太长，所以没有测试

   ​		![image](https://user-images.githubusercontent.com/106589093/172035116-739fd0fa-2e47-4af6-9bb4-3fa8b39428ca.png)

5. #### 将spring自带的定时器代码注释

![image](https://user-images.githubusercontent.com/106589093/172035128-1e6f85cb-353e-4240-8438-a25ee2c9210c.png)

6. #### 打开Quart的定时器，把注释的代码不注释

  ![image](https://user-images.githubusercontent.com/106589093/172035137-ea722f71-48b0-463f-a620-01562b735a00.png)

7. #### 执行Start，查看Quartz执行结果如下

   30分钟后修改订单状态

   ![image](https://user-images.githubusercontent.com/106589093/172035146-c7520d38-9cc2-4188-9aa8-847d6b8d0703.png)
   
## 3.项目中文件的问题

   1.Caused by: java.lang.NoSuchMethodException: No setter for property 'txIsolationLevelReadCommitted'

   解决方案:困扰了3小时后，更换了springboot的版本（2.7   =>  2.3.1.RELEASE），解决问题

   2.Spring boot使用Quartz时Job中无法注入Bean (OrderService) 空指针异常问题

   解决方案:

   第一步:自定义BeanManager类实现ApplicationContextAware接口

   ![image](https://user-images.githubusercontent.com/106589093/172035154-022ee3c0-b955-4aa1-93b6-cf0d0946253d.png)

​	第二步:在Job中，添加Component注解，里面使用前面配置的类获取spring容器的orderService实例即可

​	![image](https://user-images.githubusercontent.com/106589093/172035156-eab1c105-b8e4-4655-913d-91eac861e56d.png)

## 4.spring定时器和Quartz区别

spring定时器缺点:不能解决指定了具体的年月日时分秒而执行的任务

Quartz 弥补了spring定时器的缺点，并且实现了java定时器和spring定时器的功能。
