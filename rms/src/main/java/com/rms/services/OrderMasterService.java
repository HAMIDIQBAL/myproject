package com.rms.services;

import com.rms.entities.OrderMaster;

public interface OrderMasterService {
	Iterable<OrderMaster> getAllOrderMasters();
	OrderMaster addOrderMaster(OrderMaster orderMaster);
	OrderMaster updateOrderMaster(OrderMaster orderMaster);
	void deleteOrderMaster(Integer id);

}
