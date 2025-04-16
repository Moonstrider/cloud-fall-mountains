package com.cloud.fall.mountains.micro_alpha.configuration;

import com.cloud.fall.mountains.micro_beta.api.ApiControllerApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    ApiControllerApi apiControllerApi(){
        return new ApiControllerApi();
    }

}
