package esercizi0201;

public class Es5 {

	public static void main(String[] args) {
//		int[] myArray = { 24, 17, 8, 90, 5, 71 };
//		int ripetizioniMax = 0;
//		int numRipet = 0;
//
//		for (int i = 0; i < myArray.length; i++) {
//			 int volte = 0;
//			 for(int j = 0; j < myArray.length; j++) {
//				 if(myArray[j] == myArray[i]) {
//					 volte = volte + 1;
//				 } if (volte > ripetizioniMax) {
//					 ripetizioniMax = volte;
//					 numRipet = myArray[i];
//				 }
//			 }
//		} 
//		System.out.println("numero ripetuto: " + numRipet + "numero volte di ripetizioni: " + ripetizioniMax);

		int[] values = { 1, 5, 5, 6, 7, 9, 1, 4, 5, 8 };
		System.out.println(simpleFindMode(values));
		System.out.println(findMode(values));
	}

	public static int findMode(int input[]) {
		ValueCounter[] vc = new ValueCounter[input.length];
		int distinct = 0; // prima posizione disponibile
		// se trovo il numero, lo inserisco in valueCounter con counter 1 in vc,
		// altrimenti rintraccio il valueCounter con quel valore e incremento il suo
		// valore
		// questa cosa è dispendiosa perchè se ho 1milione di numeri, per capire se ho
		// già visto il numero devo fare 1milione di operazioni
		// se il primo numero è 24, il valueCounter con valore 24 non lo metto in prima
		// posizione libera ma in posizione 24, ma l'array rischia di diventare enorme
		// noi sappiamo qualcosa sulla distribuzione dei valori? se sì creerei un array
		// con tot posizioni, se no
		for (int i = 0; i < input.length; i++) {
			int pos = (contains(vc, input[i]));
			if (pos == -1) {
				ValueCounter newElement = new ValueCounter(input[i], 1);
				vc[distinct] = newElement;
				distinct++;
			} else {
				vc[pos].counter++;
			}
		}
		int posMax = 0;
		int countMax = vc[0].counter;
		for (int i = 1; i < distinct; i++) {
			if (vc[i].counter > countMax) {
				posMax = i;
				countMax = vc[i].counter;
			}
		}
		return vc[posMax].value;
	}

	public static int contains(ValueCounter vc[], int x) {
		for (int i = 0; i < vc.length; i++) {
			if (vc[i] == null) {
				return -1;
			}
			if (vc[i].value == x) {
				return i;
			}
		}
		return -1;
	}

	public static int simpleFindMode(int input[]) {
		// scorro array, leggo input, leggo tutti gli elementi dopo quello e quando ne
		// incontriamo uno uguale lo rimuoviamo dall'array mettendo un valore sentinella
		// e incrementiamo il contatore che dica quante volte ho fatto questo
		// si sposta al prossimo elemento valido e fa lo stesso gioco
		int countMax = 0; 												// numero massimo di volte che ho visto quel carattere
		int posMax = 0;  												//posizione della moda
		int modeValue = input[0]; 										//valore della moda
		for (int i = 0; i < input.length - 1; i++) {					 //ciclo su tutti gli elementi validi dell'array
			if(input[i] == Integer.MIN_VALUE) {
				continue;												//con continue passo al prossimo valore con i
			}
			int count = 1;												//inizializzo il contatore per il valore in posizione i
			for (int j = i + 1; j < input.length; j++) { 				//ciclo per tutti i valori a destra di i validi
				if (input[j] == Integer.MIN_VALUE) {
					continue;											//se il valore è integer passo al prossimo
				}
				if (input[i] == input[j]) {								//confronto il valore in posizione i con quello in j
					input[j] = Integer.MIN_VALUE;						//se sono uguali assegno ad input[j] il valore invalido
					count++; 											//incremento il contatore che mi dice quante ho volte ho visto l'intero: ho visto il valore un'altra volta
				}
			}
			if (count >= countMax) { 							//confronto quante volte ho visto l'elemento in posizione i con il massimo attuale. se così dico che il massimo valore di volte 
				countMax = count;									//--->che ho visto un intero è il numero di volte che ho visto l'intero in posizione i
				posMax = i;												//setto la posizione della moda al valore i
				modeValue = input[i]; 									//setto la moda al valore che c'è in posizione i
			}
			//input[i] = Integer.MIN_VALUE;
		}
		return modeValue; 												//il valore della moda sarà contenuto in modeValue
	}
	

}
