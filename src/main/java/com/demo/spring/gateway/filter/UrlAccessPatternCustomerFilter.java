package com.demo.spring.gateway.filter;

import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
@Slf4j
public class UrlAccessPatternCustomerFilter implements CustomerFilter {

    private static final String[] ACCESS_PATTERN;

    static {
        ACCESS_PATTERN = new String[]{
            "/demo/api"
        };
    }

    @Override
    public boolean run(RequestContext context) {
        log.info("处理资源访问过滤器.....");
        HttpServletRequest request = context.getRequest();
        String uri = request.getRequestURI();
        log.info("请求地址为:{}", uri);
        for (String pattern : ACCESS_PATTERN) {
            if (pattern.startsWith("/*") || pattern.contains(uri)) {
                return true;
            }
        }
        return false;
    }
}
