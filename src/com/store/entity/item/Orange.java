package com.store.entity.item;

public class Orange extends Fruit {

	public Orange(double totalWeightKilos, int quantity) {
		super(totalWeightKilos, quantity);
	}
	
	@Override
	public String toString() {
		return "Orange: " + super.toString();
	}
}
