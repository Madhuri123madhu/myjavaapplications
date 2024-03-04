package MapVSReduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product 
{
	private  String name;
	
	private  double price;

	public Product(String name, double price) 
	{
	
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
	public static void main(String[] args)
	{
	 List<Product> products = Arrays.asList(
             new Product("Laptop", 1200),
             new Product("Phone", 800),
             new Product("Tablet", 500),
             new Product("Smartwatch", 150),
             new Product("Headphones", 100)
     );
	 
	 List<Product> expensiveProducts = products.stream()
             .filter(product -> product.getPrice() > 100)
             .collect(Collectors.toList());
	 
	 System.out.println(expensiveProducts);
		
	}
	
	
	

}
