package areaValue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		sc.close();
	
	}

}
