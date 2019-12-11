package com.rms.services;

import com.rms.entities.Item;

public interface ItemService {
	public Iterable<Item> getAllItem();
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public void deleteItem(Integer id);
}
