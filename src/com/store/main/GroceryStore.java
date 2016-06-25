package com.store.main;

import java.util.List;

import com.store.calculator.FruitPrices;
import com.store.entity.Basket;
import com.store.entity.item.Fruit;

public class GroceryStore {
	
	public static double checkout(Basket basket) {
		List<Fruit> fruits = basket.getItems();

		double totalCost = 0.0;
		for (Fruit fruit : fruits) {
			double weight = fruit.getTotalWeightKilos();
			Class<? extends Fruit> fruitClass = fruit.getClass();
			Double pricePerKilo = FruitPrices.getPrice(fruitClass);
			if (pricePerKilo == null) {
				throw new IllegalArgumentException("Price for fruit " + fruitClass + " is unavailable");
			}
			double fruitPrice = weight * pricePerKilo.doubleValue();
			totalCost = totalCost + fruitPrice;
		}
		return totalCost;
	}
}
