package esercizi0201;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci un numero intero");
		int n = console.nextInt();
		stampaElenco(n);
		console.close();
	}
	
	public static void stampaElenco(int numero) {
		for (int i = numero; i >=0; i--) {
			System.out.println(i);
		} 
	}

}
