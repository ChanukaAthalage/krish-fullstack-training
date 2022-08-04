package com.example.rentcloud.prvehicleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = "org.example.rentcloud.model.vehicle")
@EnableEurekaClient
public class PrVehicleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrVehicleServiceApplication.class, args);
    }

}
