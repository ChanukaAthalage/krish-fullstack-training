package com.example.rentcloud.prrentservice.repository;

import org.example.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}
