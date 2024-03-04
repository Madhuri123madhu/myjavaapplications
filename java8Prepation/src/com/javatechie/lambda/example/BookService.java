package com.javatechie.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService 
{
	public List<Book> getBooksinSort() {
		List<Book> books = new BookDao().getBooks();
	//	this is the normal approch compare the objects by using name by using comparator
	//	1.Collections.sort(books, new MyComparator());
		
		
		//2.by using lambda expressions i.e  without using MyComparator Class
//		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName())); for Accending oreder
		Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));//for desending order
		
		
		return books;
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(new BookService().getBooksinSort());
	}

}

//class MyComparator implements Comparator<Book> 
//{
//
//	@Override
//	public int compare(Book o1, Book o2) 
//	{
		
//		return o1.getName().compareTo(o2.getName());//this is for accending order by usig name
//		return o2.getName().compareTo(o1.getName());//this is for decending order by using name
//	}
	
	  
	  
//} 
