package com.javatechie.optional;

import java.util.Optional;

public class StaticMethods
{
	public static void main(String[] args) {
		
	
	
	Test test2= new  Test(4, "chandhu",null);
	
	//empty method:
	  
//     Optional<Object>  empt1 =Optional.empty();
//	  System.out.println(empt1); //it will give optional .empty
	
//	2.of method:
//	it is internally checks wheather the field is null or  not. so it is used you make sure that the field is 
//	confirmly not null.	
	
//	Optional<Object> empt2    = Optional.of(test2.getAddress());
//	System.out.println(empt2);
	
	
//	3.ofNull: it is used when you are doubtfull whether the field is not  null or not.
	
	//it is a combination of : empty+of
	
//     Optional<Object> empt3	=Optional.ofNullable(test2.getAddress());
//     System.out.println(empt3);//it wii gives  Optional.empty
     
// if the object is present it will give  the value otherwise it will give the optional.empty 
     
//	it won't give null pointerException if the filed is also null.
//	
//Instance Methods:
     
//     1.get method: we can't use get directly.we can use it in if case
     
     Optional<Object> empt4	=Optional.ofNullable(test2.getAddress());
     if(empt4.isPresent())
     {
    	 System.out.println(empt4.get());//it won't give give nothing because the field is null
    	 
    	 
     }
     
     
   //  2.orElse:
     
//     System.out.println(empt4.orElse("ongole"));//it gives ongole
     
  //  3. orElseGet: both orElse and orElseget  purpose is same but it will ask supplier as input but but o/p 
     //is same whatever we give in println statements it will give that one only.
     
//     System.out.println(empt4.map(String::toUpperCase).orElseGet(()->"default mail"));
  //4. orElseThrow: if the field is empty or if the field does not contain any value we can throw the exception explicitly.
     
     
     System.out.println(empt4.orElseThrow(()->new IllegalArgumentException("email not present")) );
//     if(empt4.isEmpty())
//     {
//    	 System.out.println(empt4.get());//here nosuchElement exception occured.
//     }
     
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
//	
	}
}
