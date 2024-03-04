package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> 
{

	@Override
	public void accept(Integer t)
	{
		System.out.println("printing:"+t);
		
	}
	public static void main(String[] args)
	{
		
//		it is one way  by using streams
		 Consumer consumer=(t)->System.out.println("printing:"+t);
		 consumer.accept(7);
		 
		 
		 //this is another way.List of the elements is below.it is used to print the 
		 //list of the elements by using forEach
//		  
		 List<Integer> list1=Arrays.asList(1,2,3,4,5);
//		 
//		 list1.stream().forEach(consumer);
		 
		 //another way is:
		 
		 list1.stream().forEach(t->System.out.println("print:"+t));
		 
		 
	}
	
	

}
