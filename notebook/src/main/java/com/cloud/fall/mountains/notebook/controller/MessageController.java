package com.cloud.fall.mountains.notebook.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public void publish(@RequestParam("message") String message) {
        kafkaTemplate.send("robtest", message);
//        kafkaTemplate.send("vcc.user.internal.confirmation.event.dev", "rob", message);
    }

    @GetMapping("/p/{m}")
    public void p(@PathVariable("m") String message) {
        kafkaTemplate.send("robtest", message);
        kafkaTemplate.send("vcc.user.internal.confirmation.event.dev", "rob", message);
    }
}
