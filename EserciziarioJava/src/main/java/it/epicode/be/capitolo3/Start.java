package it.epicode.be.capitolo3;


public class Start {

	public static void main(String[] args) {
//		ContoBancario harrysChecking = new ContoBancario(12);
//		harrysChecking.versa(1000, 12);
//		harrysChecking.preleva(500, 12);
//		harrysChecking.preleva(400, 13);
//		harrysChecking.stampaSaldoRimanente();
//		
//		ContoBancario momsSaving = new ContoBancario(8, 100);
//		momsSaving.versa(2300, 9);
//		momsSaving.preleva(120, 8);
//		momsSaving.calcolaInteresse(10, 8);
//		momsSaving.stampaSaldoRimanente();
		
//		Cellulare c1 = new Cellulare(5);
//		c1.ricarica(12);
//		c1.chiama(100);
//		c1.numero404();
//		c1.getNumeroChiamate();
//		c1.chiama(5.4);
//		c1.numero404();
//		c1.getNumeroChiamate();
//		c1.azzeraChiamate();
//		c1.getNumeroChiamate();
//		
		Automobile a1 = new Automobile(5);
		a1.addGas(20);
		a1.drive(3);
		a1.getGas();
		a1.addGas(17);
		a1.drive(4);
		
		Automobile a2 = new Automobile(20);
		a2.setTipoCarburante(TipoCarburante.BENZINA);
		System.out.println(a2.getTipoDiCarburante());
		a2.usaGasolio();
		a2.addGas(50);
		a2.drive(30);
		
		DistributoreBenzina distributore1 = new DistributoreBenzina(1.5, 1.3);
		distributore1.rifornisciGasolio(1000);
		
		distributore1.vendi(21, a2);
		System.out.println(a2.getGas());
		
		distributore1.aggiornaBenzina(1.2);
		distributore1.vendi(35, a1);
		System.out.println(a1.getGas());
		
		distributore1.rifornisciBenzina(10);
		
		Dipendente d1 = new Dipendente("Mattia", 1200);
		d1.aumento(10);
		System.out.println(d1.getStipendio());
	}

}
