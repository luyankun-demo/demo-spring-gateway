package com.demo.spring.gateway.filter;

import com.netflix.zuul.context.RequestContext;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
public interface CustomerFilter {

    boolean run(RequestContext context);
}
