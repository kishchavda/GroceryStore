package com.store.calculator;

import com.store.entity.item.Fruit;

/**
 * Calculates the price of fruit based on number of units
 * 
 * @author Owner
 *
 */
public class UnitPriceCalculator implements FruitPriceCalculator {

	/*
	 * (non-Javadoc)
	 * @see com.store.calculator.FruitPriceCalculator#calculatePrice(com.store.entity.item.Fruit)
	 */
	@Override
	public double calculatePrice(Fruit fruit) {
		int quantity = fruit.getQuantity();
		Double unitPrice = FruitPrices.getUnitPrice(fruit.getClass());
		if (unitPrice == null) {
			throw new IllegalArgumentException("Price for fruit " + fruit.getClass() + " is unavailable");
		}
		return quantity * unitPrice.doubleValue();
	}
}
