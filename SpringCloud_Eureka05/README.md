# SpringCloud_Eureka05
### 软件服务工程实验五
#### 一、	实验目的
（1）	掌握Spring Cloud微服务架构基础知识。  

（2）	了解分布式消息队列的基本原理。  

（3）	熟知配置中心集群与消息总线的基本原理和作用。  

（4）	掌握Spring Cloud Config的配置与集群搭建方法。  

（5）	掌握RabbitMQ的安装配置和基本使用。  

（6）	掌握基于Spring Cloud Bus的配置动态刷新机制。
#### 二、实验要求
（1）	SpringCloud版本必须为2022.0.0以上（即Kilburn），建议采用最新版本2022.0.2。  

（2）	SpringBoot版本必须为3.0.0以上，建议采用最新版本3.0.5。  

（3）	实验代码请上传GitHub或Gitee，并将链接提供到实验报告中。  

（4）	请自行完成实验内容，切勿抄袭。
#### 三、实验内容
（1）	基于GitHub或Gitee搭建微服务配置文件代码仓库。  

（2）	基于IntelliJ IDEA克隆配置文件代码仓库，并完成身份认证。  

（3）	在配置文件项目中添加各微服务（服务提供者、服务消费者）的配置文件，并PUSH到远程代码仓库。  

（4）	使用IntelliJ IDEA新建Maven子工程，从而搭建Spring Cloud Config 配置中心。导入spring-cloud-starter-config和spring-cloud-config-server依赖，创建主启动类，并完成application.properties或application.yml的配置，注意代码仓库分支标签的配置。  

（5）	删除各微服务（服务提供者、服务消费者）的配置文件application.properties或application.yml，并创建bootstrap.properties或bootstrap.yml完成程序引导配置。请注意导入spring-cloud-starter-bootstrap依赖。  

（6）	测试Spring Cloud Config 配置中心的效果，并展示各微服务（服务提供者、服务消费者）的正常工作结果。  

（7）	将Spring Cloud Config 配置中心注册到服务注册中心，构建Spring Cloud Config 配置集群（实例数大于2）。需要展示配置中心集群的注册结果，各微服务通过服务注册中心寻找配置中心实例完成配置文件的加载和启动。  

（8）	安装RabbitMQ（需要首先具备Erlang语言环境）并启动管理后台，展示管理界面。  

（9）	修改Spring Cloud Config 配置中心的具体配置，整合Spring Cloud Bus和Spring Cloud Config，并以RabbitMQ作为分布式消息队列，实现动态配置刷新机制。请注意导入spring-cloud-bus、spring-cloud-stream-binder-rabbit、spring-boot-starter-actuator依赖。  

（10）	为各微服务的Controller增加@RefreshScope注解，标明配置更新域。  

（11）	修改远程仓库配置文件，使用Postman类似工具发送配置更新命令给Spring Cloud Bus，测试动态配置刷新机制的效果。  

（12）	将工程上传GitHub或Gitee个人账号并粘贴地址。
