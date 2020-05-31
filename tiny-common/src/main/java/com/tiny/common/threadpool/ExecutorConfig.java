package com.tiny.common.threadpool;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author liss
 */
@EnableConfigurationProperties(value = ThreadPoolConfig.class)
public class ExecutorConfig {

    Log log = LogFactory.getLog(ExecutorConfig.class);

    @Autowired
    private ThreadPoolConfig config;

    @Bean
    public Executor asyncServiceExecutor(){
        log.info("初始化线程池 - >" + config.getThreadPrefix() + "");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(config.getCorePoolSize());
        executor.setMaxPoolSize(config.getMaxPoolSize());
        executor.setQueueCapacity(config.getQueueCapacity());
        executor.setThreadNamePrefix(config.getThreadPrefix());
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        //初始化init
        executor.initialize();
        return executor;
    }

}
