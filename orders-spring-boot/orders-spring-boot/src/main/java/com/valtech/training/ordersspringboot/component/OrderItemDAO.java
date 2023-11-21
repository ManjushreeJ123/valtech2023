package com.valtech.training.ordersspringboot.component;

import java.util.List;

public interface OrderItemDAO {

	void deleteOrderItem(int itemid);
	void updateOrderItem(OrderItem o);
	void createOrderItem(OrderItem o);
	long count();
	
	List<OrderItem> getAllOrderItem(); 
	Product getOrderItem(int id) ;
	
}
