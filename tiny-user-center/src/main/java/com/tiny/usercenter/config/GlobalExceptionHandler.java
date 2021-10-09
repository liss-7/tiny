package com.tiny.usercenter.config;

import com.tiny.models.base.ResultEnum;
import com.tiny.models.base.ReturnBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sensen.li@onecontract-cloud.com
 * @date 2021/10/9 16:23
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 文件超大异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MaxUploadSizeExceededException.class)
    @ResponseBody
    public ReturnBean<?> maxUploadSizeExceededHandler(HttpServletRequest req, MaxUploadSizeExceededException e){
        logger.error(">>> file upload out of limit ! {}",e.getLocalizedMessage());
        return ReturnBean.ok(ResultEnum.UPLOAD_OUT_OF_LIMIT);
    }

}
