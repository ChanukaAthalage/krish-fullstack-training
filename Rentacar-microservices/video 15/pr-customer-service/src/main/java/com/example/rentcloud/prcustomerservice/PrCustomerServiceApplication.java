package com.example.rentcloud.prcustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.example.rentcloud.model.customer")
public class PrCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrCustomerServiceApplication.class, args);
    }

}
