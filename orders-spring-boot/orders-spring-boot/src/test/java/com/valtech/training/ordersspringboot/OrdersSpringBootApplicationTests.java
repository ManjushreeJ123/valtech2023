package com.valtech.training.ordersspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.valtech.training.ordersspringboot.component.Customers;
import com.valtech.training.ordersspringboot.component.CustomersDAO;
import com.valtech.training.ordersspringboot.component.OrderDAO;

@SpringBootTest
class OrdersSpringBootApplicationTests {

//	@Test
//	void contextLoads() {
//	@Autowired
//	private CustomersDAO customersDao;
//	@Autowired
//	private OrderDAO orderDao;
		
		@Test
		void testCustomersDAO() {
//			//creation of customer
//		Customers c = new Customers("Manjushree",725966734,"manjushreej@gmail.com","Bangalore");
//		customersDao.createCustomers(c);
//		assertEquals(1,customersDao.count());
}

@Test
void testOrderDAO() {
//	Order o = new Order();
}
	@Test
	void testProductDAO() {


	}
	
	@Test
	void testCompanyDAO() {
		
	}
@Test
void testCustomerAddressDAO() {
	
}

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
//	
//	@Test
//	void testCustomersDAO() {
//		//creation of customer
//	Customers c = new Customers(1,"Manjushree",725966734,"manjushreej@gmail.com","Bangalore");

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

	}
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

	 


