package mapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap 
{
	
	public static void main(String[] args)
	{
		
	List<Customer> customers=EkartDatabase.getAll();
		
	//from these customers  i just want to get list of string which is nothing but email
	
	//List<Customer> convert List<string>-->Data Transformation
	//so here we can use Map Method
	
	//here one customer having only one email id so it is called one to one mapping .
	
//	  List<String> supply=customers.stream().map(Customer->Customer.getMail()).collect(Collectors.toList());
//	  System.out.println(supply);
	  
	  
	//similarly i need to fetch all the phone numbers  by using Map 
	
	
//	 List<List<String>> phoneNo=customers.stream().map(Customer->Customer.getPhoneNo()).collect(Collectors.toList());
//	  System.out.println(phoneNo);
	  
	  //it will gives ListofList data  like this that means stream of stream data : i.e   [[56789867, 456789], [789867, 486235], [6789867, 56789], [908765, 235418]]
	  
	  //but i want one stream  that means  ListofData  so that's why  now i am using flatMap
	  
	 // here i am using Flat map
	  
	  
List<String>  phones=customers.stream().flatMap(Customer->Customer.getPhoneNo().stream()).collect(Collectors.toList());

System.out.println(phones);

//by using flatMap we can get stream of data.like this:[56789867, 456789, 789867, 486235, 6789867, 56789, 908765, 235418]n
	  
	  
	  
	}

}
