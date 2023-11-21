package com.valtech.training.ordersspringboot.component;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int order_id;
private Date order_date;
private int c_id;

public Order() {
	
}

public Order(int order_id, Date order_date, int c_id) {
	super();
	this.order_id = order_id;
	this.order_date = order_date;
	this.c_id = c_id;
}

public int getOrder_id() {
	return order_id;
}

public void setOrder_id(int order_id) {
	this.order_id = order_id;
}

public Date getOrder_date() {
	return order_date;
}

public void setOrder_date(Date order_date) {
	this.order_date = order_date;
}

public int getC_id() {
	return c_id;
}

public void setC_id(int c_id) {
	this.c_id = c_id;
}

}
