package com.coffee;

import com.coffee.components.*;
import com.coffee.decorators.*;
public class CoffeeShop {

	public static void main(String[] args) {
		
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription()+ " | Cost : "+coffee.getCost());
		
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription()+ " | Cost : "+coffee.getCost());
		
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription()+ " | Cost : "+coffee.getCost());
	} 
}
