package LambdaExpression;


//with out using java 8 normally we call like this only  i.e  by implementing one class to interface 
//and then we override that abstract method and then we write println styatements. by redusing this 
//code lambda expressions came in to picture. 
//continutionpart->CaluculatorImpl2
public class CaluculatorImpl1 implements MyFunctionalInterface {

	@Override
	public void m1() 
	{
		System.out.println( "this is abstract method calling");
		
	}

}
