package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.OrderRepository;
import com.rms.entities.Order;
import com.rms.services.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Iterable<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Transactional
	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}

	@Transactional
	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	@Transactional
	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);
	}
}	
	