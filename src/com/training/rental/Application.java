package com.training.rental;

import com.training.rental.model.AirConditioner;
import com.training.rental.model.Computer;
import com.training.rental.model.Furniture;
import com.training.rental.model.RentalItem;
import com.training.rental.model.Utensil;
import com.training.rental.service.RentService;

public class Application {

	public static void main(String[] args) {
		
		RentService rentService = new RentService(1001);
		
		RentalItem r1 = new Computer("Mouse", 320, 1,"Grey");
		rentService.addToCart(r1);
		RentalItem r2 = new Computer("Keyboard",1200,2,"Black");
		rentService.addToCart(r2);
		RentalItem r3 = new Furniture("Table",1000,3,"120x320",200);
		rentService.addToCart(r3);
		RentalItem r4 = new AirConditioner("Hitachi", 40000.00, 1, "Split", "1.5 ton", "White");
		rentService.addToCart(r4);
		RentalItem r5 = new Utensil("Plate", 500.00, 3, "China Clay", true);
		rentService.addToCart(r5);
		rentService.getPrice();
	}
}
