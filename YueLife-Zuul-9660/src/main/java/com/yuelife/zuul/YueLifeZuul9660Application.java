package com.yuelife.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication(scanBasePackages = "com.yuelife.zuul")
@EnableZuulProxy
@EnableEurekaClient
@EnableRedisHttpSession
public class YueLifeZuul9660Application {

    public static void main(String[] args) {
        SpringApplication.run(YueLifeZuul9660Application.class, args);
    }

}

