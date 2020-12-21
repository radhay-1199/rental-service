package com.training.rental.model;

public class AirConditioner extends RentalItem {

	private String type;
	private String capacity;
	private String color;
	
	public AirConditioner() {
		super();
	}

	public AirConditioner(String name, double price, int qty, String type, String capacity, String color) {
		super(name, price, qty);
		this.type = type;
		this.capacity = capacity;
		this.color = color;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "[Category: "+getCategory()+" | Name: "+getName()+" | Price: "+getPrice()+" | Quantity: "+getQty()+" |  Type: "+ getType()+" |  Capacity: "+getCapacity()+" Color: "+getColor()+" | Total Price: "+ calculatePrice()+"]";
	}
	
}
