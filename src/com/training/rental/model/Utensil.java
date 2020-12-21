package com.training.rental.model;

public class Utensil extends RentalItem {

	private String type;
	private boolean breakable;
	
	
	public Utensil() {
		super();
	}

	public Utensil(String name, double price, int qty, String type, boolean breakable) {
		super(name, price, qty);
		this.type = type;
		this.breakable = breakable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isBreakable() {
		return breakable;
	}

	public void setBreakable(boolean breakable) {
		this.breakable = breakable;
	}

	@Override
	public String toString() {
		return "[Category: "+getCategory()+" | Name: "+getName()+" | Price: "+getPrice()+" | Quantity: "+getQty()+" |  Type: "+ getType()+" |  Breakable: "+isBreakable()+" | Total Price: "+ calculatePrice()+"]";
	}
	
}
