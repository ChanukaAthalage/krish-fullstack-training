package com.example.rentcloud.prrentservice.service;

import com.example.rentcloud.prrentservice.model.DetailResponse;
import org.example.rentcloud.model.rent.Rent;

import java.util.List;

public interface RentService {

    Rent save(Rent rent);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDEDetailResponse(int id);
}
