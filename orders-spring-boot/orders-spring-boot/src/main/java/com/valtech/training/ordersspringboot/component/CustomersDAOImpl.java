package com.valtech.training.ordersspringboot.component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
//import com.example.training.invoicespringboot.component;

//import com.example.training.invoicespringboot.Customers;

@Component
public class CustomersDAOImpl implements CustomersDAO {
	
	public class CustomersRowMapper implements RowMapper<Customers> {
		
				@Override
				public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
		
					Customers c = new Customers();
					c.setCid(rs.getInt(1));
					c.setName(rs.getString(2));
					c.setPhoneNo(rs.getInt(3));
					c.setEmail(rs.getString(4));
					c.setAdd_id(rs.getString(5));
		
					return c;
				}
		
			}
		
			@Autowired
			private DataSource datasource;
//			private String inserQuery = "INSERT INTO CUSTOMERS(CID,NAME,PHONEno,EMAIL,ADD_ID) VALUES(?,?,?,?,?)";
//			private String updateQuery = "UPDATE CUSTOMERS SET NAME=?,PHONENO=?,EMAIL=? WHERE CID=?";
//			private String deleteQuery = "DELETE FROM CUSTOMERS WHERE CID=?";
//			private String getByIDQuery = "SELECT *FROM CUSTOMERS WHERE CID=?";
//			private String countQuery="SELECT COUNT(C_ID) FROM CUSTOMER";
//			private String getAllCus="SELECT *FROM CUSTOMERS";
		

			@Override
			public void createCustomers(Customers cus) {
				String createQry = "INSERT INTO CUSTOMERS (CID,NAME,PHONENO,EMAIL,ADD_ID) VALUES (?,?,?,?,?)";
				new JdbcTemplate(datasource).update(createQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
							cus.getAdd_id());
			}


	@Override
	public void deleteCustomers(int cid) {
		String deleteQry = "DELETE FROM Customers WHERE ID = ?";
	new JdbcTemplate(datasource).update(deleteQry, cid);
		
	}

	@Override
	public void updateCustomers(Customers cus) {
		String updateQry = "UPDATE EMPLOYEE SET CID= ? , NAME = ? , PHONENO = ? , EMAIL= ? ,ADD_ID = ? WHERE CID = ?";
	new JdbcTemplate(datasource).update(updateQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
			cus.getAdd_id(), cus.getCid());
	}


	@Override
	public long count() {
		String countQry = "Select count(cid) from Customers";
		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
	
	}


	@Override
	public List<Customers> getAllCustomers() {
		String selectAllQry = "SELECT CID,NAME,PHONENO,EMAIL,ADD_ID, FROM CUSTOMERS";
		return new JdbcTemplate(datasource).query(selectAllQry, new CustomersRowMapper());
	}

	@Override
	public Customers getCustomers(int id) {
		String selectQry="SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID= ?";
	return new JdbcTemplate(datasource).queryForObject(selectQry,new CustomersRowMapper());
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			

//		