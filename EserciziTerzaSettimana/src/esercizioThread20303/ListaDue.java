package esercizioThread20303;

public class ListaDue extends ThreadPrincipale implements Runnable{
	//List<Integer> numeri2 = new ArrayList<Integer>();
	private int somma;
	
	@Override
	public void run() {
		for ( int i = 1000; i < 2000; i ++) {
			somma += lista.get(i);
			
		}
		System.out.println("La somma del secondo terzo è: " + somma);
	}
	
	public int getSomma() {
		return somma;
	}
}
