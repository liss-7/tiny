package com.tiny.usercenter.fosun.buriedpoint.controller;

import com.tiny.models.base.ReturnBean;
import com.tiny.models.user.UserInfo;
import com.tiny.usercenter.fosun.buriedpoint.dao.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.tiny.usercenter.fosun.buriedpoint.constants.BaseConstants.REST_API_PREFIX;

/**
 * <Description> <br>
 *
 * @author liss
 * @createTime 2021年05月12日 11:36:00
 */
@RestController
@RequestMapping(REST_API_PREFIX + "userinfo")
@Api(value = "用户数据收集")
public class UserInfoCollectController {

    private final static Logger logger= LoggerFactory.getLogger(UserInfoCollectController.class);

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/collect")
    @ApiOperation(value = "用户数据收集", notes = "用户数据收集，RestFul风格的请求")
    @ApiImplicitParams({@ApiImplicitParam(name = "json", value = "上报json", required = true, dataType = "json"),
    })
    public ReturnBean collect(@RequestBody UserInfo userInfo) {
        logger.warn(">>> request param is :{} ",userInfo);
        userMapper.insertUser(userInfo);
        return ReturnBean.ok();
    }
}
