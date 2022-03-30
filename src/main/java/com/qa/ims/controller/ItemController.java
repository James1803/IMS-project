package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item>{
	
	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}
	
	// READ TO LOGGER 
	
	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}
	
	// CREATES ITEM VIA USER INPUT
	
	@Override
	public Item create() {
		LOGGER.info("Please enter the item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter the item description ");
		String itemDesc = utils.getString();
		LOGGER.info("please enter the price");
		Long price = utils.getLong();
		Item item = itemDAO.create(new Item(itemName, itemDesc, price));
		LOGGER.info("Item created");
		return item;
	}
	
	// UPDATES ITEM VIA USER INPUT
	
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter the item description ");
		String itemDesc = utils.getString();
		LOGGER.info("please enter the price");
		Long price = utils.getLong();
		Item item = itemDAO.update(new Item(id, itemName, itemDesc, price));
		LOGGER.info("Item Updated");
		return item;
	}
	
	// DELETES ITEM VIA USER INPUT
	
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long id = utils.getLong();
		return itemDAO.delete(id);
	}
	
}
