package com.example.rentcloud.prvehicleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = "org.example.rentcloud.model.vehicle")
public class PrVehicleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrVehicleServiceApplication.class, args);
    }

}
