package com.cloud.fall.mountains.micro_alpha.service;

import org.springframework.stereotype.Service;
import com.cloud.fall.mountains.micro_beta.invoker.ApiClient;

@Service
public class AlphaService {

    private final ApiClient apiClient;

    public AlphaService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String fetchDataFromProjectB() {
        return apiClient
    }
}

