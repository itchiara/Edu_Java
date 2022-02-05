package it.epicode.Scuola;

import java.time.LocalDate;

public class Start {

	public static void main(String[] args) {
		Docente docenteA = new Docente("Carlo", "Rossi", true);
		
		Corso corsoA = new Corso("inglese", 50, Livello.AVANZATO, 200);
		Abilità abil1 = new Abilità("matematica", "scientifico", Livello.GURU);
		Abilità abil2 = new Abilità("fisica", "scientifico", Livello.PRINCIPIANTE);
		Abilità abil3 = new Abilità("greco", "umanistico", Livello.INTERMEDIO);
		Abilità abil4 = new Abilità("informatica", "scientifico", Livello.PRINCIPIANTE);
		Abilità abil5 = new Abilità("latino", "umanistico", Livello.INTERMEDIO);
		EdizioneCorso edizioneA = new EdizioneCorso(corsoA, "ING-0107", LocalDate.of(2021, 05, 15), LocalDate.of(2021, 12, 15), docenteA, 20);
		Studente studente1 = new Studente("Mario", "Neri", LocalDate.of(1990, 06, 07), "MRINR54378EU");
		edizioneA.aggiungiStudenteIscritto(studente1);
		Studente studente2 = new Studente("Francesca", "Bianchi", LocalDate.of(1990, 03, 07), "FRCBNC5639EU");
		edizioneA.aggiungiStudenteIscritto(studente2);
		Studente studente3 = new Studente("Anna", "Verdi", LocalDate.of(1990, 01, 07), "NNVRD22P45Z");
		edizioneA.aggiungiStudenteIscritto(studente3);
		Studente studente4 = new Studente("Mattia", "Rossi", LocalDate.of(1990, 06, 07), "MTTRSS34P782");
		edizioneA.aggiungiStudenteIscritto(studente4);
		Studente studente5 = new Studente("Greta", "Grigi", LocalDate.of(1990, 10, 07), "GRTGRG19P4783");
		edizioneA.aggiungiStudenteIscritto(studente5);
		Studente studente6 = new Studente("Mario", "Bassi", LocalDate.of(1990, 04, 10), "MRIBSS82UJ");
		edizioneA.aggiungiStudenteIscritto(studente6);
		Studente studente7 = new Studente("Marta", "Alti", LocalDate.of(1990, 12, 01), "MRTALT543VD");
		edizioneA.aggiungiStudenteIscritto(studente7);
		Studente studente8 = new Studente("Sara", "Gialli", LocalDate.of(1990, 03, 17), "SRTGLL43I");
		edizioneA.aggiungiStudenteIscritto(studente8);
		Studente studente9 = new Studente("Tommaso", "Azzurri", LocalDate.of(1990, 12, 07), "TMMSZZRU89");
		edizioneA.aggiungiStudenteIscritto(studente9);
		Studente studente10 = new Studente("Pit", "Bull", LocalDate.of(1990, 11, 07), "PTBLL584F9N");
		edizioneA.aggiungiStudenteIscritto(studente10);
		
		
		studente1.abilità[0] = abil1;
		studente2.abilità[0] = abil2;
		studente3.abilità[0] = abil3;
		studente4.abilità[0] = abil4;
		studente5.abilità[0] = abil5;
		studente6.abilità[0] = abil1;
		studente7.abilità[0] = abil2;
		studente8.abilità[0] = abil3;
		studente9.abilità[0] = abil5;
		studente10.abilità[0] = abil5;
		edizioneA.report();
	}
	
}
