package com.javatechie.stream.sort;

public class Employee
{

	
	
	private int id;
	private String address;
	private String role;
	private int salary;
	public Employee(int id, String address, String role, int salary) {
		
		this.id = id;
		this.address = address;
		this.role = role;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", address=" + address + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
	
	
}
