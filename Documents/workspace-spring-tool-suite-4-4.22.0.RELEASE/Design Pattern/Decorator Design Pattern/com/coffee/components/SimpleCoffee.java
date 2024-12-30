package com.coffee.components;

public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "simple coffee";
	}

	@Override
	public double getCost() {
		return 55.0;
	}

}
