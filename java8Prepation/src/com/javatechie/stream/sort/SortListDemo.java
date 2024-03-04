package com.javatechie.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//  sorting for primitive data type  using traditional approch and stream api
public class SortListDemo
{
	
	public static void main(String[] args)
	{
//		this is the primitive sorting i.e same class data and  not a object class
		
		List<Integer> list=new ArrayList();
		
		list.add(12);
		list.add(67);
		list.add(6);
		list.add(2);
		
//		Collections.sort(list);//by default it gives assending order
//		System.out.println("the assending order of elements are:"+list);
//		
//		Collections.reverse(list);//it gives desending order.
//		System.out.println("the desending order of elements are:"+list);
		
		//by using stream api by default it  gives assending order
//		list.stream().sorted().forEach(k->System.out.println(" the assending oredr of elements are:"+k));
		
		//for desending order here we are using comparator
		list.stream().sorted(Comparator.reverseOrder()).forEach(k->System.out.println("the desending order of elements:"+k));
	}

}
