package com.demo.spring.gateway;

import com.demo.spring.gateway.filter.CharsetCustomerFilter;
import com.demo.spring.gateway.filter.FilterManager;
import com.demo.spring.gateway.filter.UrlAccessPatternCustomerFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
@EnableZuulProxy
@SpringBootApplication
public class ApplicationStarter extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStarter.class);
    }

    public static void main(String[] args) {
        FilterManager.registerFilter(
                new CharsetCustomerFilter(),
                new UrlAccessPatternCustomerFilter());

        SpringApplication.run(ApplicationStarter.class, args);
    }
}
