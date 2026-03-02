package com.khangpham.urlshoterner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(
            PaymentService paymentService
    ) {
        this.paymentService = paymentService;
    }

    public void processOrder(int amount) {
        paymentService.purchase(amount);
    }
}
