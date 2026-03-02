package com.khangpham.urlshoterner;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class StripeService implements PaymentService {

    @Override
    public void purchase(int amount) {
        System.out.println("Stripe");
        System.out.println("Amount: " + amount);
    }
}
