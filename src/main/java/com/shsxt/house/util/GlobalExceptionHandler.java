package com.shsxt.house.util;

import com.shsxt.house.exception.ParamsException;
import com.shsxt.house.po.vo.ResultInfo;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultInfo exceptionResolver(Exception e){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setCode(300);
        resultInfo.setMsg("系统异常");
        return resultInfo;
    }
    @ExceptionHandler(value = ParamsException.class)
    @ResponseBody
    public ResultInfo paramsExceptionResolver(ParamsException p){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setCode(p.getCode());
        resultInfo.setMsg(p.getMsg());
        return resultInfo;
    }
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResultInfo bindExceptionResolver(BindException e){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setCode(300);
        resultInfo.setMsg(e.getBindingResult().getFieldError().getDefaultMessage());
        return resultInfo;
    }
}
