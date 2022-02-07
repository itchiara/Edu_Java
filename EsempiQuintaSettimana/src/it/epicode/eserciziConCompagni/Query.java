package it.epicode.eserciziConCompagni;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {

	ConnectionHandler c1;

	public Query(ConnectionHandler c1) {

		this.c1 = c1;
	}

	static final String QUERY_DATABASE = "CREATE DATABASE db";
	static final String QUERY_TABELLA = "CREATE TABLE animale (nome VARCHAR, razza VARCHAR, sesso CHAR)";

	public void creaDatabase() throws SQLException {
		try (Connection connessione = c1.getConnessione(); Statement st = connessione.createStatement();) {
			st.execute(QUERY_DATABASE);
		}
	}

	public void creaTabella() throws SQLException {
		try (Connection connessione = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/db?currentschema=public&user=postgres&password=epicode");
				Statement st = connessione.createStatement();) {
			st.execute(QUERY_TABELLA);
		}
	}
}
