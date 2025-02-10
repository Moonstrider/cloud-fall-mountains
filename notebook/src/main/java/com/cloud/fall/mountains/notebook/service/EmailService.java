package com.cloud.fall.mountains.notebook.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class EmailService {

    private DeliveryPlatform platform;

    public EmailService(DeliveryPlatform platform) {
        this.platform = platform;
    }

    public void send(String to, String subject, String body, boolean html) {
        Format format = Format.TEXT_ONLY;
        if (html) {
            format = Format.HTML;
        }
        Email email = new Email(to, subject, body);
        email.setFormat(format);
        platform.deliver(email);
    }
}

enum Format {
    TEXT_ONLY,
    HTML
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Email {

    private String to;
    private String subject;
    private String body;
    private Format format;

    public Email(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}

class DeliveryPlatform {

    public void deliver(Email email) {
        System.out.println("sending..." + email);
    }
}