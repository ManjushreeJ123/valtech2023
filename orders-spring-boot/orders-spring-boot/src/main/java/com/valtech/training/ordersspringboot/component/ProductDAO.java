package com.valtech.training.ordersspringboot.component;

import java.util.List;

public interface ProductDAO {
	

	void deleteProduct(int pid);
	void updateProduct(Product p);
	void createProduct(Product p );
	long count();
	
	List<Product> getAllProduct(); 
	Product getProduct(int id) ;
	

}
