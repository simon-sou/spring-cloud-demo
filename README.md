# spring-cloud-demo #

## 官网 ##
https://spring.io/projects/spring-cloud
## 简介 ##
spring cloud是一个提供全套的分布式系统解决方案。
本项目主要整合所有的springCloud功能
## 主要项目
### Spring Cloud Config
配置管理中心,可以配置spring的配置文件。也可以配置git仓库。

只要Spring Boot Actuator和Spring Config Client在类路径上，任何Spring Boot应用程序都将尝试与http://localhost:8888上的配置服务器联系，该服务器是spring.cloud.config.uri的默认值
本地启动可以设置spring.profiles.active: native。便不寻找响应的配置文件。只走native～