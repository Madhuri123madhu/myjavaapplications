package Anonymous;

public class AnonymousFunction 
{
	
	void m1()
	{
		System.out.println("normal method calling");
	}//here it is showing error because we can write anonymous function in Lambda Expressions only.
	
	()
	{
		System.out.println("Anonymous method calling");
	}
	
	public static void main(String[] args) 
	{
		   new AnonymousFunction().m1();
		
	}

}
