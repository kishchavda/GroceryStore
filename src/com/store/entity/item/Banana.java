package com.store.entity.item;

public class Banana extends Fruit {

	public Banana(double totalWeightKilos, int quantity) {
		super(totalWeightKilos, quantity);
	}

	@Override
	public String toString() {
		return "Banana: " + super.toString();
	}
}
