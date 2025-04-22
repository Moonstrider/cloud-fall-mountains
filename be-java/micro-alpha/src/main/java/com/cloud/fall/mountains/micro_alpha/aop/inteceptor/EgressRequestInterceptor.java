package com.cloud.fall.mountains.micro_alpha.aop.inteceptor;

import static com.cloud.fall.mountains.micro_alpha.aop.context.RequestContextUtils.removeContext;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

@Slf4j
@Component
public class EgressRequestInterceptor implements AsyncHandlerInterceptor {

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request,
        @NonNull HttpServletResponse response,
        @NonNull Object handler) {
        removeContext();
        return true;
    }

    @Override
    public void afterCompletion(@NonNull HttpServletRequest request,
        @NonNull HttpServletResponse response,
        @NonNull Object handler,
        Exception ex) {
        removeContext();
    }

    @Override
    public void afterConcurrentHandlingStarted(@NonNull HttpServletRequest request,
        @NonNull HttpServletResponse response,
        @NonNull Object handler) {
        removeContext();
    }
}
