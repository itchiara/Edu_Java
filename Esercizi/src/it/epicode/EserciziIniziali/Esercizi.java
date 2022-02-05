package it.epicode.EserciziIniziali;

public class Esercizi {

	public static void main(String[] args) {
		int[] myArray = { 24, 17, 8, 90, 5, 71 };
		int ripetizioniMax = 0;
		int numRipet = 0;

		for (int i = 0; i < myArray.length; i++) {
			 int volte = 0;
			 for(int j = 0; j < myArray.length; j++) {
				 if(myArray[j] == myArray[i]) {
					 volte = volte + 1;
				 } if (volte > ripetizioniMax) {
					 ripetizioniMax = volte;
					 numRipet = myArray[i];
				 }
			 }
		} 
		System.out.println("numero ripetuto: " + numRipet + "numero volte di ripetizioni: " + ripetizioniMax);
		

		int[] myArray2 = {24, 17, 8, 90, 5, 71};
		int index = 3;
		
		for ( int i = index; i < myArray2.length; i++) {
			myArray2[i] = myArray2[i + 1];
		}
	}

	public static boolean checkIfPresent(int[] arr, int number) {
		int length = arr.length;
		boolean findNum = true;
		
		for (int i = 0; i < length; i++) {
			if(number == arr[i]) {
				return true;
			}
		}
		return findNum;
	}
	
	public static int indexOfMyValue(int[] arr, int number) {		
		for (int i = 0; i < arr.length; i++) {
			if(number == arr[i]) {
				return i;
			} 
		}
		return -1;
	}
	
	public static int maxNumberOfArray(int[] arr, int number) {
		int maxNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			} 
		}
		return maxNum;
	}
	
	public static int minNumberOfArray(int[] arr, int number) {
		int minNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < minNum) {
				minNum = arr[i];
			} 
		}
		return minNum;
	}

}
