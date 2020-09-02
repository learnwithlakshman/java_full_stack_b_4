package com.careerit.cj.day16;

public class Runner {

	public static void main(String[] args) {
		
		Product product_1 = new Product(1002, "Dell XPS", 55000);
		Product product_2 = new Product(1001, "Lenovo Thinkpad", 45000);
		Product product_3 = new Product(1003, "Mac AirBook", 75000);
		Product product_4 = new Product(1004, "Vivo Notebook", 65000);
		Product product_5 = new Product(1005, "Dell Studio", 65000);

		Product[] products = new Product[] { product_1, product_2, product_3, product_4, product_5 };

		// Before discount, what is total amount?
		double b_sum = 0;
		for(Product product:products)
		{
				b_sum += product.getPrice();
			
		}
		System.out.println("Before discount :"+b_sum);
		
		for (Product product : products) {
			    double price = product.getPrice();
				if(price >= 60000) {
					double discount = price * 0.1;
					product.setPrice(price-discount);
				}
		}
		
		for(Product p:products) {
			System.out.println(p);
		}
		// After discount, what is total amount?
		double a_sum = 0;
		for(Product product:products)
		{
				a_sum += product.getPrice();
			
		}
		System.out.println("After discount :"+a_sum);
		
		
		// Get all the product after discount above 55000
		for(Product product:products)
		{
			if(product.getPrice() > 55000) {
				System.out.println(product);
		}
		}
		
		
	}
}
