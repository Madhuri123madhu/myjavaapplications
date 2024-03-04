package com.javatechie.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
//it is a traditional approch  sorting with maps
public class SortMapDemo
{
	public static void main(String[] args)
	{
		
		
		Map<String, Integer> map=new HashMap<>();
		map.put("madhu", 1);
		map.put("chinnu", 8);
		map.put("sravs", 2);
		map.put("chandhu", 5);
		
		
		//for sorting  using lists.here collections.sort asks list so we need to convert map to list
		
		
		List<Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
//		
////		here we directly pass the entries because it is in the list format now.
//		Collections.sort(entries,new Comparator<Entry<String, Integer>>() 
//		{
//			//whenever comparator used we can override the compare method
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				
//				return o1.getKey().compareTo(o2.getKey());
//				
//				//based on value also we can sort
//			}
//		});
		
		//for iteration purpose we use  forEach
//		
//		for(Entry<String, Integer> ent:entries)
//		{
//			System.out.println(ent.getKey()+" "+ent.getValue());
//		}
		
		//by using streams
		
		
//		firstway: by using predefined methods
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//comparing by value
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//if you want to reverse it
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).forEach(System.out::println);
//		

		
//		by using lambda
//		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
//		for (Entry<String, Integer> ent1: entries) 
//		{
//			System.out.println(ent1);
//		}
		
			
	
		
		
		//* if map contains primitive based on key  or based on value we can sort otherwise  for example if my map key
		//contains user object or employee object we can't direct  use these methods like  based on key or based on value
		
	}

}
