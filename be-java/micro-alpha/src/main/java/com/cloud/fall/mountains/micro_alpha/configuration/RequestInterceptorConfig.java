package com.cloud.fall.mountains.micro_alpha.configuration;

import com.cloud.fall.mountains.micro_alpha.aop.inteceptor.EgressRequestInterceptor;
import com.cloud.fall.mountains.micro_alpha.aop.inteceptor.IngressRequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestInterceptorConfig implements WebMvcConfigurer {

    public static final int REQUEST_WORKFLOW_INTERCEPTOR_ORDER = Ordered.HIGHEST_PRECEDENCE;
    public static final int HEADER_INTERCEPTOR_ORDER = REQUEST_WORKFLOW_INTERCEPTOR_ORDER + 10;

    private final IngressRequestInterceptor ingressRequestInterceptor;
    private final EgressRequestInterceptor egressRequestInterceptor;

    public RequestInterceptorConfig(IngressRequestInterceptor ingressRequestInterceptor,
        EgressRequestInterceptor egressRequestInterceptor
    ) {
        this.ingressRequestInterceptor = ingressRequestInterceptor;
        this.egressRequestInterceptor = egressRequestInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(egressRequestInterceptor).order(REQUEST_WORKFLOW_INTERCEPTOR_ORDER);
        registry.addInterceptor(ingressRequestInterceptor)
            .addPathPatterns("/my-path/**").order(HEADER_INTERCEPTOR_ORDER);
    }
}
