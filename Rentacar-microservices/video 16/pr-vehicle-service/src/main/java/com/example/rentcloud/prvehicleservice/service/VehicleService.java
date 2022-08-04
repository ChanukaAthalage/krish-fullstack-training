package com.example.rentcloud.prvehicleservice.service;

import org.example.rentcloud.model.vehicle.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
