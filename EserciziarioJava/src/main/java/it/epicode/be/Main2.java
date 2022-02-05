package it.epicode.be;

public class Main2 {

	public static void main(String[] args) {
		Madre madre = new Madre();
		System.out.println("MADRE MADRE");
		System.out.println(madre.email);
		
		
		Figlia figlia = new Figlia();
		System.out.println("FIGLIA FIGLIA");
		System.out.println(figlia.email);
		System.out.println(figlia.indirizzo);
		System.out.println(figlia.nome);
		
		Madre m = new Figlia();
		System.out.println("MADRE FIGLIA");
		System.out.println(m.nome);
		System.out.println(m.email);
		System.out.println(m.indirizzo);
		m.mangia();
		m.stira();
		m.beve();
		m.respira();
		
		
		if (m instanceof Figlia && m instanceof Madre) {
			System.out.println("ok");
		} 
		if( m instanceof Madre) {
			System.out.println("ma che cazzo");
		}
		
		Madre ma = (Figlia) new Figlia();
		System.out.println("MADRE CAST FIGLIA FIGLIA");
		if (ma instanceof Figlia) {
			System.out.println("non");	
		}
		
		if (ma instanceof Madre) {
			System.out.println("non ho capito nulla");	
		}
		
		Figlia figliaCast = (Figlia)m;
		
		if(figliaCast instanceof Figlia) {
			System.out.println("wee");
		}
		
		if(figliaCast instanceof Madre) {
			System.out.println("wee boooooo");
		}
		
		//cosa succede con i cast?
		//a quali variabili accedo?
		Madre madreCast = (Figlia) new Madre();
		System.out.println("MADRE CAST FIGLIA MADRE");
		madreCast.respira();
		
		//Figlia figliaCast = (Madre)new Figlia(); 	NO	
		
	}

}
