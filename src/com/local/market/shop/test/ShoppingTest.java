package com.local.market.shop.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.local.market.shop.Shopping;
import com.local.market.shop.pojo.Basket;
import com.local.market.shop.utils.ShoppingConstant;

public class ShoppingTest {

	@Test
	public void testGetBasketCost() {
		Shopping shopping = new Shopping();
		List<Basket> basketList = new ArrayList<Basket>();
		basketList.add(addToBasket(ShoppingConstant.BANANA, 3));
		basketList.add(addToBasket(ShoppingConstant.PEACH, 2));
		Integer result = shopping.getBasketCost(basketList);
		assertEquals("18", result.toString());
	}
	
	@Test
	public void testGetBasketCost_wrongItems() {
		Shopping shopping = new Shopping();
		List<Basket> basketList = new ArrayList<Basket>();
		basketList.add(addToBasket("grapes", 3));
		basketList.add(addToBasket("pear", 2));
		Integer result = shopping.getBasketCost(basketList);
		assertEquals("0", result.toString());
	}
	
	/**
	 * Method to add the item and quantity in Basket
	 * @param item
	 * @param quantity
	 * @return Basket
	 */
	private Basket addToBasket(String item, int quantity){
		Basket basket = new Basket();
		basket.setItem(item);
		basket.setQuantity(quantity);
		return basket;
	}

}
