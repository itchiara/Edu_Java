package threads0303;

public class Bagno {
	private Object portiere; //possessore del lock
	
	public Bagno(Object portiere) {
		this.portiere = portiere;
	}
	public synchronized void usaBagno() { //solo una thread alla volta può entrare e il possessore del lock è quello che usa la funzione
		int y = 9;
		synchronized (portiere) { //non possono entrare due thread alla volta
			
		}
		
		synchronized (Bagno.class) { //c'è un portiere per tutti i metodi
			
		}
	}
}
