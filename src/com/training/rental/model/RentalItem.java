package com.training.rental.model;

public class RentalItem implements IRental{
	
	private String name;
	private double price;
	private int qty;

	public RentalItem() {
		super();
	}
	
	public RentalItem(String name, double price, int qty) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "RentalService [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return this.getPrice()*this.getQty();
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
	
}
