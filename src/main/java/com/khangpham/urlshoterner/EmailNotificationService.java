package com.khangpham.urlshoterner;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Email sended: " + message);
    }
}
