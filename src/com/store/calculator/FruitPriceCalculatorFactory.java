package com.store.calculator;

import com.store.entity.FruitPriceCalculatorType;

/**
 * Factory class to construct instances of calculators used to price fruits
 * 
 * @author Owner
 *
 */
public class FruitPriceCalculatorFactory {

	// private constructor
	private FruitPriceCalculatorFactory() {
	}

	/**
	 * Factory method to return the necessary calculator used to price fruits
	 * 
	 * @param calculatorType
	 * @return fruit price calculator
	 */
	public static FruitPriceCalculator getFruitPriceCalculator(FruitPriceCalculatorType calculatorType) {
		if (calculatorType == FruitPriceCalculatorType.UNIT) {
			return new UnitPriceCalculator();
		} else if (calculatorType == FruitPriceCalculatorType.WEIGHT) {
			return new WeightPriceCalculator();
		} else {
			throw new IllegalArgumentException(
					"The calculator type of " + calculatorType + " is not configured to price fruits");
		}
	}
}
