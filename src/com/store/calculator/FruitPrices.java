package com.store.calculator;

import java.util.HashMap;
import java.util.Map;

import com.store.entity.item.Apple;
import com.store.entity.item.Banana;
import com.store.entity.item.Fruit;
import com.store.entity.item.Lemon;
import com.store.entity.item.Orange;
import com.store.entity.item.Peach;
/**
 * Provides the price of each fruit
 * 
 * @author Owner
 *
 */
public class FruitPrices {
	
	// data structure to store the price of each fruit in pounds
	private static Map<Class<? extends Fruit>, FruitPrice> PRICES;
	
	// private constructor
	private FruitPrices() {}
	
	// static initialiser to populate data structure
	// preferably populated by querying a database
	static {
		PRICES = new HashMap<>();
		PRICES.put(Banana.class, new FruitPrice(1.10, 0.25));
		PRICES.put(Peach.class, new FruitPrice(1.50, 0.40));
		PRICES.put(Apple.class, new FruitPrice(0.90, 0.15));
		PRICES.put(Orange.class, new FruitPrice(0.95, 0.35));
		PRICES.put(Lemon.class, new FruitPrice(1.05, 0.50));
	}
	
	/**
	 * Provides the price per kilo of a given fruit
	 * 
	 * @param fruitClass
	 * @return price of fruit
	 */
	public static Double getPricePerKilo(Class<? extends Fruit> fruitClass) {
		FruitPrice price = PRICES.get(fruitClass);
		if (price != null) {
			return (Double) price.getPricePerKilo();
		}
		return null;
	}
	
	/**
	 * Provides the unit price of a given fruit
	 * @param fruitClass
	 * @return price of fruit
	 */
	public static Double getUnitPrice(Class<? extends Fruit> fruitClass) {
		FruitPrice price = PRICES.get(fruitClass);
		if (price != null) {
			return (Double) price.getUnitPrice();
		}
		return null;
	}
	
	/**
	 * Inner class to hold the price of fruit, priced in various ways
	 * 
	 * @author Owner
	 *
	 */
	private static class FruitPrice {
		private double pricePerKilo;
		private double unitPrice;
		
		FruitPrice(double pricePerKilo, double unitPrice) {
			super();
			this.pricePerKilo = pricePerKilo;
			this.unitPrice = unitPrice;
		}

		public double getPricePerKilo() {
			return pricePerKilo;
		}

		public double getUnitPrice() {
			return unitPrice;
		}
	}
}
