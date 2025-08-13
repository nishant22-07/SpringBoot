package com.codingSpring.learnSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}


	private paymentService paymentService;


	public LearnSpringBootApplication(paymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception{
		String payment = paymentService.pay();
		System.out.println("Payment done : " + payment);

	}


}
