package com.cloud.fall.mountains.micro_alpha.controller;

import com.cloud.fall.mountains.micro_alpha.service.AlphaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphaController {

    private final AlphaService alphaService;

    public AlphaController(AlphaService alphaService) {
        this.alphaService = alphaService;
    }

    @GetMapping("/a")
    public String getUser() {
        return alphaService.test();
    }

}
