package com.rms.services;

import com.rms.entities.Menu;

public interface MenuService {
	public Iterable<Menu> getAllMenu();
	public Menu addMenu(Menu menu);
	public Menu updateMenu(Menu menu);
	public void deleteMenu(Integer id);
}