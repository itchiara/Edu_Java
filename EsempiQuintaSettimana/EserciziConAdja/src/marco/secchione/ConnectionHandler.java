package marco.secchione;
import java.sql.Connection;
import java.sql.DriverManager; //L'interfaccia JDBC è contenuta nel package java.sql
import java.sql.SQLException;

public class ConnectionHandler {
	/** Passaggi per stabilire un connessione JDBC 
	  − Importa pacchetti JDBC 
	  - Registra driver JDBC: carica l'implementazione del driver nella memoria della JVM
	  in modo che possa soddisfare le richieste JDBC. 
	  - URL del database: indirizzo che punta al database a cui si desidera connettersi;
	  - Crea oggetto connessione: infine invoca il metodo getConnection() dell'oggetto DriverManager 
	  per effettuare la connessione al database. */
	
	
	/** Il blocco statico è anche noto come blocco di inizializzazione statico o blocco 
	 * di inizializzazione statico in Java. Il blocco statico viene eseguito solo una volta da JVM. 
	 * I vantaggi del blocco di inizializzazione statico in Java sono i seguenti: 
	 * 1. I blocchi di inizializzazione statici vengono utilizzati per descrivere la 
	 * logica che si desidera seguire durante il caricamento della classe. 
	 * 2. Sono usati per inizializzare le variabili statiche.
	 * 3. I blocchi statici vengono eseguiti prima del blocco di istanza.
	 * 4. I blocchi statici vengono eseguiti quando la classe viene caricata in memoria 
	 * mentre i blocchi di istanza vengono eseguiti solo quando viene creata l'istanza della classe.
	 * 5. 
	 */
	static {
		try {
			Class.forName("org.postgresql.Driver"); // carico il driver
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		}	
	/** Dopo aver caricato il driver, si può stabilire una connessione utilizzando il 
	 * metodo DriverManager.getConnection(). E' possibile utlizzare 
	 * DriverManager.getConnection() nei seguenti modi: 
	 * getConnection (URL stringa) 
	 * getConnection(Stringa URL, Proprietà prop) 
	 * getConnection(Stringa URL, Stringa utente, Stringa password)
	 * Di seguito si è utilizzato il primo.
	 */
	Connection conn; 
	public Connection getConnessione() throws SQLException {// Con questa struttura evitiamo problemi con finally e chiusura connessione
		if (conn == null || conn.isClosed()) {
			conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/esercitazione4?currentschema=negozio&user=postgres&password=epicode");
		}
		return conn;
	}
}