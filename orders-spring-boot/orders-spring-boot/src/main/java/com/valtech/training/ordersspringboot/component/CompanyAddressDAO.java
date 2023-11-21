package com.valtech.training.ordersspringboot.component;

import java.util.List;

public interface CompanyAddressDAO {
	void deleteCompany(int company_id);
	void updateCompany(Company ca);
	void createCompany(Company ca);
	
	List<Company>getAllCompany();
	Company getCompany(int company_id);
	

}
