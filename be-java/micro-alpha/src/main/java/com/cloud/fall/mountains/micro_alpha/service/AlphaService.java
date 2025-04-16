package com.cloud.fall.mountains.micro_alpha.service;

import com.cloud.fall.mountains.micro_beta.api.ApiControllerApi;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {

    private final ApiControllerApi apiControllerApi;

    public AlphaService(ApiControllerApi apiControllerApi) {
        this.apiControllerApi = apiControllerApi;
    }

    public String test() {
        String test = apiControllerApi.test();
        System.out.println("test:" + test);
        return test;
    }

}

