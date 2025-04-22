package com.cloud.fall.mountains.micro_alpha.aop.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class that holds the context of a request, instance of this is in a Threadlocal
 * Not only correlationId, it can also hold many other context such as:
 * securityInfo, securityToken, clientIp, userAgent, legalToken, commandType, eventType, etc.
 */
public class RequestContext {

    /*
      could have a short name for correlationId
     */
    public static final String CORRELATION_ID = "correlationId";
    public static final String SIGNATURE = "signature";
    public static final String URI = "uri";

    /*
      Container for context attributes available for the current request
     */
    private final Map<String, Object> attributes = new ConcurrentHashMap<>();

    /**
     * Retrieves the named attribute from the mappings or null if there is no mapping available
     */
    @SuppressWarnings("unchecked")
    public <T> T getAttribute(String name) {
        return (T) attributes.get(name);
    }

    /**
     * Associates the specified value with the specified name in this context.
     * If the context previously contained a mapping for the name,
     * the old value is replaced by the specified value!!!
     */
    public void setAttribute(String name, Object value) {
        attributes.put(name, value);
    }
}
