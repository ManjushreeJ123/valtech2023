package com.valtech.training.invoicespringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.invoicespringboot.component.HelloWorld;

@SpringBootTest
class InvoiceSpringBootApplicationTests {
	@Autowired
	private HelloWorld helloWorld;
	@Test
	void contextLoads() {
		assertNotEquals(helloWorld);
		assertEquals("Hello Spring Boot", helloWorld.hello());
	}
	private void assertNotEquals(HelloWorld helloWorld2) {
		// TODO Auto-generated method stub
		
	}
	
}



//
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.example.training.invoicespringboot.component.Customers;
//import com.example.training.invoicespringboot.component.CustomersDAO;
//import com.example.training.invoicespringboot.component.HelloWorld;
////import com.example.training.invoicespringboot.components.CustomersDAO;
////import com.example.training.invoicespringboot.entities.Customers;
//
//@SpringBootTest
//class InvoiceSpringBootApplicationTests {
//
//	@Autowired
//	private CustomersDAO customersDao;
//	@Autowired
//	private HelloWorld helloWorld;
//	@Test
//	void contextLoads() {
//		assertNotNull(helloWorld);
//		assertEquals("Hello Spring Boot", helloWorld.hello());
//	}
	
//	@Test
//	void testCustomersDAO() {
//		//creation of customer
//	Customers c = new Customers(1,"Manjushree",725966734,"manjushreej@gmail.com","Bangalore");
//
//	customersDao.createCustomers(c);
//		assertEquals(1, customersDao.count());
		//Get all customer
//		List<Customers> customer = customersDao.getAllCustomers();
//		System.out.println(customer);
		
		//Get customer
//		Customers cus =customersDao.getCustomers(1);
//		System.out.println(customer);
		//delete customers
//		customersDao.deleteCustomers(2);
//		assertEquals(0,customersDao.count());

	//}
//}






//import com.example..training.invoicespringboot.service.OrderService;




//import static org.junit.jupiter.api.Assertions.assertEquals;
// 
//import java.util.List;
// 
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
 
 
//@SpringBootTest
//class InvoiceSpringBootApplicationTests {

//	@Autowired
//	public CustomersDAO customersDao;
//	@Test
//	void testCustomersDao() {
//		//creation of customer
////		Customers cus = new Customers("1","Manjushree",725966734,"manjushreej@gmail.com","2");
////		customersDao.createCustomers(cus);
////		assertEquals(1, customersDao.count());
//		//Get all customer
////		List<Customers> customer = customersDao.getAllCustomers();
////		System.out.println(customers);
////		
////		//Get customer
////		Customers cus =customersDao.getCustomers(1);
////		System.out.println(customers);
//		//delete customer
////		customersDao.deleteCustomers(2);
////		assertEquals(0,customersDao.count());

	//}

	 


