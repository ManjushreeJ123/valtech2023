package com.valtech.training.ordersspringboot.component;

import java.util.List;

public interface OrderDAO {
	//void deleteOrder(int order_id);
	
	void Orders(int cid);
	void updateOrders(Order o);
	void createOrders(Order o);
	long count();
	
	//List<Order> getAllOrder(); 
	Order getOrder(int order_id) ;
	
}
	

