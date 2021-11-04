package com.tiny.usercenter.service.impl;

import com.tiny.usercenter.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author sensen.li@onecontract-cloud.com
 * @date 2021/10/15 16:21
 */
@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String test() {
        logger.warn(">>> parent method !");
        return "UserServiceImpl";
    }
}
