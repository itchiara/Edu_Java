package esercizioCompiti20302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		List<Integer> lista = ordinaIntero(10);
		System.out.println(lista);
		// reverseOrdinaIntero(lista);
		// System.out.println(lista);
		pariDispari(lista, false);
	}

	public static List<Integer> ordinaIntero(int j) {
		List<Integer> numeri = new ArrayList<Integer>();
		for (int i = 0; i < j; i++) {
			double x = Math.ceil(Math.random() * 100);
			numeri.add((int) x);
		}
		Collections.sort(numeri);
		return numeri;
	}

	public static List<Integer> reverseOrdinaIntero(List<Integer> lista) {
		List<Integer> numeriReverse = new ArrayList<Integer>(lista);

		Collections.reverse(numeriReverse);
		lista.addAll(numeriReverse);
		return numeriReverse;

//		for (int i = 0; i < lista.size(); i++) {
//			lista.add(lista.get(i));
//		}
	}

	public static void pariDispari(List<Integer> lista, boolean pari) {
		List<Integer> numeriReverse = new ArrayList<Integer>(lista);
		if (pari) {
			for (int i = 0; i < numeriReverse.size(); i = i + 2) {
				System.out.println(lista.get(i));
			}
		} else {
			for (int i = 1; i < numeriReverse.size(); i = i + 2) {
				System.out.println(lista.get(i));
			}
		}
		
//		int start = 1;
//		if (pari) {
//			start = 0;
//		}
//		for (int i = start; i < numeriReverse.size(); i = i + 2) {
//			System.out.println(lista.get(i));
//		}
//		for (int i = pari?0:1; i < numeriReverse.size(); i += 2) {
//			System.out.println(lista.get(i));
//		}
	}

}
