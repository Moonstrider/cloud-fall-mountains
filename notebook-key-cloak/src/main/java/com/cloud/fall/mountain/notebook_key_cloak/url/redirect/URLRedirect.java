package com.cloud.fall.mountain.notebook_key_cloak.url.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class URLRedirect {

    @GetMapping("/landing")
    public String redirectToBaidu() {
        // Redirects to www.baidu.com
        return "redirect:http://localhost:8080/realms/volvoid/protocol/openid-connect/auth?client_id=volvoid&redirect_uri=http://www.baidu.com&scope=openid&response_type=code&response_mode=query";
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:http://localhost:2021/oauth2/authorization/keycloak";
    }
}
