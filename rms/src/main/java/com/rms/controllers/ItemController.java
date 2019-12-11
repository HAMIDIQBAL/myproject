package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.Item;
import com.rms.services.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@GetMapping(path="/getAllItem")
	public Iterable<Item> getAllItem(){
		return itemService.getAllItem();
	}
	
	@DeleteMapping(path="deleteItem/{id}")
	public void deleteItem(@PathVariable("id") Integer id) {
		itemService.deleteItem(id);
	}
	
	@PostMapping(path="/addItem")
	public Item addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}
	
	@PutMapping(path="/updateItem")
	public Item updateItem(@RequestBody Item item) {
		return itemService.updateItem(item);
	}
}


