package esercizi0202;

public class Dipendente {
	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio = stipendioBase;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	private double oreStraordinario;
	
	
	public double getOreStraordinario() {
		return oreStraordinario;
	}

	public void setOreStraordinario(double oreStraordinario) {
		this.oreStraordinario = oreStraordinario;
	}

	public static double getStipendioBase() {
		return stipendioBase;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public Dipendente() {}

	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {
		this.matricola = matricola;
		//this(matricola, dipartimento); //posso fare anche così
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}

	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}
	
	public void stampaDatiDipendente() {
		System.out.println("Il dipendente ha matricola: " + matricola);
		System.out.println("Il dipendente ha uno stipendio base di: " + stipendioBase);
		System.out.println("Il dipendente ha uno stipendio di: " + stipendio);
		System.out.println("Il dipendente ha un importo orario degli straordinari di: " + importoOrarioStraordinario);
		System.out.println("Il dipendente ha un livello: " + livello);
		System.out.println("Il dipendente è nel dipartimento: " + dipartimento);
		System.out.println("#########################");
	}
	
	public Livello promuovi() {
		switch(livello) {
		case OPERAIO:
			livello = Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			break;
		case IMPIEGATO:
			livello = Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
			break;
		case QUADRO:
			livello = Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
			break;
		case DIRIGENTE:
			System.out.println("Errore: il dirigente non può salire di livello.");
		} return livello;
	}
	
	public double calcolaStipendioTotale() {
		return stipendio + oreStraordinario * importoOrarioStraordinario;
	}
	public double calcolaStipTotale(double oreStraor) {
		return stipendio + oreStraor * importoOrarioStraordinario;
	}
	public static double calcolaPaga(Dipendente dip) {
		return dip.getStipendio();
	}
	
	public static double calcolaPagaStraor(Dipendente dip, double oreStraordinario) {
		return dip.getStipendio() + oreStraordinario * dip.importoOrarioStraordinario;
	}
}
