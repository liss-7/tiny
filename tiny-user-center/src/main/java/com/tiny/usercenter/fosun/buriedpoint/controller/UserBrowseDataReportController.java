package com.tiny.usercenter.fosun.buriedpoint.controller;

import com.alibaba.fastjson.JSONObject;
import com.tiny.models.base.ReturnBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.tiny.usercenter.fosun.buriedpoint.constants.BaseConstants.REST_API_PREFIX;

/**
 * <Description> <br>
 *
 * @author liss
 * @createTime 2021年05月12日 10:50:00
 */
@RestController
@RequestMapping(REST_API_PREFIX + "report")
@Api(value = "埋点数据上报")
public class UserBrowseDataReportController {

    @PostMapping("/buriedPoint")
    @ApiOperation(value = "埋点数据上报", notes = "埋点数据上报，RestFul风格的请求")
    @ApiImplicitParams({@ApiImplicitParam(name = "json", value = "上报json", required = true, dataType = "json"),
    })
    public ReturnBean dataReport(@RequestBody JSONObject param) {
        return ReturnBean.ok();
    }

}
