package it.epicode.Scuola;
import java.time.LocalDate;

public class EdizioneCorso {
	public Corso corso;
	public String codice;
	public LocalDate dataPartenza;
	public LocalDate dataTermine;
	public int numMaxStud; 
	public Docente docente;
	public Studente studentiIscritti[];
	
	public EdizioneCorso(Studente[] studentiIscritti) {
		this.studentiIscritti = studentiIscritti;
	}

	public EdizioneCorso(Corso corso, String codice, LocalDate dataPartenza, LocalDate dataTermine, Docente docente, int maxStud) {
		this.corso = corso;
		this.codice = codice;
		this.dataPartenza = dataPartenza;
		this.dataTermine = dataTermine;
		this.docente = docente;
		this.numMaxStud = maxStud; //!!!!
		this.studentiIscritti = new Studente[numMaxStud]; //!!!!
	}

	public EdizioneCorso(Corso corso, String codice, LocalDate dataPartenza, LocalDate dataTermine,
			Docente docente, Studente[] studentiIscritti) {
		this.corso = corso;
		this.codice = codice;
		this.dataPartenza = dataPartenza;
		this.dataTermine = dataTermine;
		this.docente = docente;
		this.numMaxStud = studentiIscritti.length;
		this.studentiIscritti = studentiIscritti;
	}
	
	public boolean aggiungiStudenteIscritto(Studente stud) {
		for(int i = 0; i < this.studentiIscritti.length; i++) {
			if(studentiIscritti[i] == null) {
				studentiIscritti[i] = stud;
				return true; //esce dalla funzione
			}
		} 
		return false;
	}
	
	public boolean aggiungiStudenteIscritto2(Studente stud) {
		boolean found = false;
		for(int i = 0; i < this.studentiIscritti.length; i++) {
			if(studentiIscritti[i] == null) {
				studentiIscritti[i] = stud;
				found = true; //esce dalla funzione
				break; //interrompe il ciclo for, altrimenti iscrive lo studente in tutti i null
			}
		} 
		return found;
	}
	
	public void report() {
		System.out.println(codice + " " + dataPartenza + " " + docente.nome + " " + docente.cognome + " " + corso.nome);
		for (int i = 0; i < studentiIscritti.length; i++) {
			if(studentiIscritti[i] != null ) {
				System.out.println(studentiIscritti[i].nome + " " + studentiIscritti[i].cognome);
				for(int j = 0; j < studentiIscritti[i].abilità.length; j++) {
					if(studentiIscritti[i].abilità[j] != null) {
						System.out.println(studentiIscritti[i].abilità[j].nome);
						System.out.println(studentiIscritti[i].abilità[j].livello);
					}
				}
			}
		}
	}
}
