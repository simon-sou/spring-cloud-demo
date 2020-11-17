## 官网 ##
https://spring.io/projects/spring-cloud-config#learn
## 初始化 ##
### 依赖包 ###
org.springframework.cloud:spring-cloud-config-server  （configServer）
org.springframework.cloud:spring-cloud-starter          (springCloud)
org.springframework.boot:spring-boot-starter-actuator  (acturator的包)
### 启动类 ###     
@Configuration              
@SpringBootApplication      （SpringBoot的应用）
@EnableConfigServer         （运行为configServer）
###配置文件###
spring.application.name=configserver (cloud app-name)
##配置文件 从本地获取##
配置文件配置： spring:.profiles.include=native(包含)，spring:.profiles.active=native(直接使用)
spring.cloud.config.server.native.search-locations:  配置文件搜索路径： 支持 classpath. file;  resources中的配置文件： /xxx
http获取： {{origin}}/configserver/app1/dev,test/

