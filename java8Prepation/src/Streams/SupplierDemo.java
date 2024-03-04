package Streams;

import java.util.function.Supplier;

//supplier method don't have any arguements but it is always expects one return type.


//it is traditional approch  by suing supplier
public class SupplierDemo implements Supplier<String>
{

	@Override
	public String get() {
		
		return "hii madhu";
	}
	
	public static void main(String[] args)
	{
		 Supplier<String> supplier=new SupplierDemo();
		 
		 System.out.println(supplier.get());
		
		
	}

}
