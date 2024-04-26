package com.cloud.fall.mountains.notebook.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(
            topics = "robtest",
            groupId = "foo"
    )
    public void listen1(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

    @KafkaListener(
            topics = "vcc.user.internal.confirmation.event.dev",
            groupId = "foo"
    )
    public void listen2(String message) {
        System.out.println("vcc.user.internal.confirmation.event.dev:[" + message + "]");
    }
}
