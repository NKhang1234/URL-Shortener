package com.khangpham.urlshoterner;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(
            PaymentService paymentService
    ) {
        this.paymentService = paymentService;
    }

    public void processOrder(int amount) {
        paymentService.purchase(amount);
    }
}
