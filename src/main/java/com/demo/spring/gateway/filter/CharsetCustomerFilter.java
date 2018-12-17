package com.demo.spring.gateway.filter;

import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
@Slf4j
public class CharsetCustomerFilter implements CustomerFilter {

    /**
     * 设置字符集编码
     * @param context
     * @return
     */
    @Override
    public boolean run(RequestContext context) {
        log.info("设置字符编码：{}", context.getResponseBody());
        context.getResponse().setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        return true;
    }
}
