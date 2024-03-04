package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

//by using Lambda expressions the above scenario

//no need of writting method.
//no need of implementing functional interface
public class PredicateDemo2 
{
	public static void main(String[] args)
	{
		
//	Predicate<Integer> predicate=t->t%2==0;
//	System.out.println(predicate.test(56));
	
	
	//it prints only  even numbers
	List<Integer> list1=Arrays.asList(12,13,14,15,16);
	
//	by using predicate reference  by using above scenario
   //	list1.stream().filter(predicate).forEach(t->System.out.println(t+"is a even number"));
	
	//without using reference we can write condition like this
	
//	list1.stream().filter(t->t%2==0).forEach(t->System.out.println(t+"is a even number"));
//	

	// predicate  by using filter method  by using Strings
	
//	List<String>  filt=Arrays.asList("chinnu","madhu","sravs");
//	filt.stream().filter(t->t.startsWith("m")).forEach(t->System.out.println(t));
//	
	//predicate by using  filter methods by using  maps
	
//	here i want to print the  key value which is divided by 2 only
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "java");
	map.put(2, "pyton");
	map.put(3, "sql");
	map.put(4, "service");
	
	map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
		
	}
	

}
