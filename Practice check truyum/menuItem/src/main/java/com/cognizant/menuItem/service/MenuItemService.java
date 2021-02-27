package com.cognizant.menuItem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.menuItem.dao.MenuItemDao;
import com.cognizant.menuItem.model.MenuItem;

@Service
public class MenuItemService {

	@Autowired
	private MenuItemDao menuItemDao;

	public MenuItemDao getMenuItemDao() {
		return menuItemDao;
	}

	public void setMenuItemDao(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		return menuItemDao.getMenuItemListCustomer();
	}
	
	public List<MenuItem> getMenuItemListAdmin(){
		return menuItemDao.getMenuItemListAdmin();
	}
	
	public MenuItem getMenuItem(long id) {
		return menuItemDao.getMenuItem(id);
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		menuItemDao.modifyMenuItem(menuItem);
	}
}


