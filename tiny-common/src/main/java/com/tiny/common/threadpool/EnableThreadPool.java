package com.tiny.common.threadpool;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 线程池注解
 * @author liss
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ExecutorConfig.class)
public @interface EnableThreadPool {
}
