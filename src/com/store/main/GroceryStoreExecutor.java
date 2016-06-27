package com.store.main;

import com.store.calculator.FruitPriceCalculator;
import com.store.calculator.FruitPriceCalculatorFactory;
import com.store.entity.Basket;
import com.store.entity.FruitPriceCalculatorType;
import com.store.entity.item.Apple;
import com.store.entity.item.Banana;
import com.store.entity.item.Lemon;
import com.store.entity.item.Orange;
import com.store.entity.item.Peach;

/**
 * The entry point of the program that constructs a basket of items and invokes
 * the calculator to output its total cost
 * 
 * @author Owner
 *
 */
public class GroceryStoreExecutor {

	public static void main(String[] args) {

		FruitPriceCalculator calculator = FruitPriceCalculatorFactory.getFruitPriceCalculator(FruitPriceCalculatorType.WEIGHT);
		GroceryStore groceryStore = GroceryStoreFactory.getGroceryStore(calculator);
		Basket basket = groceryStore.getBasket();
		
		basket.addItem(new Apple(0.35, 3));
		basket.addItem(new Banana(0.7, 5));
		basket.addItem(new Lemon(0.3, 4));
		basket.addItem(new Peach(1.05, 6));
		basket.addItem(new Orange(1.5, 6));

		double totalCost = groceryStore.checkout(basket);

		System.out.println("Total cost of basket: " + totalCost);
	}
}
