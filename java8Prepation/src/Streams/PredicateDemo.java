package Streams;

import java.util.function.Predicate;

//predicate is used to condition checking

//it is a traditional approch

public class PredicateDemo implements Predicate<Integer> 
{

	@Override
	public boolean test(Integer t)
	{
		if(t%2==0) 
		{
		
		return true;
		
	   }
		else 
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Predicate<Integer> predi=new PredicateDemo();
		System.out.println(predi.test(10));
		

    }
}
