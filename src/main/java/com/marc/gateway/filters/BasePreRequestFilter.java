package com.marc.gateway.filters;

public abstract class BasePreRequestFilter extends BaseRequestFilter {

    public BasePreRequestFilter(int order) {
        super(order);
    }

    @Override
    public String filterType() {
        return "pre";
    }
}
