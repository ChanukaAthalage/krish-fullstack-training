package com.example.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.inventory.model.Available;
import com.example.inventory.repository.AvailableRepo;

@Service
public class AvailableServiceImpl implements AvailableService {
	
	@Autowired
	AvailableRepo availableRepo;

	@Override
	public ResponseEntity<Available> saveAvailableFuel(Available available) {
		try {
		availableRepo.save(available);
		
		}catch(Exception e) {
			
		}
	
		return ResponseEntity.status(HttpStatus.OK).body(available);	
	}

}
