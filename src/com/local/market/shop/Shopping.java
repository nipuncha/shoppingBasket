package com.local.market.shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.local.market.shop.pojo.Basket;
import com.local.market.shop.utils.ShoppingConstant;

public class Shopping {
	
	private static Map<String, Integer> inventory = null;
	
	// Populate the inventory map at class load 
	static{
		inventory = new HashMap<String, Integer>();
		inventory.put(ShoppingConstant.BANANA, 2);
		inventory.put(ShoppingConstant.ORANGE, 3);
		inventory.put(ShoppingConstant.APPLE, 4);
		inventory.put(ShoppingConstant.LEMON, 5);
		inventory.put(ShoppingConstant.PEACH, 6);
	}

	/**
	 * Method to calculate the basket cost for selected items.
	 * @param basket
	 * @return Integer
	 */
	public Integer getBasketCost(List<Basket> basket){
		Integer basketCost = 0;
		for(Basket item : basket){
			Integer price = inventory.get(item.getItem());
			Integer itemCost = 0;
			if(price != null){
				//Calculate item cost
				itemCost = price * item.getQuantity();
			}
			// Total basket cost
			basketCost = basketCost + itemCost; 
		}
		return basketCost;
	}
	
}
