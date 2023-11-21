package com.valtech.training.ordersspringboot.component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
private int pid;
private int unitPrice;
private String description;
private int company_id;
public Product() {
}
public Product(int pid, int unitPrice, String description, int company_id) {
	super();
	this.pid = pid;
	this.unitPrice = unitPrice;
	this.description = description;
	this.company_id = company_id;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(int unitPrice) {
	this.unitPrice = unitPrice;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}




}
