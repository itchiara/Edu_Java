package esercizi0202;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente operProd1 = new Dipendente("BUV78", Dipartimento.PRODUZIONE);
		Dipendente operProd2 = new Dipendente("NIM342", Dipartimento.PRODUZIONE);
		Dipendente impAmm = new Dipendente("XSXA09", 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dirVend = new Dipendente("NKMO890", 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		operProd1.promuovi();
		impAmm.promuovi();
		Dipendente[] x = {operProd1, operProd2, impAmm, dirVend};
		for (int i = 0; i < x.length; i++) {
			x[i].stampaDatiDipendente();
		}
		double sommaStipendi = 0;
		for (int i = 0; i < x.length; i++) {
			x[i].setOreStraordinario(5);
			sommaStipendi += x[i].calcolaStipendioTotale();
		}
		System.out.println("La somma degli stipendi è: " + sommaStipendi);
//		sommaStipendi = 0;
		for (int i = 0; i < x.length; i++) {
			sommaStipendi += Dipendente.calcolaPagaStraor(x[i], 5);
			sommaStipendi += x[i].calcolaStipTotale(5.0);
		}
//		operProd1.stampaDatiDipendente();
//		operProd2.stampaDatiDipendente();
//		impAmm.stampaDatiDipendente();
//		dirVend.stampaDatiDipendente();
		
		double c1 = Dipendente.calcolaPagaStraor(operProd1, 5);
		double c2 = Dipendente.calcolaPagaStraor(operProd2, 5);
		double c3 = Dipendente.calcolaPagaStraor(impAmm, 5);
		double c4 = Dipendente.calcolaPagaStraor(dirVend, 5);

		System.out.println("La somma degli stipendi è " + (c1 + c2 + c3 + c4) + " euro.");
	}

}
