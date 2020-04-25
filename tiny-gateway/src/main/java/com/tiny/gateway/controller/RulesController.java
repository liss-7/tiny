package com.tiny.gateway.controller;

import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiDefinition;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.GatewayApiDefinitionManager;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.tiny.models.base.ResultEnum;
import com.tiny.models.base.ReturnBean;
import com.tiny.models.user.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class RulesController {

    @GetMapping("/api")
    @SentinelResource("api")
    public ReturnBean<Set<ApiDefinition>> apiRules() {
        return ReturnBean.ok(ResultEnum.SUCCESS,GatewayApiDefinitionManager.getApiDefinitions());
    }

    @GetMapping("/gateway")
    @SentinelResource("gateway")
    public ReturnBean<Set<GatewayFlowRule>> apiGateway() {
        return ReturnBean.ok(ResultEnum.UNAUTH);
    }

    @GetMapping("/flow")
    @SentinelResource("flow")
    public List<FlowRule> apiFlow() {
        return FlowRuleManager.getRules();
    }

    @GetMapping("/user/{id}")
    @SentinelResource("user")
    public ReturnBean<UserInfo> userInfo(@PathVariable Long id){
        UserInfo aa = new UserInfo().setId(id).setAccount("aa").setPassword("232");
        return ReturnBean.ok(ResultEnum.SUCCESS, aa);
    }
}
