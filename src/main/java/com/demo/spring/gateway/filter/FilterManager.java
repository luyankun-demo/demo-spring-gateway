package com.demo.spring.gateway.filter;

import com.netflix.zuul.context.RequestContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-17
 */
public class FilterManager {

    private static List<CustomerFilter> filterList = new ArrayList<>();

    public static void registerFilter (CustomerFilter... filters) {
        filterList.addAll(Arrays.asList(filters));
    }

    public static void run (RequestContext context) {
        for (CustomerFilter customerFilter : filterList) {
            if (!customerFilter.run(context)) {
                break;
            }
        }


    }
}
