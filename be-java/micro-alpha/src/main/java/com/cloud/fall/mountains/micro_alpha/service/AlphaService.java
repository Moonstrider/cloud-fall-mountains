package com.cloud.fall.mountains.micro_alpha.service;

import com.cloud.fall.mountains.micro_beta.api.ApiControllerApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlphaService {

    private final ApiControllerApi apiControllerApi;

    public AlphaService(ApiControllerApi apiControllerApi) {
        this.apiControllerApi = apiControllerApi;
    }

    public String test() {
        try {
            String test = apiControllerApi.test();
            System.out.println("test:" + test);
            return test;
        } catch (Exception e) {
            log.error(e.getMessage());
            return "error";
        }
    }

}

