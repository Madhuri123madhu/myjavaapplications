package mapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase 
{
	
    public static List<Customer> getAll()
    {
		return (List<Customer>) Stream.of(
				
				new Customer(7,"sravs", "sravs@gmail.com", Arrays.asList("56789867","456789")),
				
				new Customer(7,"madhu", "madhu@gmail.com", Arrays.asList("789867","486235")),
				
				new Customer(7,"chandhu", "chandhu@gmail.com", Arrays.asList("6789867","56789")),
				
				new Customer(7,"abhi", "abhi@gmail.com", Arrays.asList("908765","235418"))
				).collect(Collectors.toList());
				
    }
    	
		
    }

