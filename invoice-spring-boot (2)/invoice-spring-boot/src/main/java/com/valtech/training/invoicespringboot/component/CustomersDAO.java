package com.valtech.training.invoicespringboot.component;

import java.util.List;

import org.springframework.stereotype.Component;

//import com.example.training.invoicespringboot.entities.Customers;


//import com.example.training.invoicespringboot.entities.Customers;

//import com.valtech.training.firstspringboot.component.Employee;
@Component
public interface CustomersDAO {
	

	void deleteCustomers(int id);
	void updateCustomers(Customers cus);
	void createCustomers(Customers cus);
	long count();
	
	List<Customers> getAllCustomers(); 
	Customers getCustomers(int id) ;
	//void updateCustomers(Customers cus);
	
	
	//List<Customers> getAllCustomers() {

//	void deleteCustomers(int id);
//	void updateCustomers(Customers cus);
//	void createCustomers(Customers cus);
//	
//	public long count();
	
//	List<Customers> getAllCustomers(); 
//	Customers getCustomers(int id) ;
//	void updateCustomers1(Customers cus);
//	void deleteCustomers1(int cid);
//	void createCustomers1(Customers cus);
//
//	List<Customers> getAllCustomers1();
//
//	Customers getCustomers1(int cid);
//
//	void updateCustomers11(Customers cus);

//void updateCustomers1(com.example.training.invoicespringboot.component.Customers cus);
//
//void createCustomers1(com.example.training.invoicespringboot.component.Customers cus);

	
	
	
}

