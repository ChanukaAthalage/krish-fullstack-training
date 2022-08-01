package com.example.order.controller;


import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.model.Order;
import com.example.order.service.OrderService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class OrderController {
	
	@Autowired
	OrderService orderService;


	@PostMapping("/orders")
	public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}
	
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<Optional<Order>> getOrder(@PathVariable int id){
		return orderService.getOrder(id);
	}
	
	@PutMapping("/orders/{id}")
	public ResponseEntity<Order> orderReceived(@PathVariable int id) {
		return orderService.orderReceived(id);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	
}
