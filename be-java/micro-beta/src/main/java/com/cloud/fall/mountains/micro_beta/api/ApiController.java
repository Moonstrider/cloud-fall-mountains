package com.cloud.fall.mountains.micro_beta.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/test")
    public String test() {
        return "robert";
    }
}
