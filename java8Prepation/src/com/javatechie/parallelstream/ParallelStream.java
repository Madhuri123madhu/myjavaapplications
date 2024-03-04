package com.javatechie.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

//this code is for stream/parallel stream

//here we just print the values from 1 to 10 or 1 to 100.
public class ParallelStream
{
	//stream: order of the execution  guarantee
	//parallelstream: order of the execution of not guarantee
	public static void main(String[] args)
	{
		
//		long start=0;
//		long end=0;
//		start=System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end=System.currentTimeMillis();
//		System.out.println("plain stream took time:"+(end-start));
//		
//		System.out.println("===========================================");
//		start=System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end=System.currentTimeMillis();
//		System.out.println("parallel stream took time:"+(end-start));
		
		
//		IntStream.range(1, 10).forEach(x->{
//			System.out.println("Thread:"+Thread.currentThread().getName()+":"+x);
//			
//		});//it will execute the threads sequentially.
		
//		IntStream.range(1, 10).parallel().forEach(x->{
//			System.out.println("Thread:"+Thread.currentThread().getName()+":"+x);
//		});	//it will execute threads parallel
//===========================================================================================================================		
		
//here i using one object class for best practice to understand stream v/s parallel stream.		
		
//by using this we can find out the actual difference between these  stream v/s parallel stream
		
		
		//here i caluculate avg salary bu using stream v/s parallel stream
		
		
		
     List<Employee> employees=EmployeeDatabase.getEmployees();
//by using stream:
     
     long start=0;
	long end=0;
	start=System.currentTimeMillis();
   double salaryWithStream=  employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
   end=System.currentTimeMillis();
   
   System.out.println("normal stream execution time is:"+(end-start)+"averagesalary:"+salaryWithStream);
   
   
  
	start=System.currentTimeMillis();
  double salaryWithparallelStream=  employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
  end=System.currentTimeMillis();
  
  System.out.println("parallel stream execution time is:"+(end-start)+"average salary is:"+salaryWithparallelStream);
	}

}
