package com.cognizant.menuItem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menuItem.MenuItemApplication;
import com.cognizant.menuItem.model.MenuItem;
import com.cognizant.menuItem.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);
	
	@Autowired
	private MenuItemService menuItemService;

	@GetMapping
	public List<MenuItem> getAllMenuItems() {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItemListCustomer();
	}
	
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id){
		return menuItemService.getMenuItem(id);
	}
	
	@PutMapping()
	public void modifyMenuItem(@RequestBody MenuItem menuItem) {
		menuItemService.modifyMenuItem(menuItem);
	}
}


