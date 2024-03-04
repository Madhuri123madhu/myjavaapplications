package MapVSReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//this code is from java techie:
public class MapReduceExample
{
	public static void main(String[] args)
	{
		
		
		List<Integer> numbers=Arrays.asList(3,4,5,6,7,8,9);
		
		List<String> words=Arrays.asList("corejava","spring","hibernate");
	
    //map:
//		int sum1     =numbers.stream().mapToInt(i->i).sum();
//		System.out.println(sum1);
		
	//reduce method:
//		 int sum2=numbers.stream().reduce(0,(a,b)->a+b);
//		 System.out.println(sum2);
		 
//	Optional<Integer> reduceSumwithMathodReference	= numbers.stream().reduce(Integer::sum);
//	System.out.println(reduceSumwithMathodReference.get());
		
		
//    int mul= numbers.stream().reduce(1,(a,b)->a*b);
//    System.out.println(mul);
    
 
		
	//maxvalue:
//	 int max=	numbers.stream().reduce(0,(a,b)->a>b?a:b);
//	 System.out.println(max);
	 
//	 with methodRefence:
	 
//	 int max1=	numbers.stream().reduce(Integer::max).get();
//	 System.out.println(max1);
	 
	 //max length string
//	String longestString= words.stream().reduce((word1,word2)->word1.length()>word2.length()? word1:word2).get();
//	System.out.println(longestString);
	
	 
	 
	}

}
