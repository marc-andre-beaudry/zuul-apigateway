package com.marc.gateway.filters;

public abstract class BaseRoutingRequestFilter extends BaseRequestFilter {

    public BaseRoutingRequestFilter(int order) {
        super(order);
    }

    @Override
    public String filterType() {
        return "route";
    }
}
