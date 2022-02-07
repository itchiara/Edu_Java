package it.adja.it;

import java.sql.SQLException;

public class MainEsercizi {

	public static void main(String[] args) {
		
	    ConnectionHandler c1 = new ConnectionHandler();

		EserciziDiGruppo es= new EserciziDiGruppo(c1);
		
		try {
	//		es.creaDatabase();
			es.creaTabella();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
