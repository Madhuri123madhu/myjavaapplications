package MapVSReduce;

public class EmployeeMapReduce 
{
	
	public static void main(String[] args) 
	{
		
		
		//employee whose grade is A
//		
//	double avgsalary=	EmployeeDataBase.getEmployees().stream().
//		filter(empl->empl.getGrade().equalsIgnoreCase("A"))
//		.map(emp2->emp2.getSalary())
//		.mapToDouble(i->i)
//		.average().getAsDouble();
//		
//		System.out.println(avgsalary);
		
		double sumsalary=	EmployeeDataBase.getEmployees().stream().
				filter(empl->empl.getGrade().equalsIgnoreCase("A"))
				.map(emp2->emp2.getSalary())
				.mapToDouble(i->i)
				.sum();
				
				System.out.println(sumsalary);
		
		
		
	}

}
