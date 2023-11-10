package com.valtech.training.firstspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.firstspringboot.component.EmployeeDAO;
import com.valtech.training.firstspringboot.component.HelloWorld;
import com.valtech.training.firstspringboot.entity.Order;
import com.valtech.training.firstspringboot.service.OrderService;

@SpringBootTest
class FirstSpringBootApplicationTests {


	@Autowired
		private  HelloWorld helloWorld;
	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private OrderService orderService;
	
	
	@Test
	void testOrders() {
		Order o = orderService.createOrder(new Order("Macbook pro M3",25,"For the Entire Team",LocalDate.of(2023,11,8)));
		assertEquals(1, o.getId());
		assertTrue(orderService.getAllOrders().size() > 0);
	}
	
	@Test
	void testEmployeeDAO() {
//		assertEquals(3,employeeDAO.count());
	//assertEquals(3,employeeDAO.getAllEmployees().size());
	}
	 
		@Test
		void contextLoads() {
			assertNotNull(helloWorld);
			assertEquals("Hello Spring Boot", helloWorld.hello());
		}
	 

}
