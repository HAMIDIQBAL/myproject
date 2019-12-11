package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.MenuRepository;
import com.rms.entities.Menu;
import com.rms.services.MenuService;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	MenuRepository menuRepository;
	@Override
	public Iterable<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}

	@Transactional
	public Menu addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menuRepository.save(menu);
	}

	@Transactional
	public Menu updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menuRepository.save(menu);
	}

	@Transactional
	public void deleteMenu(Integer id) {
		menuRepository.deleteById(id);
	}

}
