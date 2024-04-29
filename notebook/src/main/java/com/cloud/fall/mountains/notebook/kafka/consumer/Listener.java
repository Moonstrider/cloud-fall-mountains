package com.cloud.fall.mountains.notebook.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Listener {

    @KafkaListener(
            topics = "robtest",
            groupId = "aaa"
    )
    public void listen1(String message) {
        log.info("robtest msg:[" + message + "]");
    }

    @KafkaListener(
            topics = "vcc.user.internal.confirmation.event.dev",
            groupId = "bbb"
    )
    public void listen2(String message) {
        log.info("confirmation msg:[" + message + "]");
    }
}
