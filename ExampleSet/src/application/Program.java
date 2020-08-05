package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		Set<String> set1 = new LinkedHashSet<>();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Smartphone");
		set.add("Smarttv");
		
		set.remove("Tv");
		
		set1.add("Mario");
		set1.add("Maria");
		set1.add("Pedro");
		set1.add("Jão ");
		set1.add("Ana");
		
		set1.removeIf(x -> x.charAt(0)=='P');
		
		
		
		
		
		System.out.println(set.contains("Notebook"));
		
		System.out.println("HashSet: ");
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println("\nLinkedHashSet:");
		for (String p : set1) {
			System.out.println(p);
		}
		
		System.out.println("union");
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		System.out.println("intersection");
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		System.out.println("difference");
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		}
	}
