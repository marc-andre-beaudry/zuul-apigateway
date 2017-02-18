package com.marc.gateway.filters;

public abstract class BasePostRequestFilter extends BaseRequestFilter {

    public BasePostRequestFilter(int order) {
        super(order);
    }

    @Override
    public String filterType() {
        return "post";
    }
}
