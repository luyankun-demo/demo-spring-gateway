package com.demo.spring.gateway.filter.zuul;

import com.demo.spring.gateway.filter.FilterManager;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
@Slf4j
@Component
public class ZuulPreFilter extends CustomerZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("进入网关前置处理逻辑....");
        RequestContext context = RequestContext.getCurrentContext();
        FilterManager.run(context);
        return null;
    }
}
