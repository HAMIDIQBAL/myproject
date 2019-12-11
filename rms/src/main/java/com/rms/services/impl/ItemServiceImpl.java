package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.ItemRepository;
import com.rms.entities.Item;
import com.rms.services.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemRepository itemRepository;

	@Override
	public Iterable<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Transactional
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Transactional
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Transactional
	public void deleteItem(Integer id) {
		itemRepository.deleteById(id);
	}

}
