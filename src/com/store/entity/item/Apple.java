package com.store.entity.item;

public class Apple extends Fruit {

	public Apple(double totalWeightKilos, int quantity) {
		super(totalWeightKilos, quantity);
	}

	@Override
	public String toString() {
		return "Apple: " + super.toString();
	}
}
