package LambdaExpression;

@FunctionalInterface
public interface MyFunctionalInterface 
{

	void m1();
	
//	void m2(); it will  shows error beacuse functional interface having only one abstarct method. in the interface 
//by default the methods are abstarct methods whe  we vare don't mention anything before method like default or static.
	
	default void m2()
	{
		System.out.println("this is default method");
	}
	
	static void m3()
	{
		System.out.println("this is static method calling");
	}
	
	 
	
		
	}
	

