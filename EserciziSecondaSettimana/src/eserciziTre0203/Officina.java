package eserciziTre0203;

public class Officina {
	
	private Apparecchiatura[] listaApparecchiatura = new Apparecchiatura[10];
	
	public double riceveMacchina(Apparecchiatura macchina) {
		double numOrd = macchina.getNumeroOrdine();
		numOrd = Math.floor(Math.random()) * 100;
		return numOrd;
	}
	
	public boolean aggiungiApparecchiatura(Apparecchiatura a) {
		for (int i = 0; i < listaApparecchiatura.length; i++) {
			if(listaApparecchiatura[i] == null) {
				listaApparecchiatura[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public double calcolaPrezzoLavorazione(Apparecchiatura app) {
		return app.costoTotale();
	}
	
	public Apparecchiatura[] getListaApparecchiatura() {
		return listaApparecchiatura;
	}
	
//	public Apparecchiatura[] getListaApparecchiatura() {
//		return listaApparecchiatura;
//	}
	
	
	
	
//	macchina[1] = lavorazione[1].tipo + lavorazione[2].tipo + lavorazione[3].tipo + 
//			lavorazione[1].costo + lavorazione[2].costo + lavorazione[3].costo
}

//mi faccio dare getter di array di macchine


