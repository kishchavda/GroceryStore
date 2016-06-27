package com.store.calculator;

import com.store.entity.item.Fruit;
/**
 * Calculates price of fruit based on weight
 * 
 * @author Owner
 *
 */
public class WeightPriceCalculator implements FruitPriceCalculator {

	/*
	 * (non-Javadoc)
	 * @see com.store.calculator.FruitPriceCalculator#calculatePrice(com.store.entity.item.Fruit)
	 */
	@Override
	public double calculatePrice(Fruit fruit) {

		double weight = fruit.getTotalWeightKilos();
		Class<? extends Fruit> fruitClass = fruit.getClass();
		Double pricePerKilo = FruitPrices.getPricePerKilo(fruitClass);
		if (pricePerKilo == null) {
			throw new IllegalArgumentException("Price for fruit " + fruitClass + " is unavailable");
		}
		return weight * pricePerKilo.doubleValue();
	}
}
