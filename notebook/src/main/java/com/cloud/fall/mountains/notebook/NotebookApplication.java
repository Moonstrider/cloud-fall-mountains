package com.cloud.fall.mountains.notebook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class NotebookApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotebookApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 1; i <= 10; i++) {
                kafkaTemplate.send("robtest", "Hello, Kafka! " + i);
//                kafkaTemplate.send("vcc.user.internal.confirmation.event.dev", "rob", "Hello, Kafka! " + i);
            }
        };
    }
}
