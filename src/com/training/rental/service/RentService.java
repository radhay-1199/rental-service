package com.training.rental.service;

import com.training.rental.model.AirConditioner;
import com.training.rental.model.Computer;
import com.training.rental.model.Furniture;
import com.training.rental.model.RentalItem;
import com.training.rental.model.Utensil;

public class RentService {
	
	private double totalPrice=0.00;
	private Integer itemCount = 1;
	protected final int custId;
	
	public RentService(int id) {
		this.custId=id;
		System.out.println("Cust ID: "+id+"\n");
	}

	public void addToCart(RentalItem item) {	
		System.out.println(itemCount+" : "+item.getName()+" added to cart from category "+item.getCategory());
		if(item instanceof Computer) {
			Computer computer = (Computer) item;
			System.out.println(computer.toString());
		}else if(item instanceof Furniture) {
			Furniture furniture = (Furniture) item;
			System.out.println(furniture.toString());
		}else if(item instanceof AirConditioner) {
			AirConditioner airConditioner = (AirConditioner) item;
			System.out.println(airConditioner.toString());
		}else if(item instanceof Utensil) {
			Utensil utensil = (Utensil) item;
			System.out.println(utensil.toString());
		}else {
			System.out.println(item.toString());
		}		
		totalPrice+=item.calculatePrice();
		itemCount++;
		System.out.println();	
	}
	
	public void getPrice() {
		System.out.println("Your Total Amount is: "+totalPrice);	
	}
}
