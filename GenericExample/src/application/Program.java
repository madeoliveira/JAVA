package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		PrintService<String> pss = new PrintService<>();
		
		System.out.print("How many value Integer?");
		int n = sc.nextInt();
		
		
		for(int i =0; i<n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		System.out.print("How many value String?");
		int s = sc.nextInt();
		for(int i =0; i<s; i++) {
			String value = sc.next();
			pss.addValue(value);
		}
		
		ps.print();
		Integer x=ps.first();
		System.out.println("First: "+ ps.first());
		
		pss.print();
		String xs=pss.first();
		System.out.println("First: "+ pss.first());
		
		sc.close();
	}

}
