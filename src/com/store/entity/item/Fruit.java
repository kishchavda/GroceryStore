package com.store.entity.item;

/**
 * An abstract class that represents a fruit object
 * 
 * @author Owner
 *
 */
public abstract class Fruit {

	private double totalWeightKilos;
	private int quantity;

	public Fruit(double totalWeightKilos, int quantity) {
		super();
		this.totalWeightKilos = totalWeightKilos;
		this.quantity = quantity;
	}

	public double getTotalWeightKilos() {
		return totalWeightKilos;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "quantity=" + this.quantity + ", total weight=" + this.totalWeightKilos + "kg";
	}
}
