package com.cloud.fall.mountains.micro_alpha.aop.inteceptor;


import com.cloud.fall.mountains.micro_alpha.aop.context.RequestContextUtils;
import com.cloud.fall.mountains.micro_alpha.exception.InvalidHeaderException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
@Component
public class IngressRequestInterceptor implements HandlerInterceptor {

    private static final String MISSING = "Request header miss: {}";

    @Override
    public boolean preHandle(HttpServletRequest request, @NonNull HttpServletResponse response,
        @NonNull Object handler) {

        String correlationId = request.getHeader("correlationId");
        if (StringUtils.isBlank(correlationId)) {
            log.info(MISSING, "correlationId");
            throw new InvalidHeaderException("correlationId", "Request header miss correlationId");
        }
        RequestContextUtils.setCorrelationId(correlationId);

        return true;
    }
}
