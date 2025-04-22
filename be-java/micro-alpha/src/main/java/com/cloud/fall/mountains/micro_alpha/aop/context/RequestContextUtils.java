package com.cloud.fall.mountains.micro_alpha.aop.context;

import lombok.experimental.UtilityClass;
import org.slf4j.MDC;

/**
 * Utilities used to conveniently access the current request/thread context properties
 */
@UtilityClass
public class RequestContextUtils {

    /**
     * This should be a common library
     */

    public static final String CORRELATION_ID = "correlationId";

    /**
     * Access the global context repository object holding the attribute mappings for the current request
     */
    public static RequestContext requestContext() {
        return RequestContextHolder.get();
    }

    public static void removeContext() {
        RequestContextHolder.unset();
    }

    public static void setCorrelationId(String correlationId) {
        requestContext().setAttribute(RequestContext.CORRELATION_ID, correlationId);
        MDC.put(CORRELATION_ID, correlationId);
    }

    /**
     * Retrieves the correlation id from the {@link RequestContext} associated with the current request or generates a
     * new one if there is no such object available on the request
     *
     * @return the correlation id from the context or a newly generated one if there is no such object available on the
     * request
     */
    public static String correlationId() {
        // if it doesn't exist, could consider generate and setCorrelationId
        return requestContext().getAttribute(RequestContext.CORRELATION_ID);
    }

    public static void setSignature(String signature) {
        requestContext().setAttribute(RequestContext.SIGNATURE, signature);
    }

    public static String signature() {
        return requestContext().getAttribute(RequestContext.SIGNATURE);
    }

    public static void setUri(String uri) {
        requestContext().setAttribute(RequestContext.URI, uri);
    }

    public static String uri() {
        return requestContext().getAttribute(RequestContext.URI);
    }
}
