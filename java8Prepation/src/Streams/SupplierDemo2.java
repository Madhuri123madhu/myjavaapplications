package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo2 
{
	
	public static void main(String[] args) 
	{
		
		
		//is is one way
		Supplier<String> suppl=()->"hii madhu";
//		System.out.println(suppl.get());
		
		//it is another way for list of the elements
		
		List<String> list1=Arrays.asList("madhu","chinnu","sravani");
		
		List<String> list2=Arrays.asList();
		
		
		//here the if the list contains elements it will prints the elements otherwise
		//  it will prints the suppl
		
		//by using reference
//		System.out.println(list1.stream().findAny().orElseGet(suppl));
//		System.out.println(list2.stream().findAny().orElseGet(suppl));
		
		//without using references:
		
		System.out.println(list1.stream().findAny().orElseGet(()->"hii frnds"));
		
		
	    
		
	}

}
