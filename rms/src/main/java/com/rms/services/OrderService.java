package com.rms.services;

import com.rms.entities.Order;

public interface OrderService {
	Iterable<Order> getAllOrders();
	Order addOrder(Order order);
	Order updateOrder(Order order);
	void deleteOrder(Integer id);

}
