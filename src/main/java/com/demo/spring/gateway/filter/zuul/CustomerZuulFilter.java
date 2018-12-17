package com.demo.spring.gateway.filter.zuul;

import com.netflix.zuul.ZuulFilter;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
public abstract class CustomerZuulFilter extends ZuulFilter {


    protected ResponseModel setResponse(int code, String message, Object data) {
        return new ResponseModel(code, message, data);
    }

    protected ResponseModel success(Object data) {
        return new ResponseModel(ResponseType.SUCCESS, data);
    }
}
