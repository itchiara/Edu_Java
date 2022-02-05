package it.epicode.EserciziIniziali;

public class ContoCorrente {
	public double saldo;

	public ContoCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposita(double versamento) {
		saldo = saldo + versamento;
		return saldo;
	}
	
	public double ritira(double prelievo) {
		saldo = saldo - prelievo;
		return saldo;
	}
	
	/*
	 * ContoCorrente p = new ContoGold(99);
	 * ContoGold p = new ContoGold(99);
	 * gestisciConto(p);
	 * 
	 * Class cl = p.getClass();
	 * String nome = cl.getName();
	 * boolean is ExactlyContoCorrente = (o.getClass() == ContoCorrente.class);
	 * boolean isContoCorrente = p instanceof ContoCorrente;
	 */
}
