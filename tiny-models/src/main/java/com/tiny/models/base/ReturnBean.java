package com.tiny.models.base;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
public class ReturnBean<T> {
    private String code;
    private String msg;
    private String responseTime;
    private T data;

    private ReturnBean(String code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.responseTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    };

    private ReturnBean(String code,String msg){
        this.code = code;
        this.msg = msg;
        this.responseTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    };

    public static ReturnBean ok(ResultEnum resultEnum){
        return new ReturnBean(resultEnum.getCode(),resultEnum.getMsg());
    }

    public static ReturnBean ok(ResultEnum resultEnum, Object data){
        return new ReturnBean(resultEnum.getCode(),resultEnum.getMsg(),data);
    }


}
