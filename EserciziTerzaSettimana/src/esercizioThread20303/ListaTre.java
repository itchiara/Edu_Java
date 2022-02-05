package esercizioThread20303;

public class ListaTre extends ThreadPrincipale implements Runnable{
	//List<Integer> numeri3 = new ArrayList<Integer>();
	private int somma;
	
	@Override
	public void run() {
		for ( int i = 2000; i < 3000; i ++) {
			somma += lista.get(i);
			
		}
		System.out.println("La somma del terzo terzo è: " + somma);
	}
	
	public int getSomma() {
		return somma;
	}
	
}
