package com.codingSpring.learnSpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Payment.Provider", havingValue = "Razor")
public class RazorPayPaymentService implements paymentService {

    @Override
    public String pay(){
        String payment = "RazorPay Payment";
        System.out.println("Payment from : " + payment);
        return payment;
    }

}
