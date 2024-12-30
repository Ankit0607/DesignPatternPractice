package com.coffee.decorators;

import com.coffee.components.Coffee;

public class CoffeeDecorator implements Coffee {
	protected Coffee coffee;

	@Override
	public String getDescription() {
		return coffee.getDescription();
	}

	@Override
	public double getCost() {
		return coffee.getCost();
	}

	public CoffeeDecorator(Coffee coffee) {
		super();
		this.coffee = coffee;
	}
	

}
