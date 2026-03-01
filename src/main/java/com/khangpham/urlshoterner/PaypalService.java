package com.khangpham.urlshoterner;

public class PaypalService implements PaymentService{
    @Override
    public void purchase(int amount) {
        System.out.println("Paypal");
        System.out.println("Amount " + amount);
    }
}
