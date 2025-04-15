package com.cloud.fall.mountains.micro_alpha.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cloud.fall.mountains.micro_beta.invoker.ApiClient;

@Configuration
public class AppConfig {

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8082");  // Set the base URL of Project B's API
        return apiClient;
    }
}
