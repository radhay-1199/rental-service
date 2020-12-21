package com.training.rental.model;

public class Computer extends RentalItem {

	private String features;
	
	public Computer() {
		super();
	}
	
	public Computer(String name, double price, int qty, String features) {
		super(name, price, qty);
		this.features = features;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "[Category: "+getCategory()+" | Name: "+getName()+" | Price: "+getPrice()+" | Quantity: "+getQty()+" |  Features: "+ getFeatures()+" |  Total Price: "+ calculatePrice()+"]";
	}
}
