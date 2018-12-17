package com.demo.spring.gateway.filter.zuul;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
public enum ResponseType {

    SUCCESS(200, "请求已处理！"),
    SYSTEM_ERROR(500, "系统内部处理错误！")
    ;

    private int code;
    private String message;
}
