package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.OrderMasterRepository;
import com.rms.entities.OrderMaster;
import com.rms.services.OrderMasterService;
@Service
public class OrderMasterServiceImpl implements OrderMasterService {
	
	@Autowired
	OrderMasterRepository orderMasterRepository;
	@Override
	public Iterable<OrderMaster> getAllOrderMasters() {
		return orderMasterRepository.findAll();
	}

	@Transactional
	public OrderMaster addOrderMaster(OrderMaster orderMaster) {
		return orderMasterRepository.save(orderMaster);
	}

	@Transactional
	public OrderMaster updateOrderMaster(OrderMaster orderMaster) {
		return orderMasterRepository.save(orderMaster);
	}

	@Transactional
	public void deleteOrderMaster(Integer id) {
		orderMasterRepository.deleteById(id);
	}

}
