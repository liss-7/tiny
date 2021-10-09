package com.tiny.models.base;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@AllArgsConstructor
public class ReturnBean<T> {
    private String code;
    private String msg;
    private String responseTime;
    private T data;

    private static final class InnerClass {
        private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    private ReturnBean(String code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.responseTime = InnerClass.DTF.format(LocalDateTime.now());
    };

    private ReturnBean(String code,String msg){
        this.code = code;
        this.msg = msg;
        this.responseTime = InnerClass.DTF.format(LocalDateTime.now());
    };

    public static ReturnBean<?> ok(ResultEnum resultEnum){
        return new ReturnBean<>(resultEnum.getCode(),resultEnum.getMsg());
    }

    public static ReturnBean<?> ok(ResultEnum resultEnum, Object data){
        return new ReturnBean<>(resultEnum.getCode(),resultEnum.getMsg(),data);
    }

}
