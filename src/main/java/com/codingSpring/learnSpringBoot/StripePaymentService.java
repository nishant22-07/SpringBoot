package com.codingSpring.learnSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@Component
@RestController
@ConditionalOnProperty(name = "Payment.Provider" , havingValue = "Stripe")
public class StripePaymentService implements paymentService{

    @Override
    public String pay() {
        String payment = "Stripe payment";
        System.out.println("Payment from : " + payment);
        return payment;
    }
}
