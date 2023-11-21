package com.valtech.training.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.contains;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.assignment.components.Company;
import com.valtech.training.assignment.components.CompanyDAO;
import com.valtech.training.assignment.components.CustomerAddress;
import com.valtech.training.assignment.components.CustomerAddressDAO;
import com.valtech.training.assignment.components.CustomerDAO;
import com.valtech.training.assignment.components.CustomerOrder;
import com.valtech.training.assignment.components.CustomerOrderDAO;
import com.valtech.training.assignment.components.OrderItemDAO;
import com.valtech.training.assignment.components.OrderItems;
import com.valtech.training.assignment.components.Product;
import com.valtech.training.assignment.components.ProductDAO;

@SpringBootTest
class AssignmentSpringBootApplicationTests {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private CustomerOrderDAO customerOrderDAO;
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	
	@Autowired
	CustomerAddressDAO addressDAO;
	
	@Autowired
	CompanyDAO companyDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	OrderItemDAO orderItemDAO;
//	@Autowired
//	private EmployeeService employeeService;
	
//	@Test
//	void testCustomer() {
//		
////		Employee employee=new Employee("Manjushree", 10, 1, 100000);
////		employeeService.createEmployee(employee);
////		assertEquals(1, employee.getId());
//		
//		customerDAO.saveCustomer(new Customer("takie","982873873",takie@gmail.com"));
//		customerDAO.saveCustomer(new Customer("jaya","82777364","jaya@gmail.com"));
//		
////		customerDAO.updateCustomer(new Customer("ram","123654","ram@gmail.com"), 3);
//		assertEquals(3, customerDAO.countCustomer());
//		
//	}
//	
//	@Test
//	void tetsCustomerOrder() throws ParseException {
//		
//		customerOrderDAO.createOrder(new CustomerOrder(df.parse("18-09-2023"),2));
////		customerOrderDAO.updateOrder(new CustomerOrder(df.parse("23-11-2023"),2), 5);
////		assertEquals(4,customerOrderDAO.countOrder());
////		customerOrderDAO.deleteOrder(5);
//		assertEquals(4,customerOrderDAO.countOrder());
//		
//	}
	
//	@Test
//	void testAddress() {
////		CustomerAddress address=new CustomerAddress(2,"jayanagar","bengaluru","karnataka",560041);
////		addressDAO.setAddress(address);
////		addressDAO.updateAddress(new CustomerAddress("hanuman","bengaluru","karnataka",560041),2);
//		addressDAO.deleteAddress(2);
//		assertEquals(1, addressDAO.count());
//	}
	
//	@Test
//	void testCompany() {
//		companyDAO.addCompany(new Company("vivo","mg road","bengaluru","karnatak",560032));
////		companyDAO.updateCompany(new Company("OPPO","SP road","bengaluru","karnatak",560032), 3);
//		assertEquals(4, companyDAO.count());
//		companyDAO.deleteCompany(5);
//		assertEquals(3, companyDAO.count());
//	}
	
//	@Test
//	void testProduct() {
////		productDAO.addProduct(new Product(20000,"Air Pods",1));
////		productDAO.updateProduct(new Product(16000,"Air Pods"),2);
//		productDAO.addProduct(new Product(20000,"AC",2));
////		productDAO.deleteProduct(3);
//		assertEquals(3,productDAO.countProduct());
//		
//	}
	
//	int orderId, int quantity, int productId, double amount
	@Test
	void testOrderItem() {
//		orderItemDAO.addOrderItems(new OrderItems(1, 10, 1, 200000));
//		orderItemDAO.updateOrderItems(new OrderItems(2, 5, 2, 565000), 2);
		orderItemDAO.deleteOrderItems(3);
		assertEquals(2,orderItemDAO.countOrderItem());
		
	}

	
	
}
 