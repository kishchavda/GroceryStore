package com.store.main;

import com.store.calculator.FruitPriceCalculator;
/**
 * Factory class to construct instances of grocery stores
 * 
 * @author Owner
 *
 */
public class GroceryStoreFactory {
	
	// private constructor
	private GroceryStoreFactory() {}
	
	/**
	 * Returns an instance of a grocery store
	 * 
	 * @param calculator
	 * @return a grocery store
	 */
	public static GroceryStore getGroceryStore(FruitPriceCalculator calculator) {
		return new GroceryStore(calculator);
	}
}
