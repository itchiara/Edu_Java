package it.adja.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {

	static {
		try {
			Class.forName("org.postgresql.Driver");   // carico il driver

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	Connection conn;

	public Connection getConnessione() throws SQLException {
		if (conn == null || conn.isClosed()) {
			conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/esercitazione4?currentschema=negozio&user=postgres&password=epicode");
		}
		return conn;
	}
}