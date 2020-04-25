package com.tiny.usercenter.controller;

import com.tiny.common.threadpool.ExecutorConfig;
import com.tiny.common.threadpool.ThreadPoolConfig;
import com.tiny.models.base.ResultEnum;
import com.tiny.models.base.ReturnBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserBaseController {

    @Autowired
    ThreadPoolConfig config;

    @Autowired
    ExecutorConfig executor;

    @Value("${info.amd}")
    private String coreSize;

    @GetMapping("/test")
    public ReturnBean test(){
        return ReturnBean.ok(ResultEnum.SUCCESS);
    }

}
