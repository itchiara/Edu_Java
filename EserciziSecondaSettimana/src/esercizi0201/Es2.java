package esercizi0201;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci un numero seguito dal tasto invio");
		int numero = console.nextInt();
		intero(numero);
		console.close();

	}
	
	public static void intero(int numero) {
		switch(numero) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("due");
				break;
			case 3:
				System.out.println("tre");
				break;
			default:
				System.out.println("Numero non riconosciuto");
				
		}
	}

}
