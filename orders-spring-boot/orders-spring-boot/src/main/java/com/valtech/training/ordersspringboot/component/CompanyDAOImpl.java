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
public class CompanyDAOImpl implements CompanyDAO{

	public class CompanyRowMapper implements RowMapper<Company> {
		
				@Override
				public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		
					Company com = new Company();
					com.setCompany_id(rs.getInt(1));
					com.setName(rs.getString(2));
					
		
					return com;
				}
		
			}
		
			@Autowired
			private DataSource datasource;
		

		


	@Override
	public void deleteCompany(int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompany(Company com) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCompnay(Company com) {
		String createQry = "INSERT INTO COMPANY (COMPANY_ID,NAME) VALUES (?,?)";
		new JdbcTemplate(datasource).update(createQry, com.getCompany_id(), com.getName());
		
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getCompany(int company_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
