package it.epicode.eserciziConCompagni;

import java.sql.SQLException;

public class Start {

public static void main(String[] args) {
		
	    ConnectionHandler c1 = new ConnectionHandler();

	    Query es= new Query(c1);
		
		try {
	//		es.creaDatabase();
			es.creaTabella();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
