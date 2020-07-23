package application;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int menor = min(a,b,c);
		int maior = max(a,b,c);
		mostrarResultado(maior,menor);
		
		sc.close();
	}
	public static int min(int x, int y, int z) {
		int aux;
		
		if(x<y && x<z) {
			aux =x;
		}else if(y<z) {
			aux =y;		
		}else {
			aux =z;
		}
		return aux;
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x>y && x>z) {
			aux =x;
		}else if(y>z) {
			aux =y;		
		}else {
			aux =z;
		}
		return aux;
	}
	public static void mostrarResultado(int valorMa, int valorMe) {
		System.out.println("Maior = "+ valorMa+" Menor + "+valorMe);
	}

}
