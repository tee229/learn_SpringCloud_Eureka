# SpringCloud_Eureka04
### 软件服务工程实验四
#### 一、	实验目的
（1）	掌握SpringCloud微服务架构基础知识。  

（2）	了解微服务API网关的基本作用。  

（3）	熟知Spring Cloud Gateway的基本原理和作用。  

（4）	掌握微服务API网关Gateway的路由配置、断言配置与过滤器配置。  

（5）	掌握微服务API网关Gateway的负载均衡和容错保护的配置与实现。
#### 二、实验要求
（1）	SpringCloud版本必须为2022.0.0以上（即Kilburn），建议采用最新版本2022.0.2。  

（2）	SpringBoot版本必须为3.0.0以上，建议采用最新版本3.0.5。  

（3）	实验代码请上传GitHub，并将链接提供到实验报告中。  

（4）	请自行完成实验内容，切勿抄袭。
#### 三、实验内容
（1）	使用IntelliJ IDEA新建Maven子工程，从而搭建微服务API网关Gateway服务，导入spring-cloud-starter-gateway依赖。  

（2）	为微服务API网关Gateway项目创建主启动类与配置文件。  

（3）	将微服务API网关Gateway服务注册到服务注册中心，并展示结果。  

（4）	为之前创建的微服务创建对应动态路由，完成id、uri和对应predicates的配置。  

（5）	展示微服务API网关Gateway的配置效果，展示微服务API网关Gateway的请求路由功能。  

（6）	为微服务API网关Gateway配置负载均衡(lb://)并展示负载均衡效果。  

（7）	为微服务API网关Gateway配置全局过滤器，实现权限认证过程，展示全局认证过滤器的作用。  

（8）	为微服务API网关Gateway配置全局跨域策略，并解释具体配置的含义。  

（9）	为微服务API网关Gateway配置容错机制，实现服务熔断保护、流量管控等策略，展示容错机制的具体效果（可使用JMeter并发测试工具完成）。  

（10）	将工程上传GitHub个人账号并粘贴地址。
