package com.example.rentcloud.prrentservice.controller;

import com.example.rentcloud.prrentservice.model.Response;
import com.example.rentcloud.prrentservice.model.SimpleResponse;
import com.example.rentcloud.prrentservice.service.RentService;
import org.example.rentcloud.model.rent.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/rents")
public class RentController {


    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent){
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type){

        if (type==null){
            return new SimpleResponse(rentService.findById(id));
        }else {
            return rentService.findDEDetailResponse(id);
        }


    }

    @GetMapping
    public List<Rent> getAllRents(){
        return rentService.findAll();
    }
}
