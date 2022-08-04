package com.example.rentcloud.prcustomerservice.repository;

import org.example.rentcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
