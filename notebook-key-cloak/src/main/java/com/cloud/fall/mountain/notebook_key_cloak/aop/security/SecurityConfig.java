package com.cloud.fall.mountain.notebook_key_cloak.aop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/public/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(formLogin -> formLogin
                .loginPage("/oauth2/authorization/keycloak")
                .permitAll()
            );
//            .rememberMe(Customizer.withDefaults());

//        http.authorizeHttpRequests(
//                auth -> auth.requestMatchers("/public**").permitAll()
//                    .anyRequest().authenticated()
//            ).oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
//            .formLogin(login -> login.loginPage("/login").defaultSuccessUrl("/").permitAll()
//            );
        return http.build();
    }
}
