package com.khangpham.urlshoterner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(
            @Qualifier("SMS") NotificationService notificationService
    ) {
        this.notificationService = notificationService;
    }

    public void send(String message) {
        notificationService.send(message, "aa");
    }
}
