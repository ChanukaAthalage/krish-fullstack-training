package com.example.inventory.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.inventory.model.Available;

public interface AvailableService {

	public ResponseEntity<Available> saveAvailableFuel(Available available);
	//public ResponseEntity<Available> updateAvailableFuel(@PathVariable String fuelType);
}
