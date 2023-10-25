package com.valtech.training.day3;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	 public long count() throws SQLException;

	void deleteEmployee(int id) throws SQLException;

	void updateEmployee(Employee emp) throws SQLException;

	void createEmployee(Employee emp) throws SQLException;

	List<Employee> getAllEmployees() throws SQLException;

	Employee getEmployee(int id) throws SQLException;
	
	
	int firstId() throws SQLException;
	int lastId() throws SQLException;
	int nextId(int id) throws SQLException;
	int priveious(int id) throws SQLException;

}