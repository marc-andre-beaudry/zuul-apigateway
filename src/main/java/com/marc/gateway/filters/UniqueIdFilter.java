package com.marc.gateway.filters;

import com.marc.gateway.service.UniqueIdService;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UniqueIdFilter extends BasePreRequestFilter {

    @Autowired
    private UniqueIdService uniqueIdService;

    public UniqueIdFilter() {
        super(0);
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        String uuid = uniqueIdService.getOne();
        ctx.addZuulRequestHeader("x-application-uuid", uuid);
        return null;
    }
}