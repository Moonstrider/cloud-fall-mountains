package com.cloud.fall.mountains.notebook.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmailServiceUnitTest {

    @Mock
    DeliveryPlatform platform;

    @InjectMocks
    EmailService emailService;

    @Captor
    ArgumentCaptor<Email> emailCaptor;

    @Test
    void whenDoesSupportHtml_expectHTMLEmailFormat() {
        String to = "info@baeldung.com";
        String subject = "Using ArgumentCaptor";
        String body = "Hey, let'use ArgumentCaptor";

        emailService.send(to, subject, body, true);

        verify(platform).deliver(emailCaptor.capture());
        Email value = emailCaptor.getValue();
        assertThat(value.getFormat()).isEqualTo(Format.HTML);
    }

}
