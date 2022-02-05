package eserciziTre0203;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Officina officina = new Officina();
		Apparecchiatura[] macchine = officina.getListaApparecchiatura(); //NOOOOOO
		//sto andando a lavorare con dettagli interni dell'officina
		//mi interessa registrare una nuova macchina
		
		officina.aggiungiApparecchiatura(null);
	}

}
