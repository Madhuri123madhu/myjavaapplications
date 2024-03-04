package com.javatechie.stream.example;

import java.util.ArrayList;
import java.util.List;

//Daolayer class
public class Database
{
	
	 public static List<Employee> getEmployees()
	 {
		 List<Employee> list1=new ArrayList<>();
		 
		 list1.add(new Employee(1, "madhu", "hyderabad", 897655));
		 list1.add(new Employee(2, "sravs", "hyd", 98732));
		 list1.add(new Employee(3, "chandhu","ongole", 67543));
		 list1.add(new Employee(5, "abhi", "bgnlr", 672132));
		 list1.add(new Employee(8, "mansi", "agraharam", 53645));
		return list1;
	 }
	 
	 public static void main(String[] args) 
	 {
		 
		getEmployees().stream().filter(t->t.getSalary()<60000).forEach(k->System.out.println(k));
		
	}

}
