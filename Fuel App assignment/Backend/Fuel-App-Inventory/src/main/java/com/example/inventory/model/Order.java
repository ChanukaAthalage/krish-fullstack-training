package com.example.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Order {
	

	private int orderRefId;
	private String name;
	private int shedId;
	private String location;
	private int capacity;
	private String fuelType;
	private String status = "Pending";
	private String date = "Pending";
	
	
	
	public Order() {}


	public Order(int orderRefId, String name, int shedId, String location, int capacity, String fuelType, String status, String date) {
		super();
		this.orderRefId = orderRefId;
		this.name = name;
		this.shedId = shedId;
		this.location = location;
		this.capacity = capacity;
		this.fuelType = fuelType;
		this.status = status;
		this.date = date;
	}


	public int getOrderRefId() {
		return orderRefId;
	}


	public void setOrderRefId(int orderRefId) {
		this.orderRefId = orderRefId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getShedId() {
		return shedId;
	}


	public void setShedId(int shedId) {
		this.shedId = shedId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	

	
	
	
	
	
	
	
	

}
