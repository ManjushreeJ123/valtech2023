package com.valtech.training.ordersspringboot.component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	private int company_id;
	private String name;
	
	public Company() {
		
	}

	public Company(int company_id, String name) {
		super();
		this.company_id = company_id;
		this.name = name;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
