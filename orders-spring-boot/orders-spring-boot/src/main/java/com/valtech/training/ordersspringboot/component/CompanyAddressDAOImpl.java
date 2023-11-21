package com.valtech.training.ordersspringboot.component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class CompanyAddressDAOImpl implements CompanyAddressDAO {

	public class CompanyRowMapper implements RowMapper<Company> {
		
				@Override
				public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		
					Company c = new Company();
					c.setCompany_id(rs.getInt(1));
					c.setName(rs.getString(2));
				
		
					return c;
				}
		
			}
		
			@Autowired
			private DataSource datasource;

			@Override
			public void deleteCompany(int company_id) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void updateCompany(Company ca) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void createCompany(Company ca) {
				// TODO Auto-generated method stub
				
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
