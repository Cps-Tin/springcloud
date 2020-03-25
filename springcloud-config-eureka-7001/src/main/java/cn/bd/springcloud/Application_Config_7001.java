package cn.bd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


//EurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
@SpringBootApplication
public class Application_Config_7001
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application_Config_7001.class);
    }
}
