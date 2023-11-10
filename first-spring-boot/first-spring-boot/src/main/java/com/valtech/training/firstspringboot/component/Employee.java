package com.valtech.training.firstspringboot.component;

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Employee implements Comparable <Employee>{
//	 int seniority;
//	int experience;
//	 String name;
//	int age;
//	double salary;
//	
//public Employee(int seniority,int experince, String name, int age, double salary) {
//	this.seniority= seniority;
//	this.experience = experience;
//	this.name = name;
//	this.age = age;
//	this.salary = salary;
//	
//}
//public int compareTo(Employee e)
//{
//	return this.name.compareTo(e.name);
//	
//	
//	
//}
//
//
//}
//class xyz{
//	public static void main(String[] args) {
//		ArrayList<Employee>list= new ArrayList<Employee>();
//		list.add(new Employee(5,22,"manjushree",3,1000000));
//		list.add(new Employee(1,23,"xyz",4,20000));
//		Collections.sort(list);
//		
//		for(Employee e : list)
//			System.out.println(e.seniority + " "+ e.experience + " " + e.name +" "+e.age+"" +e.salary);
//		
//		
//	}
//}


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
// 
//
// 
//
//public class Employee {
//
// 
//
//	String name;
//	int age, experience, seniority;
//	double salary;
//
//	public Employee(String name, int age, double salary, int experience, int seniority) {
////		super();
//		this.name = name;
//		this.seniority = seniority;
//		this.age = age;
//		this.experience = experience;
//		this.salary = salary;
//	}
//
//	public void setExperience(int experience) {
//		this.experience = experience;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setSeniority(int seniority) {
//		this.seniority = seniority;
//	}
//
//	public int getExperience() {
//		return experience;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getSeniority() {
//		return seniority;
//	}
//
//	public String toString() {
//		return "\nName = "+name+" Age = "+age+" Salary = "+salary+" Experience = "+experience+" Seniority = "+seniority;
//	}
//
//
//
//	public static void main(String[] args) {
//		ArrayList<Employee> e = new ArrayList<Employee>();
//		e.add(new Employee("Manjushree", 22, 30000, 2, 3));
//		e.add(new Employee("Pooja", 22, 150000, 5, 5));
//		e.add(new Employee("Gagana", 22, 20000, 1, 2));
//
//		System.out.println("Sort Employee list by Experience");
//		Comparator<Employee> ex = Comparator.comparing(Employee::getExperience);
//		Collections.sort(e,ex);
//		for(Employee emp: e) {
//			System.out.println(emp.experience+" "+emp.name+" "+emp.age+" "+emp.salary+" "+emp.seniority);
//		}
//
//		System.out.println("\nSort Employee list by Name");
//		Comparator<Employee> n = Comparator.comparing(Employee :: getName);
//		Collections.sort(e, n);
//		for(Employee emp:e) {
//			System.out.println(emp.name+" "+emp.experience+" "+emp.age+" "+emp.salary+" "+emp.seniority);
//		}
//
//		System.out.println("\nSort Employee list by Seniority");
//		Comparator<Employee> s = Comparator.comparing(Employee:: getSeniority);
//		for(Employee emp:e) {
//			System.out.println(emp.seniority+" "+emp.name+" "+emp.age+" "+emp.salary+" "+emp.experience);
//		}
//	}
//}




public class Employee{
	public Employee(int id, String name, int age, int experience, int seniority, int salary) {
		super();//call
		this.id = id;
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
	}
	//
	private int id;
	private String name;
	private int age;
	private int experience;
	private int seniority;
	private int salary;
	
	
	public Employee() {}
	//with field /argument
	public Employee(String name, int age, int experience, int seniority, int salary) {
		
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
		
	}
	
	
//	public void Department() {
//		
//	}
//	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", seniority="
				+ seniority + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
