package LambdaExpression;


// here there is no need of implementiong interface through class 
//.no need of override the abstract method

interface Caluculator
{
//	 void swicthOn();
	
//	void sum(int input);
	
	int substract(int i1,int i2);
}




public class CaluculatorImpl2 

//implements Caluculator 
{
 //this  is the first way before java 8 implement interface and override method
//	@Override
//	public void swicthOn() {
//		System.out.println("this is traditional Approch");
//		
//	}
	
	//in second way there is no need to to implement implement interface and override method also
	
	//the lambda expression syntax is :     ()->body

	public static void main(String[] args) 
	{
//	2.without having parameters:	
	//there is no need of {}  this.because it is having only one print  statement.it you want print so many lines of 
		//print statements we use {} this.
		//it is easy way  to call methods.
		
		
//	Caluculator caluculator=()->System.out.println("Anonymous method calling");
//	caluculator.swicthOn();
		
//		3.with one parameter:
		
//		Caluculator calucutor  =(input)-> System.out.println("sum is:"+input);
//		calucutor.sum(7);
		
		
//		4.with returntype and multiple arguements:
		
		
		
//		Caluculator caluculator=(i1,i2)->
//		{ 
//			return i2-i1;
//		};
//		System.out.println(caluculator.substract(7, 17));
		
		
		//here there is no need of return statement.because the body having only one print statement .so instead above we can write like this
	
//		Caluculator caluculator=(i1,i2)->i2-i1;
//				System.out.println(caluculator.substract(10,18));
		
		
//by using exception:		
		Caluculator caluculator=(i1,i2)->
		{
			if(i2<i1)
			{
				throw  new RuntimeException("Runtime exception happend");
			}
			else
			{
				return i2-i1;
			}
		};
		
		System.out.println(caluculator.substract(10,18));
		
	
		
	
	}

}
