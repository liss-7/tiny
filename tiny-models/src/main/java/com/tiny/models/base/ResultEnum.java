package com.tiny.models.base;

import lombok.Getter;
import lombok.Setter;

/**
 * 返回枚举
 * @author liss
 */
public enum ResultEnum {
    // 返回类型
    SUCCESS("200","成功"),FAIL("400","失败"),UNAUTH("-1000","未认证");

    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String msg;

    ResultEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

}
