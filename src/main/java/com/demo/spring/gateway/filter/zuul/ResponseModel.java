package com.demo.spring.gateway.filter.zuul;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ResponseModel {

    private int code;
    private String message;
    private Object data;

    public ResponseModel(ResponseType type, Object data){
        this.code = type.getCode();
        this.message = type.getMessage();
        this.data = data;
    }
}
