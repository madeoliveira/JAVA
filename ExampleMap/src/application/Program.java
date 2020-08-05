package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		Map<Product, Double> stock = new HashMap<>();

		cookies.put("username", "Maria");
		cookies.put("email","maria@gmail.com");
		cookies.put("phone", "991425145");
		
		cookies.remove("email");
		cookies.put("phone", "2525252521");
		
		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Notebook", 12000.00);
		Product p3 = new Product("Tablet", 400.00);
		
		
		stock.put(p1,10000.0);
		stock.put(p2,20000.0);
		stock.put(p3,15000.0);
		
		Product ps = new Product("Tv", 900.00);
		System.out.println("Contains 'ps' Key "+stock.containsKey(ps));
		
		System.out.println("Contains 'phone': "+cookies.containsKey("phone"));
		System.out.println("Phone number: "+cookies.get("phone"));
		System.out.println("Size Map: "+cookies.size());
		System.out.println("Email: "+cookies.get("email"));
		
		System.out.println("All cookies");
		for(String key : cookies.keySet()) {
			System.out.println(key +": "+cookies.get(key));
		}
		
		
		
				
	}
}
