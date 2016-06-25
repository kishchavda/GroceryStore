package com.store.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.store.entity.item.Fruit;
/**
 * A mutable object that represents a collection of items to be purchased
 * 
 * @author Owner
 *
 */
public class Basket {
	
	private List<Fruit> fruits;
	
	public Basket() {
		this.fruits = new ArrayList<>();
	}
	
	public Basket(List<Fruit> fruits) {
		this();
		this.fruits.addAll(fruits);
	}
	
	public void addItem(Fruit fruit) {
		this.fruits.add(fruit);
	}
	
	public List<Fruit> getItems() {
		return Collections.unmodifiableList(this.fruits);
	}
}
