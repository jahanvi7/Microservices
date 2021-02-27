package com.cognizant.cart.dao;

import java.util.List;

import com.cognizant.cart.exception.CartEmptyException;
import com.cognizant.cart.model.MenuItem;

public interface CartDao {
	
	public void addCartItem(String userId, long menuItemId);

	public List<MenuItem> getAllCartItems(String userId) throws CartEmptyException;

	public void removeCartItem(String userId, long menuItemId) throws CartEmptyException;
}
