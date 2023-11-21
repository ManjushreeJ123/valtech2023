package com.valtech.training.ordersspringboot.component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.valtech.training.ordersspringboot.component.CustomersDAOImpl.CustomersRowMapper;
@Component
public class OrderDAOImpl implements OrderDAO{
	public class OrderRowMapper implements RowMapper<Order>{

		@Override
		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			Order o = new Order();
			o.setOrder_id(rs.getInt(1));
			o.setOrder_date(rs.getDate(2));
			o.setC_id(rs.getInt(3));
			
			return o;
			
		}
		
	}
	@Autowired
	private DataSource datasource;

	@Override
	public void Orders(int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrders(Order o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createOrders(Order o) {
			String createQry = "INSERT INTO ORDERS (ORDER_ID,ORDER_DATE,C_ID) VALUES (?,?,?)";
			new JdbcTemplate(datasource).update(createQry, o.getOrder_id(), o.getOrder_date(), o.getC_id());
						
		
	}

	@Override
	public long count() {
		String countQry = "Select count(cid) from Orders";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	
	}
	

//	@Override
//	public List<Order> getAllOrder() {
//		String selectAllQry = "SELECT CID,NAME,PHONENO,EMAIL,ADD_ID, FROM CUSTOMERS";
//		return new JdbcTemplate(datasource).query(selectAllQry, new OrderRowMapper());
//	}

	@Override
	public Order getOrder(int order_id) {
		
		return null;
	}


}
