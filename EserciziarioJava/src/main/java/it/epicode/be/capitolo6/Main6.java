package it.epicode.be.capitolo6;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//esercizio1
//		System.out.println("Inserire un numero");
//		int n = scanner.nextInt();
//		int totale = 1;
//		for (int i = 1; i <= n; i++) {
//			totale *= i;
//		} 
//		System.out.println("totale fattoriale: " + totale);
		
		//esercizio2
		System.out.println("Inserire un numero");
		int x = scanner.nextInt();
		PrimeGenerator gen = new PrimeGenerator(x);
		gen.nextPrime();
	}

}
