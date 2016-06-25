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
 * Provides the price per kilo in pounds of each fruit
 * 
 * @author Owner
 *
 */
public class FruitPrices {
	
	// data structure to store the price of each fruit per kilo in pence
	private static Map<Class<? extends Fruit>, Double> PRICES;
	
	// private constructor
	private FruitPrices() {}
	
	// static initialiser to populate data structure
	// preferably populated by querying a database
	static {
		PRICES = new HashMap<>();
		PRICES.put(Banana.class, 1.10);
		PRICES.put(Peach.class, 1.50);
		PRICES.put(Apple.class, 0.90);
		PRICES.put(Orange.class, 0.95);
		PRICES.put(Lemon.class, 1.05);
	}
	
	/**
	 * Provides the price per kilo of a given fruit
	 * 
	 * @param fruitClass
	 * @return price per kilo of fruit
	 */
	public static Double getPrice(Class<? extends Fruit> fruitClass) {
		return PRICES.get(fruitClass);
	}
}
