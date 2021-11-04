package com.tiny.usercenter.controller;

import com.tiny.common.threadpool.ExecutorConfig;
import com.tiny.common.threadpool.ThreadPoolConfig;
import com.tiny.models.base.ResultEnum;
import com.tiny.models.base.ReturnBean;
import com.tiny.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("UserBaseController.v1")
@RequestMapping("/base/v1")
public class UserBaseController {

    @Autowired
    ThreadPoolConfig config;

    @Autowired
    ExecutorConfig executor;

    @Autowired
    private UserService userService;

    @Value("${info.amd}")
    private String coreSize;

    @GetMapping("/language")
    public ReturnBean<String> language(){
        return ReturnBean.ok(coreSize);
    }

    @GetMapping("/test")
    public ReturnBean<String> test(){
        String test = userService.test();
        return ReturnBean.ok(test);
    }

}
