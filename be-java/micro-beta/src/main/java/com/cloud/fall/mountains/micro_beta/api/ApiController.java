package com.cloud.fall.mountains.micro_beta.api;

import com.cloud.fall.mountains.micro_beta.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/test")
    public User test() {
        User robert = new User("Robert");
        return robert;
    }
}
