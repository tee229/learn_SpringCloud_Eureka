# SpringCloud_Eureka02
### 软件服务工程实验二
#### 一、实验目的
（1）	掌握SpringCloud微服务架构基础知识。  

（2）	了解远程服务调用的基本原理。  

（3）	了解负载均衡的基本概念与原理  

（4）	掌握基于RestTemplate调用RESTful服务的方法。  

（5）	掌握基于OpenFeign的远程服务调用方法。  

（6）	掌握基于Spring Cloud LoadBalancer的客户端负载均衡配置方法。  

（7）	掌握负载均衡策略的自定义方法。
#### 二、实验要求
（1）	SpringCloud版本必须为2022.0.0以上（即Kilburn），建议采用最新版本2022.0.2。  

（2）	SpringBoot版本必须为3.0.0以上，建议采用最新版本3.0.5。  

（3）	实验代码请上传GitHub，并将链接提供到实验报告中。  

（4）	请自行完成实验内容，切勿抄袭。
#### 三、实验内容
（1）	使用SpringCloud提供的RestTemplate类完成服务消费者与服务提供者之间的RESTful服务调用（要求至少包含GET、POST、PUT、DELETE方法各一个）并展示结果，服务提供者的方法可自行确定。  

（2）	在服务消费者项目中导入OpenFeign依赖，在主启动类中添加Feign支持注解。  

（3）	在服务消费者项目中创建调用服务提供者相关微服务的FeignClient接口。  

（4）	在服务消费者项目中使用定义的FeignClient完成基于OpenFeign的远程服务调用，并展示结果。  

（5）	分析OpenFeign与RestTemplate的异同点，并总结OpenFeign的主要优势。  

（6）	使用IntelliJ IDEA新建Maven子工程，创建搭建多个服务提供者集群（每个服务使用不同端口号）。  

（7）	使用Spring Cloud LoadBalancer组件为服务消费者项目配置客户端负载均衡机制（默认为轮询策略），展示负载均衡效果。  

（8）	修改服务消费者的客户端负载均衡策略为随机策略，展示负载均衡效果。  

（9）	将工程上传GitHub个人账号并粘贴地址。  

（10）	选做题：有能力的同学请基于Spring Cloud LoadBalancer组件自定义一种新的负载均衡策略并展示其效果（即上述7过程的补充），完成后予以大量加分。
