package com.javatechie.optional;

public class Test 
{
	
	private int  id;
	private String name;
	private String address;
	
	public Test(int id, String name, String address)
	{
		
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	

	
	public static void main(String[] args)
	{
		
		
		Test customer1=new Test(101, "madhu", "ongole");
		
		Test customer2=new Test(3, "chandhu",null);
		
//		    System.out.println(customer1.getAddress());
		    
//		    System.out.println(customer2.getAddress());     it will give null
		    
		//with null reference  if we do any operation like touppercase or tolowercase it will give null pointer exception.
		    System.out.println(customer2.getAddress().toUpperCase());    //it will give null pointer exception.
		    
		    
//	 
//steps for avoid null pointer exception:
// .we can do a null  check before accessing any object    
//		    
  //in this class  only  three fields  are there  so we can easily identify address having null  
  //instead if the class contains 100 fields it is not possible to check each and every field whether it is  null or not

	//	.to avoid  this type unpredictable null pointer  exception  java8  introduced java8.   
		    
//
//		    
//		    
//		    	
//		    
//		
	}

}
