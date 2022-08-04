package com.example.rentcloud.prrentservice.service;

import com.example.rentcloud.prrentservice.model.DetailResponse;
import com.example.rentcloud.prrentservice.repository.RentRepository;
import org.example.rentcloud.model.customer.Customer;
import org.example.rentcloud.model.customer.Loyality;
import org.example.rentcloud.model.rent.Rent;
import org.example.rentcloud.model.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService{

    @Autowired
    RentRepository rentRepository;



    @Autowired
    RestTemplate restTemplate;

    @Override
    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }

    @Override
    public Rent findById(int id) {
        Optional<Rent> rent  =rentRepository.findById(id);
        if (rent.isPresent()){
            return rent.get();
        }else {
            return new Rent();
        }
    }

    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public DetailResponse findDEDetailResponse(int id) {
        Rent rent = findById(id);
        Customer customer = getCustomer(rent.getCustomerId());
        Vehicle vehicle = getVehicle(rent.getVehicleId());

        return new DetailResponse(rent,customer,vehicle);
    }

    private Customer getCustomer(int id){
       return restTemplate.getForObject("http://customer/services/customers/"+id,Customer.class);
    }

    private Vehicle getVehicle(int vehicleId){
        return restTemplate.getForObject("http://vehicle/service/vehicles/"+vehicleId,Vehicle.class);
    }
}
