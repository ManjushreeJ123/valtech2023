package com.valtech.training.hibernateAssignment.client;


import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.valtech.training.hibernateAssignment.CompositeKey;
import com.valtech.training.hibernateAssignment.CustAddress;
import com.valtech.training.hibernateAssignment.Customers;
import com.valtech.training.hibernateAssignment.Items;
import com.valtech.training.hibernateAssignment.OrdersDescription;
import com.valtech.training.hibernateAssignment.Orders;
import com.valtech.training.hibernateAssignment.VendorAddress;
import com.valtech.training.hibernateAssignment.Vendors;

public class OrdersInvoiceClient{
	
	public static void main(String[] args) throws Exception {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		
		SessionFactory sesFac = cfg.buildSessionFactory();
		Session ses = sesFac.openSession();
		//Transaction tx = (Transaction) ses.beginTransaction();
		org.hibernate.Transaction tx = ses.beginTransaction();
		
		cfg.addAnnotatedClass(Customers.class).addAnnotatedClass(CustAddress.class);
		cfg.addAnnotatedClass(Vendors.class).addAnnotatedClass(VendorAddress.class);
		cfg.addAnnotatedClass(Orders.class).addAnnotatedClass(OrdersDescription.class).addAnnotatedClass(Items.class);
		cfg.addAnnotatedClass(CompositeKey.class);
		
		Customers cus1 = new Customers("Manjushree","7259778354","manjuj@gmail.com");
		ses.save(cus1);
		
		tx.commit();
		ses.close();
		sesFac.close();
		
	}

}