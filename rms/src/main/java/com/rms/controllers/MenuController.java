package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.Menu;
import com.rms.services.MenuService;

@RestController
public class MenuController {
	@Autowired
	MenuService menuService;
	
	@GetMapping(path="/getAllMenu")
	public Iterable<Menu> getAllMenu(){
		return menuService.getAllMenu();
	}
	
	@DeleteMapping(path="deleteMenu/{id}")
	public void deleteMenu(@PathVariable("id") Integer id) {
		menuService.deleteMenu(id);
	}
	
	@PostMapping(path="/addMenu")
	public Menu addMenu(@RequestBody Menu menu) {
		return menuService.addMenu(menu);
	}
	
	@PutMapping(path="/updateMenu")
	public Menu updateMenu(@RequestBody Menu menu) {
		return menuService.updateMenu(menu);
	}
}
