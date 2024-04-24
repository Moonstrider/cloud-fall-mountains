package com.cloud.fall.mountains.notebook.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(
            topics = "robtest",
            groupId = "foo"
    )
    public void listen(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
