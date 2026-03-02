package com.khangpham.urlshoterner;

import org.springframework.stereotype.Service;

@Service
public class PaypalService implements PaymentService{
    @Override
    public void purchase(int amount) {
        System.out.println("Paypal");
        System.out.println("Amount " + amount);
    }
}
