package cn.itaz.doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 入口类
 */
@SpringBootApplication
@EnableEurekaServer   //开启服务端
public class EurekaApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7001.class,args);
    }
}