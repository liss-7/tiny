package com.tiny.usercenter;

import com.tiny.common.threadpool.EnableThreadPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableThreadPool
@EnableOpenApi
@MapperScan("com.tiny.usercenter.fosun.buriedpoint.dao")
public class UserCenterApp {
    public static void main(String[] args){
        SpringApplication.run(UserCenterApp.class, args);
    }
}

