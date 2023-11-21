package com.valtech.training.ordersspringboot.component;

import java.util.List;

public interface CompanyDAO {
	void deleteCompany(int pid);
	void updateCompany(Company com);
	void createCompnay(Company com);
	long count();
	  List<Company>getAllCompany();
	  Company getCompany(int company_id);
	  

}
