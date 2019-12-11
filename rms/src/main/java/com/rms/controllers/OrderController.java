package com.rms.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rms.entities.Order;
import com.rms.services.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@GetMapping(path="/getAllOrders")
	public Iterable<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@DeleteMapping(path="deleteOrder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {
		orderService.deleteOrder(id);
	}
	
	@PostMapping(path="/addOrder")
	public Order addOrder(@RequestBody Order Order) {
		return orderService.addOrder(Order);
	}
	
	@PutMapping(path="/updateOrder")
	public Order updateOrder(@RequestBody Order Order) {
		return orderService.updateOrder(Order);
	}
}

