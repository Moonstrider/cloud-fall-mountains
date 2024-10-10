package com.cloud.fall.mountain.notebook_key_cloak.aop.security;

import com.auth0.jwk.Jwk;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.JwkProviderBuilder;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

public class CustomSecurityFilter implements Filter {

    Logger log = LoggerFactory.getLogger(getClass());

    JwkProvider jwkProvider;

    public CustomSecurityFilter() throws MalformedURLException {
        jwkProvider = new JwkProviderBuilder(new URL(
            "http://localhost:8080/realms/mjtech/protocol/openid-connect/certs")).build();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
        FilterChain chain) throws IOException, ServletException {

        try {
            String authorizationHeader = ((HttpServletRequest) request).getHeader("Authorization");
            String token = authorizationHeader.substring(7);

            DecodedJWT decodedJWT = JWT.decode(token);

            Jwk jwk = jwkProvider.get(decodedJWT.getKeyId());

            Algorithm algorithm = Algorithm.RSA256((RSAPublicKey) jwk.getPublicKey(), null);

            JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("http://localhost:8080/realms/mjtech")
//                .withAudience("backend-api")
                .build();
            verifier.verify(decodedJWT);

            SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(decodedJWT.getSubject(), "***",
                    List.of(new SimpleGrantedAuthority("SIMPLE_AUTHORITY")))
            );


        } catch (JWTVerificationException jwtVerificationException) {
            log.error("Verification Exception", jwtVerificationException);
        } catch (Exception e) {
            log.error("Exception", e);
        }

        chain.doFilter(request, response);

        SecurityContextHolder.clearContext();
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
