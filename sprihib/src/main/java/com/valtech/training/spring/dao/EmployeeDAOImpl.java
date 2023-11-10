package com.valtech.training.spring.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.valtech.training.hibernate.Employee;
 @Repository//All DAO Classes will be defined using the Respository
 //@Service for all classes that are service class... they will need Tx support
 //@Controller for all classes when we want them to be used for Presentation logic
 //@Component They are general class which have to be registered with BeanFactory
 
public class EmployeeDAOImpl implements EmployeeDAO {
	private SessionFactory sessionFactory;
 
	@Override
	public void deleteEmployee(Employee emp) {
		Session ses = sessionFactory.getCurrentSession();
		ses.delete(emp);
		//ses.close();
 
	}
 
	@Override
	public Employee saveEmployee(Employee emp) {
		Session ses = sessionFactory.getCurrentSession();
		ses.persist(emp);
		//ses.close();
		return emp;
	}
 
	@Override
	public Employee loadEmployee(int empId) {
		Session ses = sessionFactory.getCurrentSession();
		Employee emp = (Employee) ses.load(Employee.class, empId);
		//ses.close();
		return emp;
	}
 
	@Override
	public Employee updateEmployee(Employee emp) {
		Session ses = sessionFactory.getCurrentSession();
		emp = (Employee) ses.merge(emp);
		//ses.close();
		return emp;
 
	}
 
	@Override
	public List<Employee> getAllEmployees() {
		Session ses = sessionFactory.getCurrentSession();
		List<Employee> emps = ses.createQuery("from Employee e").list();
		//ses.close();
		return emps;
 
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
}