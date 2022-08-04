package com.example.rentcloud.prvehicleservice.controller;

import com.example.rentcloud.prvehicleservice.service.VehicleService;
import org.example.rentcloud.model.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @GetMapping(value = "/{id}")
    public Vehicle getVehicle(@PathVariable int id){
        return vehicleService.findById(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleService.findAll();
    }

}
