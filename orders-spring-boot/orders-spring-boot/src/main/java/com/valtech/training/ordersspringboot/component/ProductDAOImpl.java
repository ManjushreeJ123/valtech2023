package com.valtech.training.ordersspringboot.component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductDAOImpl implements ProductDAO {
	
	public class ProductRowMapper implements RowMapper<Product> {
		
		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setUnitPrice(rs.getInt(2));
			p.setDescription(rs.getString(3));
			p.setCompany_id(rs.getInt(4));
			

			return p;
		}

	}

	@Autowired
	private DataSource datasource;

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProduct(Product p) {
		String createQry = "INSERT INTO Product (PID,UNITPRICE,DESCRIPTION,COMPANY_ID) VALUES (?,?,?,?)";
		new JdbcTemplate(datasource).update(createQry, p.getPid(), p.getUnitPrice(), p.getDescription(), p.getCompany_id());
	}
		
	

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}




}
