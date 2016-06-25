package com.store.entity.item;

/**
 * An abstract class that represents a fruit object
 * 
 * @author Owner
 *
 */
public abstract class Fruit {
	
	private double totalWeightKilos;
	private String colour;
	private int quantity;

	public Fruit(double totalWeightKilos, String colour, int quantity) {
		super();
		this.totalWeightKilos = totalWeightKilos;
		this.colour = colour;
		this.quantity = quantity;
	}

	public double getTotalWeightKilos() {
		return totalWeightKilos;
	}

	public String getColour() {
		return colour;
	}

	public int getQuantity() {
		return quantity;
	}
}
