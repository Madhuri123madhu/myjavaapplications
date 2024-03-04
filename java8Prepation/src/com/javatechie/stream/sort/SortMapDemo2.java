package com.javatechie.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//if the key is custom object sorting technique  is below  and it is traditional approch
public class SortMapDemo2
{

	public static void main(String[] args)
	{
		
		//here we are passing Employee as a key and also i am using tree map it is optional whatever we taken. 
		Map<Employee,Integer> employeeMap=new TreeMap<>(new Comparator<Employee>() {//in the brackets we pass comparator for sorting purpose 
			//and then whenever we use comparator we need to override compare method

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getSalary()-o2.getSalary();//here i want to sort to key in that key i want to sort based on salary by default it prints assendin
			
//				return o2.getSalary()-o1.getSalary(); it is for desending.
				

			}
		});
		employeeMap.put(new Employee(1, "kdkr", "java", 65321), 76);
		employeeMap.put(new Employee(3, "ongole", "python", 59086), 89);
		employeeMap.put(new Employee(2, "hyd", "sql", 57986), 65);
		employeeMap.put(new Employee(5, "vizag", "R&D", 46765), 92);
		
	
		//by using traditional approch
//		System.out.println(employeeMap);
	
		
//		by using streams:
//		  List<Entry<Employee, Integer>> employeeArray=new ArrayList<>(employeeMap.entrySet());
		  employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		  
		  //here we are using comparator.comparing(Employee::getSalasy because  in is object otherwise we can write in single line like above programs
		  
		
	}
	
	
}
