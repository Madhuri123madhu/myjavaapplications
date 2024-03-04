package MapVSReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataBase 
{
	
		
	
	public static List<Employee1> getEmployees()
	{
		return Stream.of(new Employee1(101, "john", "A", 785643),
				
				new Employee1(102, "jhanu", "B", 78564),
				new Employee1(103, "lasya", "A", 75643),
				new Employee1(107, "pooju", "B", 75643),
				new Employee1(105, "krithi", "C", 59643)).
				collect(Collectors.toList());
				
				
				
				
				
		
	}

}

