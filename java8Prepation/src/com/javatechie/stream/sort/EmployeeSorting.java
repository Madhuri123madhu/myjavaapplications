package com.javatechie.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// sorting for custom object based on specific field  for that i am using comparator
public class EmployeeSorting 
{
	public static void main(String[] args) 
	{
		 List<Employee> list1=new ArrayList<Employee>();
		 
		 list1.add(new Employee(1, "madhu", "developer", 65321));
		 
		 list1.add(new Employee(2, "chinnulu", "tester", 34214));
		 list1.add(new Employee(4, "sravs", "uidevops", 46213));
		 list1.add(new Employee(3, "chandhu", "bangaram", 89653));
		 
//		 1.it is a traditional approch by using MyComparator class and that class implements Comparator interface
// for custom object class
		// Collections.sort(list1, new MyComparator());
		 Collections.sort(list1,new MyComparator());
	//	 System.out.println(list1);
		 
		 
		 
		 //second way
//		Collections.sort(list1, (o1,o2)->o1.getSalary()-o2.getSalary());
//		System.out.println(list1);
		
		//by using lambda expression without using  Mycomparator class
		 
//		list1.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).forEach(k->System.out.println(k));
		 
		 
		 //by using method reference we can also sort
		 
		 list1.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(l->System.out.println(l));
		 
	}
	


}

class MyComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary()-o2.getSalary();//by default it will print assending order.
		
//		return o2.getSalary()-o1.getSalary(); it will prints desending order
	}
}