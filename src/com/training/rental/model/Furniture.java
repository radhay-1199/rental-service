package com.training.rental.model;

public class Furniture extends RentalItem {

	private String dimension;
	private double weight;
	
	public Furniture() {
		super();
	}

	public Furniture(String name, double price, int qty, String dimension, double weight) {
		super(name, price, qty);
		this.dimension = dimension;
		this.weight=weight;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "[Category: "+getCategory()+" | Name: "+getName()+" | Price: "+getPrice()+" | Quantity: "+getQty()+" |  Dimension: "+ getDimension()+" |  Weight: "+getWeight()+" | Total Price: "+ calculatePrice()+"]";
	}
}
