package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.OrderMaster;
import com.rms.services.OrderMasterService;

@RestController
public class OrderMasterController {
	@Autowired
	OrderMasterService orderMasterService;
	
	@GetMapping("/getAllOrderMasters")
	public Iterable<OrderMaster> getAllOrderMasters(){
		return orderMasterService.getAllOrderMasters();
	}
	
	@PostMapping("/addOrderMaster")
	public OrderMaster addOrderMaster(@RequestBody OrderMaster orderMaster) {
		return orderMasterService.addOrderMaster(orderMaster);
	}
	
	@PutMapping("/updateOrderMaster")
	public OrderMaster updateOrderMaster(@RequestBody OrderMaster orderMaster) {
		return orderMasterService.updateOrderMaster(orderMaster);
	}
	
	@DeleteMapping("/deleteOrderMaster/{id}")
	public void deleteOrderMaster(@PathVariable("id")Integer id) {
		orderMasterService.deleteOrderMaster(id);
	}

}
