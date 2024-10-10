package com.cloud.fall.mountain.notebook_key_cloak.aop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
            .addFilterAfter(new CustomSecurityFilter(), BasicAuthenticationFilter.class)
            .build();

//        http.authorizeHttpRequests((requests) -> requests
//                .requestMatchers(new AntPathRequestMatcher("/public/**")).permitAll())
//            .addFilterAfter(new CustomSecurityFilter(),
//                BasicAuthenticationFilter.class); //other URLs are only allowed authenticated users.
//        return http.build();
    }

}
