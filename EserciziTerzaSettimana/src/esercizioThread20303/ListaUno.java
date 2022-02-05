package esercizioThread20303;

public class ListaUno extends ThreadPrincipale implements Runnable {
	//List<Integer> numeri1 = new ArrayList<Integer>();
	private int somma;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i ++) {
			somma += lista.get(i);
			
		}
		System.out.println("La somma del primo terzo è: " + somma);
	}
	
	public int getSomma() {
		return somma;
	}

}
