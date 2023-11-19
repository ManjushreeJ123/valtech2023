package com.valtech.training.invoicespringboot.component;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;


@Entity
public class Customers {
	@Id //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private int phoneNo;
	private String email;
	private String add_id;
	
	public Customers() {
		
	}
	
	
	public Customers(int cid, String name, int phoneNo, String email, String add_id) {
	super();
		this.cid = cid;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.add_id = add_id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdd_id() {
		return add_id;
	}
	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}
}
