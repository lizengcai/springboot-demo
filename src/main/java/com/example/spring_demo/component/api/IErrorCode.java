package com.example.spring_demo.component.api;

/**
 * 封装API的错误码
 * Created by macro on 2019/4/19.
 */
public interface IErrorCode {
    /**
     * 返回码
     * @return
     */
    long getCode();

    /**
     * 返回信息
     * @return
     */
    String getMessage();
}
