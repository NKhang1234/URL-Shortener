package com.khangpham.urlshoterner;

public class StripePayment implements PaymentService {

    @Override
    public void purchase(int amount) {
        System.out.println("Stripe");
        System.out.println("Amount: " + amount);
    }
}
