package com.valtech.training.ordersspringboot.component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class CustomerAddressDAOImpl implements CustomerAddressDAO{

	public class CustomerAddressRowMapper implements RowMapper<CustomerAddress> {
		
		@Override
		public CustomerAddress mapRow(ResultSet rs, int rowNum) throws SQLException {

			CustomerAddress ca = new CustomerAddress();
			ca.setC_id(rs.getInt(1));
			ca.setStreet(rs.getString(2));
			ca.setTown(rs.getString(3));
			ca.setState(rs.getString(4));
			ca.setZipcode(rs.getInt(5));

			return ca;
		}
	}
	@Autowired
 private DataSource datasource;
	@Override
	public void deleteCustomerAddress(int c_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomerAddress(CustomerAddress ca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomerAddress(CustomerAddress ca) {
		String createQry = "INSERT INTO CUSTOMERADDRESS (C_ID,STREET,TWON,STATE,ZIPCODE) VALUES (?,?,?,?.?)";
		new JdbcTemplate(datasource).update(createQry, ca.getC_id(), ca.getStreet(), ca.getTown(), ca.getState(),ca.getZipcode());
					
	}
		
	

	@Override
	public List<CustomerAddress> getAllCustomerAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerAddress getCustomerAddress(int c_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
