package com.cloud.fall.mountains.micro_alpha.aop.context;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * Class that manages the {@link RequestContext context} of a request.
 */
@Slf4j
@UtilityClass
public class RequestContextHolder {

    /**
     * once the application is started, the threadLocal is initialized with a new RequestContext object
     * the threadLocal object will never change
     * while the RequestContext object inside this threadLocal will be refreshed for each requests
     */
    private static final ThreadLocal<RequestContext> threadLocal = ThreadLocal.withInitial(RequestContext::new);

    static void unset() {
        threadLocal.remove();
    }

    static RequestContext get() {
        return threadLocal.get();
    }
}
