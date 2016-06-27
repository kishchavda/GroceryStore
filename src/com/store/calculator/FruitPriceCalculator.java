package com.store.calculator;

import com.store.entity.item.Fruit;

/**
 * An interface to provide the price of fruits depending on pricing methodology
 * 
 * @author Owner
 *
 */
public interface FruitPriceCalculator {
	
	/**
	 * Calculates the price of a given fruit
	 * 
	 * @param fruit
	 * @return fruit price
	 */
	double calculatePrice(Fruit fruit);
}
