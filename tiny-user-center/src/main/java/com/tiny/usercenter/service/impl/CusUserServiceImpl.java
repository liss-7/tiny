package com.tiny.usercenter.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author sensen.li@onecontract-cloud.com
 * @date 2021/10/15 16:24
 */
@Service
@Primary
public class CusUserServiceImpl extends UserServiceImpl{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String test() {
        logger.warn(">>> CusUserServiceImpl method !");
        return "CusUserServiceImpl";
    }
}
