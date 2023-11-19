package com.valtech.training.hibernateAssignment;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class CustAddress {
	
//	@Id @GeneratedValue(strategy = GenerationType.AUTO)
//	private int customerAddressId;
	
	private String street;
	private String city;
	private String state;
	private int zipCode;

	@OneToOne(targetEntity = Customers.class, cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH}, 
			fetch = FetchType.EAGER)
	private Customers customer;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public CustAddress(String street, String city, String state, int zipCode, Customers customer) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.customer = customer;
	}

	public CustAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}