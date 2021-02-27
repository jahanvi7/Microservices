package com.cognizant.menuItem.dao;

import java.util.*;

import org.springframework.stereotype.Component;

import com.cognizant.menuItem.model.MenuItem;

@Component
public interface MenuItemDao {
	
	public List<MenuItem> getMenuItemListAdmin();
	
	public List<MenuItem> getMenuItemListCustomer();
	
	public void modifyMenuItem(MenuItem menuItem);
	
	public MenuItem getMenuItem(long menuItemId);
}
