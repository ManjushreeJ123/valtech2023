package com.valtech.training.ordersspringboot.component;

import java.util.List;

public interface CustomerAddressDAO {
	void deleteCustomerAddress(int c_id);
	void updateCustomerAddress(CustomerAddress ca);
	void createCustomerAddress(CustomerAddress ca);
	
	List<CustomerAddress>getAllCustomerAddress();
	CustomerAddress getCustomerAddress(int c_id);
	

}
