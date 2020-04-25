package com.tiny.common.threadpool;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ExecutorConfig.class)
public @interface EnableThreadPool {
}
