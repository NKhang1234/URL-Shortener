package com.khangpham.urlshoterner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${paymentType:stripe}")
    private String paymentType;

    @Bean //Bean factory
    public PaymentService stripe() {
        return new StripeService();
    }

    @Bean
    public PaymentService paypal() {
        return new PaypalService();
    }

    @Bean
    public OrderService orderService() {
        PaymentService paymentService;
        if(this.paymentType.equals("stripe")) {
            paymentService =  this.stripe();
        } else {
            paymentService =  this.paypal();
        }
        return new OrderService(paymentService);
    }
}
