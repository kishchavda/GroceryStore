package com.store.entity.item;

public class Peach extends Fruit {

	public Peach(double totalWeightKilos, int quantity) {
		super(totalWeightKilos, quantity);
	}

	@Override
	public String toString() {
		return "Peach: " + super.toString();
	}
}
