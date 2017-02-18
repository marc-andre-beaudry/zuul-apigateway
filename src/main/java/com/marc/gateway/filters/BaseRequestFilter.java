package com.marc.gateway.filters;

import com.google.common.base.Preconditions;
import com.netflix.zuul.ZuulFilter;

public abstract class BaseRequestFilter extends ZuulFilter {

    private final int order;

    public BaseRequestFilter(int order) {
        Preconditions.checkArgument(order >= 0);
        this.order = order;
    }

    @Override
    public final int filterOrder() {
        return order;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }
}
