//package com.cloud.fall.mountain.notebook_key_cloak.aop.security;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
//
//public String GetAccessToken() {
//
//    Authentication authentication1 = SecurityContextHolder.getContext().getAuthentication();
//
//    JwtAuthenticationToken authentication = (JwtAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
//    return authentication.getToken().getTokenValue();
//}
