package it.epicode.EserciziIniziali;
import java.util.Scanner;
public class Esercizi0104 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int n = console.nextInt();
		System.out.println("il fattoriale è: " + prodottoFattoriale(n));
		console.close();
//		int[] fibb = fibonacci
//		fibonacci(n);
//		stampaNumeri(n);
	}
	
	public static int prodottoFattoriale(int numInput) {
		int fattoriale = 1;
		for(int i = 1; i <= numInput; i++) {
			fattoriale = fattoriale * i;
		}
		return fattoriale;
	}
	
	public static int fibonacci(int numInput) {
		int[] arrayFibonacci = new int[numInput];
//		arrayFibonacci[2] = arrayFibonacci[1] + arrayFibonacci[0];
//		arrayFibonacci[3] = arrayFibonacci[2] + arrayFibonacci[1];
//		arrayFibonacci[4] = arrayFibonacci[3] + arrayFibonacci[2];
//		arrayFibonacci[5] = arrayFibonacci[4] + arrayFibonacci[3];
//		arrayFibonacci[6] = arrayFibonacci[5] + arrayFibonacci[4];
		arrayFibonacci[0] = 1;
		arrayFibonacci[1] = 1;
		int i = 2;
		while (i < numInput) {
			i++;
			arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];	
		}
		return arrayFibonacci[i];
	}
	
	public static void stampaNumeri(int numInput) {
		
		for(int i = 1; i <= numInput; i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("fizzbuzz");
			} else if(i%5 == 0) {
				System.out.println("buzz");
			} else if(i%3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(i);
			}
		}
	}
}
