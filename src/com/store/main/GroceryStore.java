package com.store.main;

import java.util.List;

import com.store.calculator.FruitPriceCalculator;
import com.store.entity.Basket;
import com.store.entity.item.Fruit;

/**
 * A class to model the actions of a grocery store
 * @author Owner
 *
 */
public class GroceryStore {
	
	private final FruitPriceCalculator calculator;

	public GroceryStore(FruitPriceCalculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public Basket getBasket() {
		return new Basket();
	}

	public double checkout(Basket basket) {
		List<Fruit> fruits = basket.getItems();

		double totalCost = 0.0;
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
			double price = calculator.calculatePrice(fruit);
			totalCost = totalCost + price;
		}
		return totalCost;
	}
}
