package cn.bd.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@MapperScan("cn.bd.springcloud.dao")
@EnableEurekaClient //服务注册到Eureaka
@EnableCircuitBreaker //Hystrix熔断器
@SpringBootApplication
public class Application_Hystrix_8001 {

    public static void main(String[] args) {
        SpringApplication.run(Application_Hystrix_8001.class, args);
    }

}

