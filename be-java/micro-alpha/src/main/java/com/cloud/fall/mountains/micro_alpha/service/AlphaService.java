package com.cloud.fall.mountains.micro_alpha.service;

import com.cloud.fall.mountains.micro_beta.api.ApiControllerApi;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {

//    private final ApiControllerApi apiClient; // Generated interface

//    public AlphaService(ApiControllerApi apiClient) {
//        this.apiClient = apiClient;
//    }

    public String test() {
        ApiControllerApi apiControllerApi = new ApiControllerApi();
        String test = apiControllerApi.test();
        System.out.println("test:" + test);
        return test;
//        return apiClient.test();
    }

}

