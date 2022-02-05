package it.epicode.be.capitolo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		//esercizio1
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Vuoi continuare?");
//		String risposta = scanner.nextLine();
//		if(risposta.equalsIgnoreCase("Sì")||risposta.equalsIgnoreCase("S")||risposta.equalsIgnoreCase("Ok")|| risposta.equalsIgnoreCase("Certo")||risposta.equalsIgnoreCase("Perchè no?")) {
//			System.out.println("Ok");
//		} else if(risposta.equalsIgnoreCase("N")||risposta.equalsIgnoreCase("No")) {
//			System.out.println("Fine");
//		} else {
//			System.out.println("Dato non corretto");
//		}
		
		//esercizio2
//		System.out.println("Inserisci il primo numero");
//		double n1 = scanner.nextDouble();
//		System.out.println("Inserisci il secondo numero");
//		double n2 = scanner.nextDouble();
//		System.out.println("Inserisci il terzo numero");
//		double n3 = scanner.nextDouble();
//		List<Double> lista = new ArrayList<>();
//		lista.add(n1);
//		lista.add(n2);
//		lista.add(n3);
//		Collections.sort(lista);
//		System.out.println(lista);
		
		//esercizio3
		System.out.println("Inserisci un numero da 1 a 999.999");
		Integer n = scanner.nextInt();
		NumberConverter converter = new NumberConverter(n);
		
	}

}
