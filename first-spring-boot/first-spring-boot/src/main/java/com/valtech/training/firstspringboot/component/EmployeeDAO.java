package com.valtech.training.firstspringboot.component;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	 long count() ;

	void deleteEmployee(int id) ;

	void updateEmployee(Employee emp) ;
	void createEmployee(Employee emp); 

	List<Employee> getAllEmployees(); 
	Employee getEmployee(int id) ;
	
//	int firstId() throws SQLException;
//	int lastId() throws SQLException;
//	int nextId(int id) throws SQLException;
//	int priveious(int id) throws SQLException;

}