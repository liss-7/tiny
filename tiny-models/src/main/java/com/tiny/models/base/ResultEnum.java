package com.tiny.models.base;

import lombok.Getter;
import lombok.Setter;

public enum ResultEnum {
    //
    SUCCESS("200","成功"),FAIL("400","失败"),UNAUTH("-1000","未认证"),
    UPLOAD_OUT_OF_LIMIT("413","文件超大"),
    ;

    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String msg;

    private ResultEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

}
