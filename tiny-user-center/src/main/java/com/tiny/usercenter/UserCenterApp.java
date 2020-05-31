package com.tiny.usercenter;

import com.tiny.common.threadpool.EnableThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liss
 */
@SpringBootApplication
@EnableThreadPool
public class UserCenterApp {
    public static void main(String[] args){
        SpringApplication.run(UserCenterApp.class, args);
    }
}

