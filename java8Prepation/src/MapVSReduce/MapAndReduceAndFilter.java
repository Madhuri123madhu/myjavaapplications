package MapVSReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//this is for understanding purpose.this code is from chatgpt
public class MapAndReduceAndFilter
{
	public static void main(String[] args)
	{
		
//		1.Map:
//		The map operation transforms each element of a stream into another object using a provided function.
//		It returns a new stream containing the transformed elements.
//		Useful when you need to transform each element of a collection into another form.
//		
// usecase:
//	. In this example, the map function is used to square each element of the numbers list, resulting in 
////	   a new list squaredNumbers containing the squared values.
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> squaredNumbers = numbers.stream()
//		                                     .map(n -> n * n)
//		                                     .collect(Collectors.toList());
//		
//		System.out.println(squaredNumbers);
		
		
//		2.reduce:
		
//		The reduce operation combines all elements of a stream into a single result using a binary operation.
//		It can perform tasks like summing all elements, finding the maximum or minimum, concatenating strings, etc.
//		Useful when you need to aggregate elements of a collection into a single result.
		
		
//		In this example, the reduce function is used to calculate the sum of all elements in the numbers
//		list. The initial value of the accumulator is 0, and 
//		the binary operation (acc, num) -> acc + num adds each number to the accumulator.
		
//		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
//		int sum = numbers1.stream()
//				.reduce(0, (acc, num) -> acc + num);
//		System.out.println(sum);
//		
		
//Data Transformation: 
//			Use map when you need to transform elements of a collection into another form, such as
//			applying mathematical operations, converting types, etc.
//Aggregation:
//			Use reduce when you need to combine elements of a collection into a single result, 
//			such as calculating sums, finding maximum or minimum values, concatenating strings, etc.
		
//Parallel Processing:
//			Both map and reduce operations can be efficiently parallelized, making them suitable for
//	scenarios where you need to process large collections of data concurrently.
//		
//  .Overall, map and reduce are powerful operations that enable concise and expressive data processing
//		pipelines in Java, especially when working with streams of data.
//		
		
		
//    3.Filter:
//		It is used to select elements from a stream based on a specified condition, allowing you to create
//		a new stream that contains only those elements that satisfy the given predicate.
//		
//		1.Data Filtering:
//			.filter is commonly used when you need to filter elements from a collection based on certain
//			criteria.
//			.For example, you might want to select only the even numbers from a list, or filter out 
//			strings that start with a specific prefix.
		
//		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<Integer> evenNumbers = numbers4.stream()
//		                                   .filter(n -> n % 2 == 0)
//		                                   .collect(Collectors.toList());
//		System.out.println(evenNumbers);//In this example, the filter method is used to select only the even numbers from the numbers list.
		
//		
//		2.Data Validation:
//			
//		.filter can be used for data validation purposes, where you want to remove invalid or
//		  unwanted elements from a collection.
//		.For instance, you might filter out null values or objects that don't meet certain criteria
		
//		List<String> names = Arrays.asList("Alice", null, "Bob", "Charlie", null, "David");
//		List<String> validNames = names.stream()
//		                              .filter(Objects::nonNull)
//		                              .filter(name -> name.length() <= 5)
//		                              .collect(Collectors.toList());
//		
//		System.out.println(validNames);in this example, the filter method is used to select only the products with a price greater than 100.
		
//		3.Data Extraction:
//			filter can also be used to extract elements from a collection that match certain conditions.
//			For instance, you might filter a list of objects to find those that meet specific criteria,
//			such as products with a certain price range or customers from a particular location.
		
		
//		For more infomation see: see the product class code
//		In this example, the filter method is used to select only the products with a price greater 
//		than 100.
//
//		Overall, the filter method is essential for selectively processing elements in a stream based 
//		on specified conditions, enabling you to perform various data manipulation and filtering 
//		operations in a concise and expressive manner.
		
//		
		
		
		
	}

}
