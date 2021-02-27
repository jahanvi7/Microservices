package com.cognizant.cart.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.cart.dao.CartDao;
import com.cognizant.cart.exception.CartEmptyException;
import com.cognizant.cart.model.MenuItem;

@Service
public class CartService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CartService.class);
	
	@Autowired
	private CartDao cartDao;

	public CartDao getCartDao() {
		LOGGER.info("START");
		LOGGER.info("End");
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		LOGGER.info("START");
		LOGGER.info("End");
		this.cartDao = cartDao;
	}
	
	public void addCartItem(String userId, long menuItemId) {
		LOGGER.info("START");
		LOGGER.info("End");
		cartDao.addCartItem(userId, menuItemId);
	}
	
	public List<MenuItem> getAllCartItems(String userId) throws CartEmptyException{
		LOGGER.info("START");
		LOGGER.info("End");
		return cartDao.getAllCartItems(userId);
	}
	
	public void deleteCartItem(String userId, long menuItemId) throws CartEmptyException {
		LOGGER.info("START");
		LOGGER.info("End");
		cartDao.removeCartItem(userId, menuItemId);
	}
}

