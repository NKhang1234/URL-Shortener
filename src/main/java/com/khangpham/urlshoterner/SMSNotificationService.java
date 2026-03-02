package com.khangpham.urlshoterner;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("SMS sended: " + message);
    }
}
