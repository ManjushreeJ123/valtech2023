package com.valtech.training.day3;
import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;

 

public class Employeee implements Comparable<Employee>{

	private int seniority;

	private int experience;

	private String name;

	private int age;

	private int salary;

	

 

		

	public Employeee(int seniority,int experience,String name,int age,int salary)	{

			

		this.seniority =seniority;

		this.experience=experience;

		this.name=name;

		this.age=age;

		this.salary=salary;

	}

	
public int getSeniority() {

		return seniority;

	}

 
public int getExperience() {

		return experience;

	}

 

public String getName() {

		return name;

	}

 

 public int getAge() {

		return age;

	}

 

public int getSalary() {

		return salary;

		

	}
@Override

	public int compareTo(Employee o) {

		return this.name.compareTo(o.name);

	}

	@Override

	public String toString() {

		return "Employee [seniority=" + seniority + " , experience=" + experience + " , name=" + name + " , age=" + age + " , salary=" + salary + "]";

	}

	

	public static void main(String[] args) {

		List<Employee> employees =new  ArrayList<>();

		employees.add(new Employee(5,10,"Arun",24,150000));

		employees.add(new Employee(8,12,"Ram",24,80000));

	    employees.add(new Employee(4,8,"pranav",24,60000));

	    employees.add(new Employee(2,5,"Gagana",24,50000));

	    

	    System.out.println("Employee before sorting:");

	    for(Employee emp : employees)

	    {

	    	System.out.println(emp);

	    }

	    

	    Collections.sort(employees);

	    

	    System.out.println("\n Employees after sorting by name:");

	    

	    for(Employee emp : employees)

	    {

	    	System.out.println(emp);

	    }

	    

	    

	}

}
