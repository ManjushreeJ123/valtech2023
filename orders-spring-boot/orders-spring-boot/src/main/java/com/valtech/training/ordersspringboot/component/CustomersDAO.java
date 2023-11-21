package com.valtech.training.ordersspringboot.component;

import java.util.List;

import org.springframework.stereotype.Component;

//import com.example.training.invoicespringboot.entities.Customers;


//import com.example.training.invoicespringboot.entities.Customers;

//import com.valtech.training.firstspringboot.component.Employee;

public interface CustomersDAO {
	

	void deleteCustomers(int cid);
	void updateCustomers(Customers cus);
	void createCustomers(Customers cus);
	long count();
	
	List<Customers> getAllCustomers(); 
	Customers getCustomers(int id) ;
	
}