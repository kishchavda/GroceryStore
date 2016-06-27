package com.store.entity.item;

public class Lemon extends Fruit {

	public Lemon(double totalWeightKilos, int quantity) {
		super(totalWeightKilos, quantity);
	}

	@Override
	public String toString() {
		return "Lemon: " + super.toString();
	}
}
