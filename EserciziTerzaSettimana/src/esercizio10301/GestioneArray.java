package esercizio10301;

import java.util.*;

public class GestioneArray {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// f2();
		// f1();
		f3();
	}

	public static void f3() {
		Scanner console = new Scanner(System.in);
		int[] lista = new int[5];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 10);
		}
		stampaStato(lista);

		int a = 1;
		do {

			try {
				a = inserisciELemento(lista);
				stampaStato(lista);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Tentativi esauriti, programma terminato. Arriverderci!");
				return;
			}

		} while (a != 0);
	}

	public static void f1() {
		int[] list = new int[5];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 10);
		}
		stampaStato(list);
		int x = 1;
		do {
			System.out.println("Inserisci un numero");
			// Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();
			if (x != 0) {
				try {

					System.out.println("In che posizione vuoi inserire il numero?");
					int y = scanner.nextInt();
					list[y] = x;

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Posizione non consentita. Inserisci un numero tra 0 e 4");
					stampaStato(list);
				}

			}
		} while (x != 0);

	}

	public static int inserisciELemento(int[] list) throws ArrayIndexOutOfBoundsException {
		System.out.println("Dammi un nuovo valore");
		int val = scanner.nextInt();
		int contatore = 0;
		boolean valid = false;
		int pos = -1;
		do {
			contatore++;
			System.out.println("dammi la posizione");
			pos = scanner.nextInt();

			valid = pos >= 0 && pos < 5;
			if (!valid) {
				System.out.println("Posizione non consentita. Inserisci un numero tra 0 e 4");
			}
		} while (contatore < 4 && !valid);
		list[pos] = val;
		return val;
	}

	public static void stampaStato(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void f2() {
		int[] list = new int[5];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 10);
		}
		stampaStato(list);
		int x = 1;
		do {
			System.out.println("Inserisci un numero");
			// Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();

			if (x != 0) {
				System.out.println("In che posizione vuoi inserire il numero?");
				int y = scanner.nextInt();
				if (y < 5 && y >= 0) {
					list[y] = x;
				} else {
					System.out.println("Posizione non consentita. Inserisci un numero tra 0 e 4");
				}

				stampaStato(list);

			}
		} while (x != 0);

	}

}
