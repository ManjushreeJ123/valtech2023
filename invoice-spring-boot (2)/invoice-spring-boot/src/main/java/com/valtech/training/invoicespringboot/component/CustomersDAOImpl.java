package com.valtech.training.invoicespringboot.component;

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
		

			@Override
			public void createCustomers(Customers cus) {
				String createQry = "INSERT INTO CUSTOMERS (CID,NAME,PHONEN0,EMAIL,ADD_ID) VALUES (?,?,?,?,?)";
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

//	@Override
//	public void createCustomers(Customers cus) {
//		String createQry = "INSERT INTO CUSTOMERS (CID,NAME,PHONEN0,EMAIL,) VALUES (?,?,?,?,?)";
//		new JdbcTemplate(datasource).update(createQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
//					cus.getAdd_id());
//	}

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
//	@Override
//	public void updateCustomers1(Customers cus) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteCustomers1(int cid) {
//		String deleteQry = "DELETE FROM Customers WHERE ID = ?";
//	new JdbcTemplate(datasource).update(deleteQry, cid);
//		
//	}
//
//	@Override
//	public void createCustomers1(Customers cus) {
//	
//		String createQry = "INSERT INTO CUSTOMERS (CID,NAME,PHONEN0,EMAIL,) VALUES (?,?,?,?,?)";
//	new JdbcTemplate(datasource).update(createQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
//				cus.getAdd_id());
//	}
//
//	@Override
//	public List<Customers> getAllCustomers1() {
//		String selectAllQry = "SELECT CID,NAME,PHONENO,EMAIL,ADD_ID, FROM CUSTOMERS";
// return new JdbcTemplate(datasource).query(selectAllQry, new CustomersRowMapper());
//
//	}
//
//	@Override
//	public Customers getCustomers1(int cid) {
//		String selectQry="SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID= ?";
//	return new JdbcTemplate(datasource).queryForObject(selectQry,new CustomersRowMapper());
//	}
//
//	@Override
//	public void updateCustomers11(Customers cus) {
//	
//		String updateQry = "UPDATE EMPLOYEE SET CID= ? , NAME = ? , PHONENO = ? , EMAIL= ? ,ADD_ID = ? WHERE CID = ?";
//	new JdbcTemplate(datasource).update(updateQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
//			cus.getAdd_id(), cus.getCid());
//	}
//	
//}
//
//	public class CustomersRowMapper implements RowMapper<Customers> {
//
//		@Override
//		public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//			Customers c = new Customers();
//			c.setCid(rs.getInt(1));
//			c.setName(rs.getString(2));
//			c.setPhoneNo(rs.getInt(3));
//			c.setEmail(rs.getString(4));
//			c.setAdd_id(rs.getString(5));
//
//			return c;
//		}
//
//	}
//
//	@Autowired
//	private DataSource datasource;
//
//	@Override
//	public long count() {
//		String countQry = "Select count(id) from Customers";
//		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
//
//	}
//
//	@Override
//	public void deleteCustomers1(int cid) {
//		String deleteQry = "DELETE FROM Customers WHERE ID = ?";
//		new JdbcTemplate(datasource).update(deleteQry, cid);
//
//	}
//
//	@Override
//	public void updateCustomers1(Customers cus) {
//		String updateQry = "UPDATE EMPLOYEE SET CID= ? , NAME = ? , PHONENO = ? , EMAIL= ? ,ADD_ID = ? WHERE CID = ?";
//		new JdbcTemplate(datasource).update(updateQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
//				cus.getAdd_id(), cus.getCid());
//	}
//
//	@Override
//	public void createCustomers1(Customers cus) {
//		String createQry = "INSERT INTO CUSTOMERS (CID,NAME,PHONEN0,EMAIL,) VALUES (?,?,?,?,?)";
//		new JdbcTemplate(datasource).update(createQry, cus.getCid(), cus.getName(), cus.getPhoneNo(), cus.getEmail(),
//				cus.getAdd_id());
//	}
//
//	@Override
//	public List<Customers> getAllCustomers1() {
//		String selectAllQry = "SELECT CID,NAME,PHONENO,EMAIL,ADD_ID, FROM CUSTOMERS";
//		return new JdbcTemplate(datasource).query(selectAllQry, new CustomersRowMapper());
//
//	}
//
//	@Override
//	public Customers getCustomers1(int cid) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void updateCustomers11(Customers cus) {
//		// TODO Auto-generated method stub
//
//	}
//}
//
//		@Override
//	public void updateCustomers1(com.example.training.invoicespringboot.entities.Customers cus)			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void createCustomers1(com.example.training.invoicespringboot.entities.Customers cus) {
//			// TODO Auto-generated method stub
//		}
//		@Override
//		public void updateCustomers11(com.example.training.invoicespringboot.entities.Customers cus) {
//		// TODO Auto-generated method stub
//			
//		}
//	 
//		@Override
//		public Customers getCustomers1(int cid)  {
//			String selectQry="SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID= ?";
//			return new JdbcTemplate(datasource).queryForObject(selectQry,new CustomersRowMapper());
//		}
//		